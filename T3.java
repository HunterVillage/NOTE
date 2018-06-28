/**
 * 
 */
package forbasic;

/**
 * @author Administrator
 * @title 购票 高并发资源共享思路  实现Runnable接口就可以实现资源共享
 * @Date 2018年6月28日
 */
/*
 * 
 
public class T3 extends Thread{
	/*
	 * Thread线程时间没有实现资源共享
	 
    private int num=5;
    public void run(){
    	for(int i=0;i<10;i++){
    		if(this.num>0){
    			System.out.println(Thread.currentThread().getName()+"买票"+this.num--);
    		}
    		
    	}
    }
    public static void main(String args[]){
    	//定义三个线程 并开启
        T3 t1=new T3();
    	   t1.setName("窗口1");
    	T3 t2=new T3();
    	   t2.setName("窗口2");
    	T3 t3=new T3();
    	   t3.setName("窗口3");
    	   
    	   t1.start();
    	   t2.start();
    	   t3.start();
          	
    }

}
*/
public class T3 implements Runnable{

	/* (non-Javadoc)
	 * @see java.lang.Runnable#run()
	 */
	private int num=5;
	@Override
	public void run() {
		// TODO Auto-generated method stub
		/*for(int i=0;i<10;i++){
			System.out.println(Thread.currentThread().getName()+"买票"+this.num--);
			
			if(num==0){
				System.out.println("----------");
				//break;
			}
		}*/
		do{
			System.out.println(Thread.currentThread().getName()+"买票"+this.num--);
		}while(num>0);
		
	}
	public static void main(String args[]){
		T3 t=new T3();
		Thread th1=new Thread(t);
		th1.setName("售票口一");
        Thread th2 = new Thread(t);    //线程二
        th2.setName("售票口二");
        Thread th3 = new Thread(t);    //线程三
        th3.setName("售票口三");
        
        th1.start();
        th2.start();
        th3.start();
		
		
	}
	
}

/**
 * 
 */
package forbasic;

/**
 * @author Administrator
 * @title 实现Runable方法实现线程
 * @Date 2018年6月28日
 */
public class T2 {
	public static void main(String args[]){
	Tmo s=new Tmo("打爆");
	Thread t1=new Thread(s);
	//t1.setName("基甲基");
	t1.start();
}
}
class Tmo implements Runnable{
	
	public Tmo(String name) {
		super();
		// TODO Auto-generated constructor stub
	}
	/* (non-Javadoc)
	 * @see java.lang.Runnable#run()
	 */
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<10;i++){
			System.out.println(Thread.currentThread().getName()+" "+i);
		}
		
	}
	
}

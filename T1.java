/**
 * 
 */
package forbasic;

/**
 * @author Administrator
 * @title 继承Thread的方法创建线程
 * @Date 2018年6月28日
 */
public class T1 {
	public static void main(String args[]){
    Thread t11=new Tm("垃圾");//父类引用子类对象
     t11.start();
	}
}
class Tm extends Thread{
	
	 /**
	 * @param name
	 */
	public Tm(String name) {//继承父类的参数,也就是无餐
		super(name);//构造方法用自己的name
		// TODO Auto-generated constructor stub
	}
	public void run(){
		
		for(int i=0;i<100;i++){
			System.out.println(Thread.currentThread().getName()+"贾克斯"+i);
		}
	}
}


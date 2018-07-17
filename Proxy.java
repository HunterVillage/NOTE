/**
 * 
 */
package forbasic;

/**
 * @author Administrator
 * @title name
 * @Date 2018年7月3日
 */
public class Proxy {
	/*
	 * 代理模式
	 */
	public static void main(String args[]){
		
		Image image=new ProxyImage("julia");
		//图像将从磁盘加载
		image.display();
		System.out.println(" ");
		image.display();
		
	}

}

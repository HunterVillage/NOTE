/**
 * 
 */
package forbasic;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Administrator
 * @title name
 * @Date 2018年6月25日
 * 用来统计一串字符中的字母。数字。空格的数量
 */
public class A {
	public static void main(String args[]){
		int numcount=0;
		int charcount=0;
		int spacecount=0;
		int othercount=0;

		 Scanner sc=new Scanner(System.in);
		 System.out.println("请随意输入一串字符");
		 
		 String a=sc.nextLine();
		 System.out.println(a);
		 char[] c=a.toCharArray();
		 for(int i=0;i<c.length;i++){
			 //汉字的unicode范围是：0x4E00~0x9FA5
			 if(Character.isLetter(c[i])&&!((c[i]>= 0x4e00)&&(c[i]<= 0x9fbb))){//字母
				 charcount++;
			 }
			 else if(Character.isDigit(c[i])){
				 numcount++;
			 }
			 else if(Character.isWhitespace(c[i])){
				 spacecount++;
			 }
			 else{
				 othercount++;
			 }
		 }
		 System.out.println("数字为："+numcount+" "+"字母为:"+charcount+" "+"空格为："+spacecount+" "+"其他为:"+othercount);
		 
		 
	/*
	 int x=40;
	      if( x == 10 ){
	         System.out.print("Value of X is 10");
	      }
	      else if( x == 20 ){
	         System.out.print("Value of X is 20");
	      }
	      else if( x == 30 ){
	         System.out.print("Value of X is 30");
	      }else{
	         System.out.print("这是 else 语句");
	      }
	* 
	 */
	}

	/**
	 * 
	 */
	public A() {
		// TODO Auto-generated constructor stub
	}

}

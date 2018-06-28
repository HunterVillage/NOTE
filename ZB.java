/**
 * 
 */
package forbasic;

/**
 * @author Administrator
 * @title 
 * @Date 2018年6月28日
 */
public class ZB {
	public static void main(String args[]){
		/*
		 * 基本数据类型比较的是值
		 * 非基本数据类型比较内存地址
		 * 变量str1中存储的是它指向的对象在内存中的存储地址，并不是“值”本身,不是直接存储值
		 */
		int n=3;
        int m=3;
        
        System.out.println(n==m);//true
        
        String str = new String("hello");
        String str1 = new String("hello");
        String str2 = new String("hello");
        
        System.out.println(str1==str2);//false
        String str10;
        str10=str1 = str;
        str2 = str;
        System.out.println(str10==str2);//true
		
System.out.println("-------------------------------");
/*
 * String,date等类方法对equals()方法进行重写，比较的是值 否则比较内存地址
 */
        String str3 = new String("hello");
        String str4 = new String("hello");
        
        System.out.println(str3.equals(str4));//true
	}

}

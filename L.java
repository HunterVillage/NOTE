/**
 * 
 */
package forbasic;

/**
 * @author Administrator
 * @title name
 * @Date 2018年7月3日
 * @说明:枚举类型的构造方法要写在实例对象的后边，否则会编译出错
 */
public class L {
	
	 public static void main(String args[]){
		
		 FF f1=FF.FRIDAY;
		 
		 System.out.println(f1.index);
	 }
	 //定义一个星期的枚举类型
	  
	 enum FF{
		SUNDAY("周日",7),MONDAY("周一",1),
		THUSDAY("周二",2),WEDNESDAY("周三",3),
		THURSDAY("周四",4),FRIDAY("周五",5),
		SATERDAY("周六",6);
		private String name;
		private int index;
		/**
		 * @param name
		 * @param index
		 */
		private FF(String name, int index) {
			this.name = name;
			this.index = index;
		}
		
}
}
class Day{
	    public static final int MONDAY =1;

	    public static final int TUESDAY=2;

	    public static final int WEDNESDAY=3;

	    public static final int THURSDAY=4;

	    public static final int FRIDAY=5;

	    public static final int SATURDAY=6;

	    public static final int SUNDAY=7;
}



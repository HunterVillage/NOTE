/**
 * 
 */
package forbasic;

/**
 * @author Administrator
 * @title name
 * @Date 2018年7月16
 * @Target 使用创建的ShapeFactory（工厂类）使用该工厂，通过传递类型信息来获取实体类的对象
 */
public class FactoryPatternDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ShapeFactory sf=new ShapeFactory();
		//获取Circle的对象，并调用他的draw()
		Shape s1=sf.getShape("circle");
		//调用Circle的draw()
        s1.draw();
        
      //获取 Rectangle 的对象，并调用它的 draw 方法
        Shape s2=sf.getShape("");
        s2.draw();
        
      //获取 Square 的对象，并调用它的 draw 方法
        Shape s3=sf.getShape("");
        s3.draw();
	}

}

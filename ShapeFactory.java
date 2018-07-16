/**
 * 
 */
package forbasic;

/**
 * @author Administrator
 * @title name
 * @Date 2018年7月16日
 * @Target 创建一个工厂，生成基于给定信息的实体类
 */
public class ShapeFactory {
	//使用getshape()获取形状类型的对象
    public Shape getShape(String shapetype){
		if(shapetype==null){
			return null;
		}
		if(shapetype.equalsIgnoreCase("circle")){
			return new Circle();
		}
		else if(shapetype.equalsIgnoreCase("rectangle")){
			return new Rectangle();
		}
		else if(shapetype.equalsIgnoreCase("quare")){
			return new Square();
		}
		return null;
		
    	
    }

}

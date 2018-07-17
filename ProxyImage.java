/**
 * 
 */
package forbasic;

/**
 * @author Administrator
 * @title name
 * @Date 2018年7月3日
 */
public class ProxyImage implements Image {
	
	private RealImage realImage;
	private String fileName;

	@Override
	public void display() {
		// TODO Auto-generated method stub	
		if(realImage==null){
			realImage=new RealImage(fileName);
			System.out.println("我是新建的，所以我验证一下");
		}
		realImage.display();
	}
	public ProxyImage(String fileName) {
		super();
		this.fileName = fileName;
	}
	

}

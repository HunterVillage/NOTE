/**
 * 
 */
package forbasic;

/**
 * @author Administrator
 * @title name
 * @Date 2018年7月3日
 */
public class RealImage implements Image {
	
	private String fileName;//私有字符串
	public RealImage(String fileName) {
		super();
		this.fileName = fileName;
		loadFromDisk(fileName);
	}
	private void loadFromDisk(String fileName2) {
		// TODO Auto-generated method stub
		System.out.println("Dislaying="+fileName);	
	}
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("jiab="+fileName);
	}

}

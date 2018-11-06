package TestFle;

public class SonSuper extends FatherSuper{
    //子类
    private String aa;
    private String bb;

    public SonSuper(String aa,String bb){
        //如果不写super就会编译出错  且传参是调用父类的构造方法 相反this是本类
        super(aa,bb);
    }

    public String getAa(){
        return this.aa;
    }
    public String getBb(){
        return this.bb;
    }



}

package TestFle;

public class FatherSuper {
    //定义一个父类
    private String astr;
    private String bstr;

    public FatherSuper(String astr,String bstr) {
        this.astr = astr; //this指的是本类，在这里就是A
        this.bstr = bstr;
    }

    public String getAstr() {
        return this.astr;
    }

    public String getBstr() {
        return this.bstr;
    }
}

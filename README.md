**1.mysql 8.0.11 新建数据库修改密码命令（标点符号为英文）**

ALTER USER 'root'@'localhost' IDENTIFIED BY 'Password1';

*****

**2.熟悉设计模式之单例实现与理解**

普通单例：

`public class SSS{`

	//创建SSS的一个对象
	private static SSS instance=new SSS();
	//让构造函数为private 这样就不会被实例化
	private SSS() {};
	
	//获取唯一可用对象
	public static SSS getInstance() {
		return instance;	
	}
	public void message() {
		System.out.println("Hello world!");
	}

`}`

`public class SSSdemo {`

	public static void main(String[] args) {
	//编译时错误：构造函数 SSS() 是不可见的
	 //SSS object = new SSS();
		SSS s=SSS.getInstance();
		
		//显示消息
		s.message();		
	
	}

`}`

①线程安全的懒汉式（因为加了synchronized关键字，即可多线程安全）

```
public class Singleton {  
    private static Singleton instance;  
    private Singleton (){}  
    public static synchronized Singleton getInstance() {  
    if (instance == null) {  
        instance = new Singleton();  
    }  
    return instance;  
    }  
} 
```

优点:第一次调用才初始化，避免内存浪费.

缺点:必须加锁才能保证线程安全的单例，但是加锁会影响效率.

lazy-loading:yes.

②饿汉式()

```
public class Singleton {  
    private static Singleton instance = new Singleton();  
    private Singleton (){}  
    public static Singleton getInstance() {  
    return instance;  
    }  
}  
```

优点:没有加锁,执行效率高

缺点:类加载时就初始化，浪费内存，容易产生垃圾对象，基于classloder机制避免了多线程同步问题.

③双检锁/双重校验锁(double-checked locking)

```
public class Singleton {  
    private volatile static Singleton singleton;  
    private Singleton (){}  
    public static Singleton getSingleton() {  
    if (singleton == null) {  
        synchronized (Singleton.class) {  
        if (singleton == null) {  
            singleton = new Singleton();  
        }  
        }  
    }  
    return singleton;  
    }  
}  
```

总结:lazy-loading:yes ,线程安全,多线程下可保证高性能.



④登记式/静态内部类

```
public class Singleton {  
    private static class SingletonHolder {  
    private static final Singleton INSTANCE = new Singleton();  
    }  
    private Singleton (){}  
    public static final Singleton getInstance() {  
    return SingletonHolder.INSTANCE;  
    }  
}   
```

总结:lazy-loading:yes .线程安全,达到和双检索一样的功效,但实现更简单,对静态域使用延迟处理化,

⑤枚举

```
public enum Singleton {  
    INSTANCE;  
    public void whateverMethod() {  
    }  
}  
```

总结:lazy-loding:NO,线程安全,它不仅能避免多线程同步问题，而且还自动支持序列化机制，防止反序列化重新创建新的对象，绝对防止多次实例化。不过，由于 JDK1.5 之后才加入 enum 特性，用这种方式写不免让人感觉生疏，在实际工作中，也很少用。
不能通过 reflection attack 来调用私有构造方法

******

**3.今天hexo上传博客到github报错：**

  block mapping entry; a multiline key may not be an 

  implicit key at line 4, column 1

解决:tags后面要有一个空格！！！title和date也一样

*****

**4.我把git本地仓库的文件删了,想git pull一份，是不行的:**

主要命令(整个目录):`git checkout .`

单个文件:git check 文件名称

其他命令:git status(查看工作区状态) 

***********

**5.关于hexo d -g(生成及部署)**

https://hexo.io/docs/generating.html
=======

*********************************

**6.关于设计模式之工厂模式的简述**

代码描述：首先建立一个Shape接口(形状),三个不同形状的实现类实现Shape接口,定义一个工厂类，其中定义Shape接口方法getShape()来获取形状类型的对象,public Shape getShape(String shapetype),最后用接口来接收一个工厂类返回的对象，例如Shape s1=sf.getShape("circle");

JDK体现:Calendar等。

*********************************

**7.Readme.md加图片格式**

![image] 小括号内加:仓库地址/raw/master/图片目录

*********************************

**8.代理模式与工厂模式理解**

①代理模式调用过程(代理类代替真正实现类):定义一个接口和两个实现类，一个真正的类，一个代理类，代理类中引入真正实现类并判断实现类是否为空，如果为空则新建真正实现类。

②工厂模式调用过程:定义一个父接口动作，实现父接口实现具体动作，比如接口画画，具体动作画圆 还是方等等,新建工厂类，新建类型为父接口的判断方法(参入判断到底想画什么)，如果传入参数为圆，则return new Circle()圆的实现类，此处用接口来接收return的实现类(理解为多态).

*********************************

**9.对java中return this的理解**

public class ThisT {

    /*
    return this:返回实例化对象
     */
     
    boolean real;

    public ThisT(){

    }

    public void setReal(boolean real){
        this.real=real;
    }

    public ThisT rel(boolean rel){
        this.setReal(rel);

        return this;
    }


}

总结:以上实例 如果调用rel(boolean rel)传递参数过来， rel(boolean rel)中的return this相当于给real变量赋值，因为setReal()为void没有返回值与return this 为 返回实例化对象，而此实例化对象则唯一属性为real。

*********************************

**10.git commit提交问题**

如果提交文件没有加注释则会报错  
类似于：Unable to create 'E:/xxx/.git/index.lock': File exists  
解决：rm -f .git/index.lock  
提交文件：git commit -m "注释"

*********************************

**10.关于String args[]**

public static void main(String args[])中String args[]表示一个字符串参数  
应用:本地编译源文件javac xxx.java,运行java xxx. System.out.print(args[0],args[1])  
注意:java xxx:xxx为包名.文件名 执行目录为此包的目录下


 

**1.mysql 8.0.11 新建数据库修改密码命令（标点符号为英文）**

ALTER USER 'root'@'localhost' IDENTIFIED BY 'Password1';

*****

**2.设计模式之单例实现与理解**

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

---------

**5.关于hexo d -g(生成及部署)**

https://hexo.io/docs/generating.html
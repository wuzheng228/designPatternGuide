package singleton.lazy.step2;

/**
 * 懒汉模式: 变量在需要的时候初始化,为了保证线程安全给判空过程加锁
 * 问题: 多个线程调用getInstance时每次都需要执行synchronized同步化方法，严重影响程序执行效率
 */
public class Singleton {
    private static Singleton instance = null;
    private Singleton() {

    }
    public static Singleton getInstance() {
        synchronized (Singleton.class){
            if (instance == null)
                instance = new Singleton();
        }
        return instance;
    }
}

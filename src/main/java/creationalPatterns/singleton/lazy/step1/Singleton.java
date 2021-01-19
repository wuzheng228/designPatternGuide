package singleton.lazy.step1;

/**
 * 懒汉模式: 变量在需要的时候初始化
 * 问题: 线程不安全
 */
public class Singleton {
    private static Singleton instance = null;
    private Singleton() {

    }
    public static Singleton getInstance() {
        if (instance == null)
            instance = new Singleton();
        return instance;
    }
}

package singleton.hungry;

/**
 * 饿汉模式： 变量在声明时边初始化
 */
public class Singleton {
    private static Singleton instance = new Singleton();
    private Singleton() {

    }
    public static Singleton getInstance() {
        return instance;
    }
}

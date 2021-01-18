package singleton.lazy;


/**
 * 静态内部类实现懒汉模式
 * 静态内部类在使用时才会加载
 */
public class Singleton {
    private static class SingletonHolder {
        public static Singleton instance = new Singleton();
    }

    private static Singleton getInstance() {
        return SingletonHolder.instance;
    }
}

package singleton.lazy.step4;

/**
 * 懒汉模式: 双检锁方式实现线程安全:
 * 变量在需要的时候初始化,
 * 为了保证线程安全给判空过程加锁，
 * 同步化之前加上一层检查，
 * instanc变量加上volatile关键字
 */
public class Singleton {
    private static volatile Singleton instance = null;
    private Singleton() {

    }
    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class){
                if (instance == null)
                    instance = new Singleton();
            }
        }
        return instance;
    }
}

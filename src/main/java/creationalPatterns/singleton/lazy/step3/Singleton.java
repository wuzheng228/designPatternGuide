package singleton.lazy.step3;

/**
 * 懒汉模式: 双检锁方式实现线程安全:变量在需要的时候初始化,为了保证线程安全给判空过程加锁，同步化之前加上一层检查
 * 问题: JVM底层可能会对代码指令重新排序，一些特殊情况会出现空指针
 */
public class Singleton {
    private static Singleton instance = null;
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

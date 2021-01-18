package factory;

import factory.MaskFactory;
import org.junit.Test;

public class Client {
    @Test
    public  void test() {
        // 简单工厂模式
        MaskFactory factory = new MaskFactory();
        System.out.println(factory.create("Surgical"));
        System.out.println(factory.create("N95"));
        // 工厂方法模式
        SurgicalFactory surgicalFactory = new SurgicalFactory();
        N95Factory n95Factory = new N95Factory();
        System.out.println(surgicalFactory.create());
        System.out.println(n95Factory.create());
    }
}

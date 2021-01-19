package abstractfactory;

import org.junit.Test;

public class Client {
    @Test
    public void test() {
        IFactory factory = new SurgicalFactory();
        System.out.println(factory.create());
        factory = new N95MaskFactory();
        System.out.println(factory.create());
    }
}

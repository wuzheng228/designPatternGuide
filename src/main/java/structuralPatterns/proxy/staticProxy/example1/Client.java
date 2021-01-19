package structuralPatterns.proxy.staticProxy;

import org.junit.Test;

public class Client {
    @Test
    public void test() {
        Person person = new Person();
        person.eat();
        person.sleep();

        // 使用代理
        PersonProxy personProxy = new PersonProxy(person);
        personProxy.eat();
        personProxy.sleep();
    }
}

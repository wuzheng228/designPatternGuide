package abstractfactory;

import factory.Mask;
import factory.SurgicalMask;

public class SurgicalFactory implements IFactory {
    @Override
    public Mask create() {
        return new SurgicalMask();
    }
}

package abstractfactory;

import factory.Mask;
import factory.N95Mask;

public class N95MaskFactory implements IFactory {
    @Override
    public Mask create() {
        return new N95Mask();
    }
}

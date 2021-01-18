package factory;

public class SurgicalFactory {
    public Mask create() {
        return new SurgicalMask();
    }
}

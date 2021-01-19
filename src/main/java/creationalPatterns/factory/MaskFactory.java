package factory;

public class MaskFactory {
    public Mask create(String type) {
        switch (type) {
            case "Surgical":
                return new SurgicalMask();
            case "N95":
                return new N95Mask();
            default:
                throw new IllegalArgumentException("Unsupported mask type");
        }
    }
}

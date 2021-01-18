package prototype;

public class Milk implements Cloneable{
    public String type;
    public boolean ice;

    @Override
    protected Milk clone() throws CloneNotSupportedException {
        return (Milk) super.clone();
    }
}

package structuralPatterns.decorator;

public class House implements IHouse{
    @Override
    public void live() {
        System.out.println("房屋的原有功能：居住功能");
    }
}

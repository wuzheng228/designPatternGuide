package structuralPatterns.decorator;

public class StickyHookDecorator implements IStickyHookHouse{
    private final IHouse house;

    

    @Override
    public void handThings() {
        System.out.println("有了粘钩功能后，新增了挂东西的功能");
    }

    @Override
    public void live() {
        house.live();
    }
}

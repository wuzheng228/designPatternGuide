package structuralPatterns.decorator;

public class Client {
    public static void main(String[] args) {
        IBeauty me = new Me();
        System.out.println("我本来的颜值:" + me.getBeautyValue());

        IBeauty meWithRing = new RingDecorator(me);
        System.out.println("戴上了戒指后，我的颜值：" + meWithRing.getBeautyValue());

        RingDecorator meWithRingRing = new RingDecorator(meWithRing);
        System.out.println("戴上两个戒指后，我的颜值：" + meWithRingRing.getBeautyValue());
    }
}

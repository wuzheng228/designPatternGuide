package builder;

public class User {
    private void buyMilkTea() {
        MilkTea milkTea = new MilkTea.Builder("原味").builde();
        show(milkTea);

        MilkTea chocolate = new MilkTea.Builder("巧克力味")
                .ice(false)
                .builde();
        show(chocolate);

        MilkTea strawberry = new MilkTea.Builder("草莓味")
                .size("大杯")
                .pearl(false)
                .ice(true)
                .builde();
        show(strawberry);
    }

    private void show(MilkTea milkTea) {
        String pearl;
        if (milkTea.isPearl()) {
            pearl = "加珍珠";
        } else {
            pearl = "不加珍珠";
        }
        String ice;
        if (milkTea.isIce()) {
            ice = "加冰";
        } else {
            ice = "不加冰";
        }
        System.out.println("一份" + milkTea.getSize() + "、"
                + pearl + "、"
                + ice + "的"
                + milkTea.getType() + "奶茶");
    }

    public static void main(String[] args) {
        User user = new User();
        user.buyMilkTea();
    }
}

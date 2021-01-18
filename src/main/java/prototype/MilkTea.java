package prototype;

/**
 * 原型模式相当于克隆对象
 */
public class MilkTea {
    public String type;
    public boolean ice;

    public MilkTea clone() {
        MilkTea milkTea = new MilkTea();
        milkTea.ice = this.ice;
        milkTea.type = this.type;
        return milkTea;
    }
}

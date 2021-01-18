package builder;

/**
 * 建造者模式：将复杂的构建与其表示相分离，同样的构建过程能创建不同的表示
 * 以制作一杯奶茶为例，它的制作过程是稳定的，奶茶的规格、是否加冰与珍珠可选
 */
public class MilkTea {
    private  String type;
    private  String size;
    private  boolean pearl;
    private  boolean ice;

    private MilkTea() {}

    private MilkTea(Builder builder) {
        this.type = builder.type;
        this.size = builder.size;
        this.ice = builder.ice;
        this.pearl = builder.pearl;
    }

    public String getType() {
        return type;
    }

    public String getSize() {
        return size;
    }

    public boolean isPearl() {
        return pearl;
    }

    public boolean isIce() {
        return ice;
    }

    public static class Builder {
        private final String type;
        private String size = "中杯";
        private boolean pearl = true;
        private boolean ice = false;

        public Builder(String type) { // 必须配置的属性
            this.type = type;
        }

        public Builder size(String size) {
            this.size = size;
            return this;
        }

        public Builder pearl(boolean pearl) {
            this.pearl = pearl;
            return this;
        }

        public Builder ice(boolean ice) {
            this.ice = ice;
            return this;
        }

        public MilkTea builde() {
            return new MilkTea(this);
        }
    }
}

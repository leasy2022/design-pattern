package c_适配器模式;

/**
 * @author wushang
 * @description:
 * @date 2020-08-15
 */
public class PowerAdapter implements PowerTarget {
    private PowerAdaptee powerAdaptee;

    public PowerAdapter(PowerAdaptee powerAdaptee) {
        this.powerAdaptee = powerAdaptee;
    }

    @Override
    public int output5V() {
        int output = powerAdaptee.output220V();
        System.out.println("电源适配器开始工作，此时输出电压是：" + output);
        output = output/44;
        System.out.println("电源适配器工作完成，此时输出电压是：" + output);
        return output;
    }
}

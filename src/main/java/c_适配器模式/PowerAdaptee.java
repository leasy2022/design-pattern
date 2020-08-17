package c_适配器模式;

/**
 * @author wushang
 * @description:
 * @date 2020-08-15
 */
//适配者角色: 已有功能，能输出220v的电
public class PowerAdaptee {
    private int output =  220;
    public int output220V() {
        System.out.println("电源输出电压：" + output);
        return output;
    }
}

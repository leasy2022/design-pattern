package c_适配器模式;

/**
 * @author wushang
 * @description:
 * @date 2020-08-15
 */
public class Client {
    public static void main(String[] args) {
        PowerTarget powerTarget = new PowerAdapter(new PowerAdaptee());
        System.out.println(powerTarget.output5V());
    }
}

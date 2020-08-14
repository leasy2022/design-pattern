package 策略模式.s2;

/**
 * @author wushang
 * @description:
 * @date 2020-08-14
 */
// 策略 A 的工厂类，用于创建策略 A
public class StrategyFactoryA implements StrategyFactory{
    @Override
    public Strategy create() {
        return new ConcreteStrategyA();
    }
}

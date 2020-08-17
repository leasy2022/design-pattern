package a_策略模式.s2;

import java.util.HashMap;
import java.util.Map;

/**
 * @author wushang
 * @description:
 * @date 2020-08-14
 */
public class Factory {
    // Map 的 key 为策略类型，value 为 策略的工厂类
    private static final Map<String, StrategyFactory> STRATEGY_FACTORIES = new HashMap<>();

    static {
        // 将各种实现类的工厂提前创建好放到 Map 中
        STRATEGY_FACTORIES.put("A", new StrategyFactoryA());
        STRATEGY_FACTORIES.put("B", new StrategyFactoryB());
    }

    public static Strategy getStrategy(String type) {
        if (type == null || type.isEmpty()) {
            throw new IllegalArgumentException("type should not be empty.");
        }
        // 根据 type 获取对应的策略工厂
        StrategyFactory strategyFactory = STRATEGY_FACTORIES.get(type);
        // 调用具体工厂类的 create 方法即可创建出相应的策略类
        return strategyFactory.create();
    }
}

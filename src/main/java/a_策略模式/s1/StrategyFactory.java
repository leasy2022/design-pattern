package a_策略模式.s1;

import java.util.HashMap;
import java.util.Map;

/**
 * @author wushang
 * @description:
 * @date 2020-08-14
 */
public class StrategyFactory {
    // Map 的 key 为策略类型，value 为具体的策略实现类
    private static final Map<String, Strategy> strategies = new HashMap<>();

    // 提前创建好所有策略类，缓存到 Map 中
    static {
        strategies.put("A", new ConcreteStrategyA());
        strategies.put("B", new ConcreteStrategyB());
    }

    // 需要使用策略时根据 type 去 Map 中 get 即可获取到相应的策略实现类
    public static Strategy getStrategy(String type) {
        if (type == null || type.isEmpty()) {
            throw new IllegalArgumentException("type should not be empty.");
        }
        return strategies.get(type);
    }
}

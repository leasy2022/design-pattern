package a_策略模式.s1;

/**
 * @author wushang
 * @description:
 * @date 2020-08-14
 */
/*
无状态对象
参考：https://mp.weixin.qq.com/s/ymem-E70BhgBb1OOwlSBog
 */
public class Main {
    public static void main(String[] args) {
        String type = "A";
        Strategy strategy = StrategyFactory.getStrategy(type);
        // 调用策略类的 algorithmInterface 方法去执行代码逻辑
        strategy.algorithmInterface();
    }
}

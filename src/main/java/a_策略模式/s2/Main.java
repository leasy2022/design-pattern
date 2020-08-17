package a_策略模式.s2;

/**
 * @author wushang
 * @description:
 * @date 2020-08-14
 */
/*
有状态对象
 */
public class Main {
    public static void main(String[] args) {
        String type = "A";
        Strategy strategy = Factory.getStrategy(type);
        // 调用策略类的 algorithmInterface 方法去执行代码逻辑
        strategy.algorithmInterface();
    }
}

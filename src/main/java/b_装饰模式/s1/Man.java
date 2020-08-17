package b_装饰模式.s1;

/**
 * @author wushang
 * @description:
 * @date 2020-08-14
 */
//    // 具体组件（ConcreteComponent）,即被修饰者
public class Man implements IPerson{
    @Override
    public void dress() {
        System.out.println("穿了内裤!");
    }
}

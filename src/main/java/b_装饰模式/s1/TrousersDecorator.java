package b_装饰模式.s1;

/**
 * @author wushang
 * @description:
 * @date 2020-08-14
 */
//具体装饰器（ConcreteDecorator）：裤子装饰器
public class TrousersDecorator extends ClothesDecorator {

    public TrousersDecorator(IPerson person) {
        super(person);
    }

    @Override
    public void dress() {
        super.dress();
        this.dressTrousers();
    }

    private void dressTrousers() {
        System.out.println("穿上裤子了!");
    }
}

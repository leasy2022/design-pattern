package b_装饰模式.s1;

/**
 * @author wushang
 * @description:
 * @date 2020-08-14
 */
// 抽象适配器（Decorator）,接收一个具体的Component，本身也是一个Component
abstract class ClothesDecorator implements IPerson {
    protected IPerson mPerson;

    // 构造方法强制子类构造必须传入一个IPerson
    public ClothesDecorator(IPerson person) {
        this.mPerson = person;
    }

    @Override
    public void dress() {
        this.mPerson.dress();
    }
}



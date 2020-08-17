package b_装饰模式.s1;

/**
 * @author wushang
 * @description:
 * @date 2020-08-14
 */
//具体装饰器（ConcreteDecorator）：内衣装饰器
class UnderClothesDecorator extends ClothesDecorator {
    public UnderClothesDecorator(IPerson person) {
        super(person);
    }

    @Override
    public void dress() {
        super.dress();
        this.dressUnderClothes();
    }

    private void dressUnderClothes() {
        System.out.println("穿上内衣了!");
    }
}

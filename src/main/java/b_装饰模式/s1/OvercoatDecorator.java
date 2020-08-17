package b_装饰模式.s1;

/**
 * @author wushang
 * @description:
 * @date 2020-08-14
 */
//具体装饰器（ConcreteDecorator）：外套装饰器
class OvercoatDecorator extends ClothesDecorator {
    public OvercoatDecorator(IPerson person){
        super(person);
    }

    @Override
    public void dress() {
        super.dress();
        this.dressOvercoat();
    }

    private void dressOvercoat(){
        System.out.println("穿上外套了!");
    }
}
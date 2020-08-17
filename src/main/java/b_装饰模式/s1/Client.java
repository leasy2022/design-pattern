package b_装饰模式.s1;

/**
 * @author wushang
 * @description:
 * @date 2020-08-14
 */
//参考 https://www.jianshu.com/p/1f3e6eeb54c3
public class Client {
    public static void main(String[] args) {
        //对一个人可以
        IPerson person = new Man();
        person.dress();
        System.out.println("----------------------");
        System.out.println("--增加裤子适配器");
        person = new TrousersDecorator(person);
        person.dress();
        System.out.println("----------------------");
        System.out.println("--再增加内衣适配器");
        person = new UnderClothesDecorator(person);
        person.dress();

        System.out.println("----------------------");
        System.out.println("--再增加外套适配器");
        person = new OvercoatDecorator(person);
        person.dress();

    }
}

package b_装饰模式.s2;

public class TShirts extends Finery {
    @Override
    public void show() {
        addFunction();
        super.show();
    }

    //增加自己的功能
    private void addFunction() {
        System.out.println("Tshirts");
    }
}

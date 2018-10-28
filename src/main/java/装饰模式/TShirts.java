package 装饰模式;

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

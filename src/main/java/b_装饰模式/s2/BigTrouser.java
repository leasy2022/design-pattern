package b_装饰模式.s2;

public class BigTrouser extends Finery {

    @Override
    public void show() {
        addFunction();
        super.show();
    }

    private void addFunction() {
        System.out.println("BigTrouser");
    }
}

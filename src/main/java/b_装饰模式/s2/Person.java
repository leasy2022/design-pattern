package b_装饰模式.s2;

public class Person {

    private String name;

    public Person(){

    }
    public Person(String name) {
        this.name = name;
    }

    public void show() {
        System.out.println("装扮的：" + name);
    }
}

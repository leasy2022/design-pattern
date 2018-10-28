package 建造者模式;

public class SonBuilder implements PersonBuilder {
    Person son = new Person();

    public void buildBody() {
        son.setBody("weak body");
    }

    public void buildName() {
        son.setName("son");
    }

    public void buildHead() {
        son.setHead("big head");
    }

    public Person getPerson() {
        return son;
    }
}

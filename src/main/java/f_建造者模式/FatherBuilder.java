package f_建造者模式;

public class FatherBuilder implements PersonBuilder {

    Person father = new Person();

    public void buildName() {
        father.setName("father");
    }

    public void buildBody() {
        father.setBody("strong body");
    }

    public void buildHead() {
        father.setHead("small head");
    }

    public Person getPerson() {
        return father;
    }
}

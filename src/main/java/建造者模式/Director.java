package 建造者模式;

public class Director {

    public void build(PersonBuilder builder) {
        builder.buildBody();
        builder.buildHead();
        builder.buildName();
    }
}

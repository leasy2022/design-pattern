package f_建造者模式;

public class Main {

    public static void main(String[] args) throws Exception {
        Director director = new Director();
        PersonBuilder fatherBuilder = new FatherBuilder();

        director.build(fatherBuilder);

        System.out.println(fatherBuilder.getPerson());



        PersonBuilder sonBuilder = new SonBuilder();

        director.build(sonBuilder);

        System.out.println(sonBuilder.getPerson());


    }
}

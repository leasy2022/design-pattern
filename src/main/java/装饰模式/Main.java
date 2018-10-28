package 装饰模式;

public class Main {
    public static void main(String[] args) throws Exception {

        Person person = new Person("xiao zhang");

        BigTrouser bigTrouser = new BigTrouser();
        TShirts tShirts = new TShirts();

        bigTrouser.decorate(person);//一层一层装饰，是有顺序的。
        tShirts.decorate(bigTrouser);

        tShirts.show();
    }
}

package e_观察者模式.s1;

/**
 * @author wushang
 * @description:
 * @date 2020-08-17
 */
/*

 */
public class Client {
    public static void main(String[] args) {

        Rate rate = new RMBrate();
        Company watcher1 = new ImportCompany();
        Company watcher2 = new ExportCompany();
        rate.add(watcher1);
        rate.add(watcher2);


        rate.change(10);
        rate.change(-9);
    }
}

package e_观察者模式.s2;

/**
 * @author wushang
 * @description:
 * @date 2020-08-17
 */
public class Client {

    public static void main(String[] args) {
        Subscribe subscribe = new Subscribe();
        Publish publish = new Publish();
        publish.addObserver(subscribe);
        publish.setData("开始");
    }
}

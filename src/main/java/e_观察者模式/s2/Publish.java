package e_观察者模式.s2;

import java.util.Observable;

/**
 * @author wushang
 * @description:
 * @date 2020-08-17
 */
public class Publish extends Observable {
    private String data = "";

    public String getData() {
        return data;
    }

    public void addSubscriber(Subscribe subscribe) {
        this.addObserver(subscribe);
    }

    public void setData(String data) {

        if (!this.data.equals(data)) {
            this.data = data;
            setChanged();    //改变通知者的状态
        }
        notifyObservers();    //调用父类Observable方法，通知所有观察者
    }
}

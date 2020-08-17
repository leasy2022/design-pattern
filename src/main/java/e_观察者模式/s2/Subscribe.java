package e_观察者模式.s2;

import java.util.Observable;
import java.util.Observer;

/**
 * @author wushang
 * @description:
 * @date 2020-08-17
 */
public class Subscribe implements Observer {


    @Override
    public void update(Observable o, Object arg) {
        System.out.println("收到通知:" + ((Publish) o).getData());
    }
}

package reactive;

import java.util.Observable;

/**
 * @description：
 * @author：Leo
 * @date：2021-09-04 20:34
 */
public class MyObserver extends Observable {
    public static void main(String[] args) {
        MyObserver myObserver = new MyObserver();
        //添加观察者
        myObserver.addObserver((o, arg) -> {
            System.out.println("发生了变化");
        });
        myObserver.addObserver((o, arg) -> {
            System.out.println("发生了变化");
        });
        myObserver.setChanged();
        myObserver.notifyObservers();
    }
}


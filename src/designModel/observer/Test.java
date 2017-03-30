package designModel.observer;

import designModel.observer.impl.MySubject;
import designModel.observer.impl.Observer1;
import designModel.observer.impl.Observer2;

/**
 * Created by jilili on 2017/3/29.
 */
public class Test  {

    @org.junit.Test
    public void Test(){
        Subject subject =new MySubject();
        subject.add(new Observer1());
        subject.add(new Observer2());
        subject.operation();
    }
}

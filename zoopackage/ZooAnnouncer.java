package zoopackage;

import java.util.Observer;
import java.util.Observable;

//Observer and Observable Example: https://www.infoworld.com/article/2077258/observer-and-observable.html


public class ZooAnnouncer implements Observer{
    private Zookeeper zkeeper = null;
    ZooAnnouncer (Zookeeper zk){
        zkeeper = zk;
    }
    public void update(Observable obs, Object obj){
        if (obs == obj) {

        }
    }
}

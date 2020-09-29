package zoopackage;

import java.util.ArrayList;
import java.util.List;

public class ZooAnnouncer extends Zooemployee{

    ZooAnnouncer(String name){
        super(name);
    }
    @Override
    public void update() {
        int time = Zoo.clock.getTime();
        switch(time) {
            case 8:
                arrive();
                System.out.println("The zookeeper is about to wake up the animals.");
                break;
            case 12:
                System.out.println("The zookeeper is about to feed the animals breakfast.");
                break;
            case 14: System.out.println("The zookeeper is about to exercise the animals.");
                break;
            case 17: System.out.println("The zookeeper is about to feed the animals dinner.");
                break;
            case 20:
                System.out.println("The zookeeper is about to put the animals to sleep.");
                leave();
                break;
            //default: System.out.print("Didnt hit");
        }
    }

}

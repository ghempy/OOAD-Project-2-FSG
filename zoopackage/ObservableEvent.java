package zoopackage;

import java.util.ArrayList;
import java.util.List;

public class ObservableEvent
{
    private String task;

    ObservableEvent(String t) {
        task = t;
    }

    public String getTask() {
        return task;
    }

    public void notifyAnnouncer(){
        Zoo.announcer.update();
    }

}

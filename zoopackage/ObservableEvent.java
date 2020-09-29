package zoopackage;

//Observerable implementation for part b
//This is the observable object that the ZooAnnouncer will be observing to know when the zoo employees begin their tasks

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
        //connecting observer and observable, we only need the announcer to update since the clock handles everything else
    }

}

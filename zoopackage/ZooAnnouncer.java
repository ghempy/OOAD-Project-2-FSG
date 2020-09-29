package zoopackage;

//ZooAnnouncer is an observer of ObservableEvent

public class ZooAnnouncer extends Zooemployee{

    ZooAnnouncer(String name){
        super(name);
    }

    @Override
    public void update() {
        String flag = current_task.getTask();
        switch(flag) {
            case "wakeup":
                arrive();
                System.out.println("Hi! This is " + this.getName() + " the ZooAnnouncer. The zookeeper is about to wake up the animals.");
                break;
            case "rollcall":
                System.out.println("Hi! This is " + this.getName() + " the ZooAnnouncer. The zookeeper is about to roll call the animals.");
                break;
            case "exercise": System.out.println("Hi! This is " + this.getName() + " the ZooAnnouncer. The zookeeper is about to exercise the animals.");
                break;
            case "feed": System.out.println("Hi! This is " + this.getName() + " the ZooAnnouncer. The zookeeper is about to feed the animals.");
                break;
            case "lunch":
                System.out.println("Hi! This is " + this.getName() + " the ZooAnnouncer. Lunch is about to be served.");
                break;
            case "dinner":
                System.out.println("Hi! This is " + this.getName() + " the ZooAnnouncer. Dinner is about to be served.");
                break;
            case "sleep":
                System.out.println("Hi! This is " + this.getName() + " the ZooAnnouncer. The zookeeper is about to put the animals to sleep.");
                leave();
                break;
        }
    }

}

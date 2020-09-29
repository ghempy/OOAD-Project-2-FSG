package zoopackage;

//Part D

public class ZooFoodServer extends Zooemployee{
    public ZooFoodServer(String name) {
        super(name);
        Zoo.clock.attach(this);
    }

    public void makeFood(){
        System.out.println(this.getName() + " the " + this.getClass().getSimpleName() + " begins to make the food.");
    }

    //Since the Announcer needs to announce when food is served, we create observable events for lunch and dinner for guests
    public void serverFood(){
        if(Zoo.clock.getTime() == 12){
            current_task = new ObservableEvent("lunch");
            current_task.notifyAnnouncer();
            System.out.println(this.getName() + " the " + this.getClass().getSimpleName() + " begins to serve lunch to the visitors.");
        }
        if(Zoo.clock.getTime() == 17){
            current_task = new ObservableEvent("dinner");
            current_task.notifyAnnouncer();
            System.out.println(this.getName() + " the " + this.getClass().getSimpleName() + " begins to serve dinner to the visitors.");
        }
    }

    public void cleanUp(){
        System.out.println(this.getName() + " the " + this.getClass().getSimpleName() + " begins to clean.");
    }

    @Override
    public void update() {
        int time = Zoo.clock.getTime();
        switch(time){
            case 10:
                arrive();
                makeFood();
                break;
            case 12: 
                serverFood();
                break;
            case 13: 
                cleanUp();
                break;
            case 15: 
                makeFood();
                break;
            case 17: 
                serverFood();
                break;
            case 18: 
                cleanUp();
                break;
            case 20: 
                leave();
                break;
        } 
    }
}

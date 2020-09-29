package zoopackage;


//Example of Abstract class in line 4, "public abstract class Zooemployee"
public abstract class Zooemployee{
    //Encapsulation regarding line 5, "private String name;"
    private String name;

    public static ObservableEvent current_task;

    public Zooemployee(String name){
        this.name = name;
    }

    public abstract void update();
    
    public String getName()
    {
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public void wakeAnimalUp(Animal[] zoo) {
        current_task = new ObservableEvent("wakeup");
        current_task.notifyAnnouncer();
        String str = this.name + " the " + this.getClass().getSimpleName() + " begins to wake the animals up from their slumber.";
        System.out.println(str);
        for(int i=0; i<zoo.length ; i++) {
            zoo[i].wakeup();
        }
    }
    public void makeAnimalSleep(Animal[] zoo) {
        current_task = new ObservableEvent("sleep");
        current_task.notifyAnnouncer();
        System.out.println(this.name + " the " + this.getClass().getSimpleName() + " begins to tuck the animals in for the night.");
        for(int i=0; i<zoo.length ; i++){
            zoo[i].sleep();
        }
        System.out.println(this.name + " the " + this.getClass().getSimpleName() + " locks up and closes the zoo for the night.");

    }
    public void rollCall(Animal[] zoo) {
        current_task = new ObservableEvent("rollcall");
        current_task.notifyAnnouncer();
        System.out.println(this.name + " the " + this.getClass().getSimpleName() + " begins to roll call the animals.");
        for(int i=0; i<zoo.length ; i++){
            zoo[i].makeNoise();
        }
    }

    public void arrive(){
        System.out.println(this.name + " the " + this.getClass().getSimpleName() + " arrives for the day.");
    }

    public void leave(){
        System.out.println(this.name + " the " + this.getClass().getSimpleName() + " leaves for the night.");
    }

}
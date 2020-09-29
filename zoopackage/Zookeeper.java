package zoopackage;


public class Zookeeper extends Zooemployee {
    public Zookeeper(String name) {
        super(name);
        Zoo.clock.attach(this);
    }

    public void exerciseAnimal(Animal[] zoo) {
        current_task = new ObservableEvent("exercise");
        current_task.notifyAnnouncer();
        System.out.println(this.getName() + " the Zookeeper begins to exercise the animals.");
        for(int i=1; i<zoo.length ; i++){
            zoo[i].roam();
        }
    }

    public void feedAnimal(Animal[] zoo) {
        current_task = new ObservableEvent("feed");
        current_task.notifyAnnouncer();
        System.out.println(this.getName() + " the Zookeeper begins to feed the animals.");
        for(int i=0; i<zoo.length ; i++){
            zoo[i].eat();
        }
    }

    @Override
    public void update() {
        int time = Zoo.clock.getTime();
        switch(time) {
            case 8:
                arrive();
                wakeAnimalUp(Zoo.all_animals);
                rollCall(Zoo.all_animals);
                break;
            case 12: 
                feedAnimal(Zoo.all_animals);
                break;
            case 14:
                exerciseAnimal(Zoo.all_animals);
                break;
            case 17:
                feedAnimal(Zoo.all_animals);
                break;
            case 20: 
                makeAnimalSleep(Zoo.all_animals);
                leave();
                break;
            //default: System.out.print("Didnt hit");
        }
    }
}

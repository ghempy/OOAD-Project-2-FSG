package zoopackage;

import java.util.Observable;

//Example of Abstract class in line 4, "public abstract class Zooemployee"
public abstract class Zooemployee extends Observable{
    //Encapsulation regarding line 5, "private String name;"
    private String name;
    public Zooemployee(String name){
        this.name = name;
        Zoo.clock.attach(this);
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
        String str = this.name + " the " + this.getClass().getSimpleName() + " begins to wake the animals up from their slumber.";
        System.out.println(str);
        for(int i=0; i<zoo.length ; i++){
            zoo[i].wakeup();
        }
        setChanged();
        notifyObservers();
    }
    public void makeAnimalSleep(Animal[] zoo) {
        System.out.println(this.name + " the " + this.getClass().getSimpleName() + " begins to tuck the animals in for the night.");
        for(int i=0; i<zoo.length ; i++){
            zoo[i].sleep();
        }
        System.out.println(this.name + " the " + this.getClass().getSimpleName() + " locks up and closes the zoo for the night.");
        setChanged();
        notifyObservers();
    }
    public void rollCall(Animal[] zoo) {
        System.out.println(this.name + " the " + this.getClass().getSimpleName() + " begins to roll call the animals.");
        for(int i=0; i<zoo.length ; i++){
            zoo[i].makeNoise();
        }
        setChanged();
        notifyObservers();
    }

    public void arrive(){
        System.out.println(this.name + "the" + this.getClass().getSimpleName() + "arrives for the day");
    }

    public void leave(){
        System.out.println(this.name + "the" + this.getClass().getSimpleName() + "leaves for the night");
    }

}
package zoopackage;


public class Zookeeper extends Zooemployee {
    //public String[] exerciseScripts;//maybe change to prive??
    public Zookeeper(String name) {
        super(name);
    }

    public void exerciseAnimal(Animal[] zoo) {
        System.out.println(this.getName() + " the Zookeeper begins to exercise the animals.");
        for(int i=1; i<zoo.length ; i++){
            zoo[i].roam();
        }
        setChanged();
        notifyObservers();
    }

    public void feedAnimal(Animal[] zoo) {
        System.out.println(this.getName() + " the Zookeeper begins to feed the animals.");
        for(int i=0; i<zoo.length ; i++){
            zoo[i].eat();
        }
        setChanged();
        notifyObservers();
    }
}

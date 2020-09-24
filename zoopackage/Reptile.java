package zoopackage;

public class Reptile extends Animal{
    public Reptile(String name)
    {
        super(name);
    }
    public void roam() {
        System.out.println(this.getName() + " slithers around.");
    }
}
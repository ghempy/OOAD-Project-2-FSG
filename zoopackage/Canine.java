package zoopackage;

public class Canine extends Animal{
    public Canine(String name)
    {
        super(name);
    }
    public void roam() {
        System.out.println(this.getName() + " is *WALKING*");
    }
}
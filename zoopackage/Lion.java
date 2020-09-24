package zoopackage;

public class Lion extends Feline{
    public Lion(String name)
    {
        super(name);
    }
    public void makeNoise() {
        System.out.println(this.getName() + " ROAR");
    }
}
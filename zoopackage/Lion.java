package zoopackage;

public class Lion extends Feline{
    public Lion(String name)
    {
        super(name);
        diet = new CarnivoreDiet();
    }
    public void makeNoise() {
        System.out.println(this.getName() + " ROAR");
    }
}
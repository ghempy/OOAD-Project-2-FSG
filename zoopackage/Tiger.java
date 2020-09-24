package zoopackage;

public class Tiger  extends Feline{
    public Tiger(String name)
    {
        super(name);
        diet = new CarnivoreDiet();
    }
    public void makeNoise() {
        System.out.println(this.getName() + " roar");
    }
}
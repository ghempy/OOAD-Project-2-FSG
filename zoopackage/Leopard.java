package zoopackage;

//File for Leopard extending 
public class Leopard extends Feline{
    public Leopard(String name)
    {
        super(name);
    }
    public void makeNoise() {
        System.out.println(this.getName() + " GROWLS");
    }
}
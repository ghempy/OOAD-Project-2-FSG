package zoopackage;

//File for Hippo extending 
public class Hippo extends Pachyderm{
    public Hippo(String name)
    {
        super(name);
    }
    public void makeNoise() {
        System.out.println(this.getName() + "*Splashes Around");
    }
}
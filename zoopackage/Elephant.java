package zoopackage;

//File for Elephant extending 
public class Elephant extends Pachyderm{
    public Elephant(String name)
    {
        super(name);
        diet = new HerbivoreDiet();
    }
    public void makeNoise() {
        System.out.println(this.getName() + "OOOOOOOOONJBmkndjsnfjsOJDS");
    }
}
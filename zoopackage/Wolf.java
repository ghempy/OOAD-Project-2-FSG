package zoopackage;

//Note: Canine extends Animal class
/* Wolf Class
*/
public class Wolf extends Canine{
    public Wolf(String name)
    {
        super(name);
        diet = new CarnivoreDiet();
    }
    public void makeNoise() {
        System.out.println(this.getName() + " BARKS!");
    }
}
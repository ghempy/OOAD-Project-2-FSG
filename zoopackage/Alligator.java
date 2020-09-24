package zoopackage;

public class Alligator extends Reptile {
    public Alligator(String name){
        super(name);
    }
    
    public void makeNoise(){
        System.out.println(this.getName() + " snaps their jaw!");
    }
}
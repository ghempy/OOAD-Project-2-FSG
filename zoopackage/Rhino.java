package zoopackage;

public class Rhino extends Pachyderm {
    public Rhino(String name){
        super(name);
    }
    
    public void makeNoise(){
        System.out.println(this.getName() + " screeches!");
    }
}
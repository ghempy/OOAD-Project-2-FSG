package zoopackage;

public class Rhino extends Pachyderm {
    public Rhino(String name){
        super(name);
        diet = new HerbivoreDiet();
    }
    
    public void makeNoise(){
        System.out.println(this.getName() + " screeches!");
    }
}
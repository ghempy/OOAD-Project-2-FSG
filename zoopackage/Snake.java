package zoopackage;

public class Snake extends Reptile {
    public Snake(String name){
        super(name);
        diet = new CarnivoreDiet();
    }
    
    public void makeNoise(){
        System.out.println(this.getName() + " HISSSSSSSES");
    }
}
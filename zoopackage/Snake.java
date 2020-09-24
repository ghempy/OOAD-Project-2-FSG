package zoopackage;

public class Snake extends Reptile {
    public Snake(String name){
        super(name);
    }
    
    public void makeNoise(){
        System.out.println(this.getName() + " HISSSSSSSES");
    }
}
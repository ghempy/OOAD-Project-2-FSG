package zoopackage;

//Canine extends animal
public class Cat extends Feline{
    public Cat(String name)
    {
        super(name);
    }
    public void makeNoise() {
        System.out.println(this.getName() + " meows");
    }
}
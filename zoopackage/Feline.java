package zoopackage;

public class Feline extends Animal{
    public Feline(String name)
    {
        super(name);
    }
    public void roam() {
        System.out.println(this.getName() + " is *RUNNING*");
    }

    public void sleep() {
        int rand = randomInt();
        if (0 < rand && rand < 30) {
            roam();
        } else if (30 < rand && rand < 60) {
            makeNoise();
        } else {
            System.out.println(this.getName() + " is sleeping");
        }
    }
}
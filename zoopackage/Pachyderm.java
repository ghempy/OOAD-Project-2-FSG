package zoopackage;

public class Pachyderm extends Animal{
    public Pachyderm(String name)
    {
        super(name);
    }
    public void roam() {
        int rand = randomInt();
        //When a Pachyderm is given an exercise command, there is a 25% chance it will charge instead of roam
        if (0 < rand && rand< 25) {
            charge(); 
        } else {
        System.out.println(this.getName() + " is *STOMPING*");
        }
    }

    public void charge() {
        System.out.println(this.getName() + " is *CHARGING*");
    }
}
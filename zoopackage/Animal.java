package zoopackage;
import java.util.Random;

public class Animal{
    private String name;
    private boolean isAsleep;
    private AnimalDiet dietType;

   //constructor
   public Animal(String name){
       this.name = name;
       this.isAsleep = true;
    }
    
    public String getName()
    {
        return name;
    }
    
    public void setName(String name){
        this.name = name;
    }

    //resource used: https://study.com/academy/lesson/java-generate-random-number-between-1-100.html
    public int randomInt(){
        int max = 100;
        int min = 1;
        Random randomNum = new Random();
        int randomNumber = min + randomNum.nextInt(max);
        return(randomNumber);
    }
    
    public void wakeup(){
        if(this.isAsleep){
            this.isAsleep = false;
            System.out.println(this.name + " the " +this.getClass().getSimpleName() + " woke up.");
        }
        else{
            System.out.println(this.name + " the " +this.getClass().getSimpleName() + " is already awake.");
        }
        isAsleep = false;
    }
    
    public void makeNoise() {
        System.out.println(this.name + " the " +this.getClass().getSimpleName() + " is making a noise.");
    
    }
    
    public void eat() {
        System.out.println(this.name + " the " +this.getClass().getSimpleName() + " is eating.");
    }
    
    public void roam() {
        System.out.println(this.name + " the " +this.getClass().getSimpleName() + " is roaming around.");
    }
    
    public void sleep() {
        if(!this.isAsleep){
            isAsleep = true;
            System.out.println(this.name + " the " +this.getClass().getSimpleName() + " has gone to sleep.");
        }
        else{
            System.out.println(this.name + " the " +this.getClass().getSimpleName() + " is already asleep.");
        }
        
    }

    public void dig(){
        System.out.println(this.name + " the " + this.getClass().getSimpleName() + "is digging");
    }

    public void charge() {
        System.out.println(this.name + " the " + this.getClass().getSimpleName() + "is charging");
    }
}
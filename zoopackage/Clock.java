package zoopackage;
import java.util.ArrayList;
import java.util.List;

public class Clock {
    private List<Zooemployee> observers = new ArrayList<Zooemployee>();
    private int time;

    public int getTime() {
        return time; 
    }

    public void setTime(int incr) {
        time += incr;
        notifyAllObservers();
    }

    public void attach(Zooemployee observer){
        observers.add(observer);		
     }
  
     public void notifyAllObservers(){
        for (Zooemployee observer : observers) {
           observer.update();
        }
     }
     
    public void start(int numDays){
        for(int i=1; i<=numDays ; i++){
            time = 0;
            System.out.println("This is day: "+ i);
            for(int j=0; j<=24; j++) {
                System.out.println("The time is: "+ time + ":00");
                setTime(1);
            }
        }
    } 
}

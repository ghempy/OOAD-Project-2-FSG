package zoopackage;

public class ZooFoodServer extends Zooemployee{
    public ZooFoodServer(String name) {
        super(name);
    }

    public void makeFood(){
        System.out.println(this.getName() + "the food server begins to make the food");
    }

    public void serverFood(){
        System.out.println(this.getName() + "the food server begins to serve to food to guests");
    }

    public void cleanUp(){
        System.out.println(this.getName() + "the food server begins to clean");
    }

    @Override
    public void update() {
        int time = Zoo.clock.getTime();
        switch(time){
            case 10: 
            makeFood();
            break;
            case 12: 
            serverFood();
            break;
            case 13: 
            cleanUp();
            break;
            case 15: 
            makeFood();
            break;
            case 17: 
            serverFood();
            break;
            case 18: 
            cleanUp();
            break;
            case 20: 
            leave();
            break;
        } 
    }
    
}

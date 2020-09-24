package zoopackage;

public abstract class AnimalDiet {

    protected String dietType;

    public AnimalDiet() {
        dietType = "Generic animal diet";
    }

    public String getFoodType(){
        return dietType;
    }

}
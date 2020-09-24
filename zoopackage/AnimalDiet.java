package zoopackage;

public abstract class AnimalDiet {

    public String dietType;

    public AnimalDiet() {
        dietType = "Generic animal diet";
    }

    public String getFoodType(){
        return dietType;
    }

}
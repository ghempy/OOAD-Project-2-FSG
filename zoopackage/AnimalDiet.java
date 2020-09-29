package zoopackage;

public abstract class AnimalDiet {

    //Strategy pattern implementation (each animal has an AnimalDiet, and then is delegated a dietType based on what food they eat
    //Diet Options: Carnivore, Domestic, Herbivore

    protected String dietType;

    public AnimalDiet() {
        dietType = "Generic animal diet";
    }

    public String getFoodType(){
        return dietType;
    }

}
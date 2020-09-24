package zoopackage;

public abstract class AnimalDiet {

    private String dietType;

    public AnimalDiet() {
        dietType = "Generic animal food";
    }

    public String getDietType(){
        return dietType;
    }
    public void setFoodType(String type){
        dietType = type;
    }
}
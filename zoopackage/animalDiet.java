package zoopackage;

public abstract class animalDiet {

    private String dietType;

    public animalDiet() {
        dietType = "Generic animal food";
    }

    public String getDietType(){
        return dietType;
    }
    public void setFoodType(String type){
        dietType = type;
    }
}
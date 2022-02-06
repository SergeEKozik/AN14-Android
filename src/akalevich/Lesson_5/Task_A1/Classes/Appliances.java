package akalevich.Lesson_5.Task_A1.Classes;

abstract class Appliances {

    private String name;
    private boolean nutrition = false;
    private boolean power = false;

    String getName() {
        return name;
    }

    Appliances(String name) {
        this.name = name;
    }

    boolean isPower() {
        return power;
    }

    void setPower(boolean power) {
        this.power = power;
    }


    boolean isNutrition() {
        return nutrition;
    }

    void setNutrition(boolean nutrition) {
        this.nutrition = nutrition;
    }
}

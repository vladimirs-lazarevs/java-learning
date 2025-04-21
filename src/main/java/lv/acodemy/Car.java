package lv.acodemy;

public class Car {
    private String modelName;
    private int fuel;
    private int milleage;
    private int wear;

    public Car(String modelName){
        this.modelName = modelName;
        this.fuel = 50;
        this.milleage = 0;
        this.wear = 0;
    }

    @Override
    public String toString() {
        return "Car{" +
                "modelName='" + modelName + '\'' +
                ", fuel=" + fuel +
                ", milleage=" + milleage +
                ", wear=" + wear +
                '}';
    }

    void drive() {
        //if fuel >= && wear < 90
        //mileage + 50
        //wear + 10;
        //wear + 10;
        //else if fuel < 10 will print Not enough fuel;
        //else -> car is very used!
        if (fuel >= 10 && wear < 90) {
            fuel = fuel - 10;
            milleage = milleage + 50;
            wear = wear + 10;
        } else if (fuel < 10) {
            System.out.println("Not enough fuel");
        } else {
            System.out.println("Car is very used!");
        }
    }


    public void refuel () {
            if(fuel < 100) {
                fuel = fuel + 30;
                if(fuel > 100) fuel = 100;
                System.out.println(modelName + " is refueled");
            } else {
                System.out.println("Dodge is full");
            }
        }
    public void service() {
        if (wear > 0) {
            wear = wear - 30;
            if (wear < 0) wear = 0;
            System.out.println(modelName + " is fixed");
        } else {
            System.out.println("No need to fix your car");
        }
    }
    void showStatus() {
        System.out.println("Model: " + modelName +"," + " Wear:" + wear +"," + " fuel: " + fuel +"," + " mileage: " + milleage);
    }


}

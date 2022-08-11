package model;

public class SportCar extends Car {

    private String carType;

    public SportCar(String name, String color, String enginSize, String carType) {
        super(name, color, enginSize);
        this.carType = carType;
    }
}

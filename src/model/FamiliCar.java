package model;

public class FamiliCar extends Car {

    // is a - jest czymś
    // has a - posiada coś
    private String carType;

    public FamiliCar(String name, String color, String enginSize, String carType) {
        super(name, color, enginSize);
        this.carType = carType;
    }
    public void describeCar(){
        System.out.println("Car name is: "+ name +" color: "+ color +" engin size: "+ enginSize +" type car: " + carType + "");
    }
}

package org.example;

public class Car {

    public String brand;
    public String model;
    public String color;
    public int year_of_manufacture;
    public int speed;

    public Car(String brand, String model, String color, int year_of_manufacture, int speed) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.year_of_manufacture = year_of_manufacture;
    }
    public void starts(){
        System.out.println(model+" starts");
    }
    public void accelerates(int speed){
        this.speed=speed;
        System.out.println(model+" accelerates to "+speed+" km/h");
    }
}

package org.example;

public class Main {
    public static void main(String[] args) {

        Car Golf5 = new Car("VW","Golf","Black",2003,200);
        Golf5.starts();
        Golf5.accelerates(250);
        Car kaefer = new Car("VW","Kaefer","Black",1990,100);
        kaefer.starts();
        kaefer.accelerates(120);
        Person Thomas = new Person("Thomas",45,"Male");
        Thomas.introduction();
    }
}
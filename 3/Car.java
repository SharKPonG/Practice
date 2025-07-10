import java.util.Scanner;


class Vehicle {
    public String name;
    public double distance;

    
    Vehicle(String name, double distance){
        this.name = name;
        this.distance = distance;
    }


    public double calculateFuel(){
        return distance;
    }
}


class Car extends Vehicle{
    

    public Car(String name, double distance){
        super(name,distance);
    }


    public double calculateFuel(double distance){
        return distance / 20.0;
    }
}

class Motorcycle extends Vehicle{
    

    public Motorcycle(String name, double distance){
        super(name,distance);
    }


    public double calculateFuel(double distance){
        return distance / 25.0;
    }
}

class Main{
    public static void main(String[] args){
        double tripDistance = 100;

        Vehicle car = new Car("GTR35", 100);
        Vehicle Motorcycle = new Motorcycle("SuzukiCob", 100);

        System.out.println(car.calculateFuel());
        System.out.println(Motorcycle.calculateFuel());
    }
}
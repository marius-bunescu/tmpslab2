package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // create a car factory
        CarFactory carFactory = CarFactory.getInstance();

        // prompt the user to create a car
        System.out.println("Welcome to the car dealership!");
        System.out.println("Let's create your dream car.");
        System.out.print("Enter a name for your car: ");
        String name = scanner.nextLine();

        System.out.print("Enter the type of engine (electric or gas): ");
        String engineType = scanner.nextLine();
        Engine engine = carFactory.createEngine(engineType);

        System.out.print("Enter the type of transmission (automatic or manual): ");
        String transmissionType = scanner.nextLine();
        Transmission transmission = carFactory.createTransmission(transmissionType);

        System.out.print("Enter the type of body (sedan or suv): ");
        String bodyType = scanner.nextLine();
        Body body = carFactory.createBody(bodyType);

        // build the car
        Car car = new Car.Builder(name)
                .engine(engine)
                .transmission(transmission)
                .body(body)
                .build();

        // display the car details
        System.out.println("Your car has been built:");
        System.out.println("Name: " + car.getName());
        System.out.println("Engine: " + car.getEngine().getClass().getSimpleName() + " (" + car.getEngine().getPower() + " hp)");
        System.out.println("Transmission: " + car.getTransmission().getClass().getSimpleName() + " (" + car.getTransmission().getGears() + " gears)");
        System.out.println("Body: " + car.getBody().getClass().getSimpleName() + " (" + car.getBody().getColor() + ")");

        // prompt the user to purchase the car
        System.out.print("Would you like to purchase this car? (Y/N) ");
        String purchaseChoice = scanner.nextLine();
        if (purchaseChoice.equalsIgnoreCase("Y")) {
            System.out.println("Congratulations on your new car!");
        } else {
            System.out.println("Maybe next time.");
        }
    }
}
package org.example;

public class CarFactory {
    private static CarFactory instance;

    private CarFactory() {}

    public static CarFactory getInstance() {
        if (instance == null) {
            instance = new CarFactory();
        }
        return instance;
    }

    public Engine createEngine(String type) {
        if (type.equals("electric")) {
            return new ElectricEngine();
        } else if (type.equals("gas")) {
            return new GasEngine();
        } else {
            throw new IllegalArgumentException("Invalid engine type");
        }
    }

    public Transmission createTransmission(String type) {
        if (type.equals("automatic")) {
            return new AutomaticTransmission();
        } else if (type.equals("manual")) {
            return new ManualTransmission();
        } else {
            throw new IllegalArgumentException("Invalid transmission type");
        }
    }

    public Body createBody(String type) {
        if (type.equals("sedan")) {
            return new SedanBody();
        } else if (type.equals("suv")) {
            return new SUVBody();
        } else {
            throw new IllegalArgumentException("Invalid body type");
        }
    }
}
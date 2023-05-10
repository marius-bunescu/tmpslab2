package org.example;

public class Car {
    private String name;
    private Engine engine;
    private Transmission transmission;
    private Body body;

    private Car(Builder builder) {
        this.name = builder.name;
        this.engine = builder.engine;
        this.transmission = builder.transmission;
        this.body = builder.body;
    }

    public String getName() {
        return name;
    }

    public Engine getEngine() {
        return engine;
    }

    public Transmission getTransmission() {
        return transmission;
    }

    public Body getBody() {
        return body;
    }

    public static class Builder {
        private String name;
        private Engine engine;
        private Transmission transmission;
        private Body body;

        public Builder(String name) {
            this.name = name;
        }

        public Builder engine(Engine engine) {
            this.engine = engine;
            return this;
        }

        public Builder transmission(Transmission transmission) {
            this.transmission = transmission;
            return this;
        }

        public Builder body(Body body) {
            this.body = body;
            return this;
        }

        public Car build() {
            return new Car(this);
        }
    }
}
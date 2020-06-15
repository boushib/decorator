package decorators;

import cars.Car;

public abstract class Decorator extends Car {
    protected Car car;

    public Decorator(Car car) {
        this.car = car;
    }

    public abstract String getDescription();
}

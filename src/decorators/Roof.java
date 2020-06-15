package decorators;

import cars.Car;

public class Roof extends Decorator {

    public Roof(Car car) {
        super(car);
    }

    @Override
    public double calculateCost() {
        return car.calculateCost() + 600;
    }

    @Override
    public String getDescription() {
        return String.format("%s + roof", car.getDescription());
    }
}

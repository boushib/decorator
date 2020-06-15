package decorators;

import cars.Car;

public class Nitro extends Decorator {
    public Nitro(Car car) {
        super(car);
    }

    @Override
    public double calculateCost() {
        return car.calculateCost() + 450;
    }

    @Override
    public String getDescription() {
        return String.format("%s + nitro", car.getDescription());
    }
}

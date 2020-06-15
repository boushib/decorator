package cars;

public abstract class Car {
    protected String make;
    protected String model;

    public abstract double calculateCost();

    public String getDescription(){
        return String.format("%s %s", make, model);
    };
}

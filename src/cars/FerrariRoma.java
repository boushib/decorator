package cars;

public class FerrariRoma extends Car {
    public FerrariRoma(){
        this.make = "Ferrari";
        this.model = "Roma";
    }

    @Override
    public double calculateCost() {
        return 120000;
    }
}

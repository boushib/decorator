package cars;

public class FordMustang extends Car {
    public FordMustang(){
        this.make = "Ford";
        this.model = "Mustang";
    }
    @Override
    public double calculateCost() {
        return 50000;
    }
}

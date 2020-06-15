import cars.Car;
import cars.FordMustang;
import decorators.Nitro;
import decorators.Roof;

public class Application {
  public static void main(String[] args) {
    Car fordMustang = new FordMustang();
    fordMustang = new Nitro(fordMustang);
    fordMustang = new Roof(fordMustang);
    double cost = fordMustang.calculateCost();

    System.out.println(String.format("%s cost: %f", fordMustang.getDescription(), cost));
  }
}

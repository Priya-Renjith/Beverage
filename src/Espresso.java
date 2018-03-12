/**
 * Espresso class extending Beverage since this is a beverage
 * 
 * @author Priya Renjith
 *
 */
public class Espresso extends Beverage {
  public Espresso() {
    description = "Espresso"; // inherits the description instance variable from Beverage class
  }

  public double cost() {
    return 1.99; // returns the cost of the Espresso
  }
}

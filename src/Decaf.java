/**
 * Decaf extends Beverage since this is a beverage
 * 
 * @author Priya Renjith
 *
 */

public class Decaf extends Beverage {

  public Decaf() {
    description = "Decaf Coffee"; // inherits the description instance variable from Beverage
                                  // class
  }

  public double cost() {
    return 1.05; // returns the cost of the Decaf coffee
  }
}

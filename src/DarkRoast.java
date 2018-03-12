/**
 * Dark Roast extends Beverage since this is a beverage
 * 
 * @author Priya Renjith
 *
 */

public class DarkRoast extends Beverage {

  public DarkRoast() {
    description = "Dark Roast Coffee"; // inherits the description instance variable from Beverage
                                       // class
  }

  public double cost() {
    return 0.99; // returns the cost of the Dark Roast coffee
  }
}

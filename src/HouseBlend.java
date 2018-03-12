/**
 * House Blend extends Beverage since this is a beverage
 * 
 * @author Priya Renjith
 *
 */

public class HouseBlend extends Beverage {

  public HouseBlend() {
    description = "House Blend Coffee"; // inherits the description instance variable from Beverage
                                        // class
  }

  public double cost() {
    return 0.89; // returns the cost of the House Blend coffee
  }
}

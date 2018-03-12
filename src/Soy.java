/**
 * Soy is a decorator extending CondimentDecorator.
 * 
 * @author Priya Renjith
 *
 */

public class Soy extends CondimentDecorator {
  Beverage beverage;

  public Soy(Beverage beverage) {
    this.beverage = beverage; // passing the beverage we are wrapping to the constructor
  } // and then setting the instance variable to refer to
    // this object we are wrapping

  public String getDescription() {
    return beverage.getDescription() + ", Soy"; // first delegating to the object we are wrapping
                                                // and then append ", Soy"
  }

  public double cost() {
    return .15 + beverage.cost(); // delegate the call to the object we are decorating
                                  // to get the cost of the beverage and then add the cost
                                  // of the Soy.
  }
}

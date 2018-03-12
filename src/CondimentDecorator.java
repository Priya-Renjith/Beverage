/**
 * Make CondimentDecorator interchangeable with a Beverage by extending the beverage class.
 * 
 * @author Priya Renjith
 *
 */

public abstract class CondimentDecorator extends Beverage {

  public abstract String getDescription(); // it needs to be reimplemented in its subclasses

  public abstract double cost(); // implements cost() in its subclasses
}

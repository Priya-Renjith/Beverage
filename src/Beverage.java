/** Beverage is an abstract class with two methods 
 * getDescription() already implemented, cost() to be implemented 
 * in the subclasses.
 * 
 * @author Priya Renjith
 *
 */
public abstract class Beverage {
  String description = "Unknown beverage";
  
  public String getDescription() {
    return description;
  }
  
  public abstract double cost();  
 
}

public class Cherry extends IceCreamDecorator {
 // the dessert we are decorating
 // notice the use of composition rather than inheritance
 protected Dessert flavor; 

 public static final double COST = 0.15;

 public Cherry(Dessert flavor) {
  this.flavor = flavor;
 }
 
 public String getDescription() {
  return flavor.getDescription() + " with a cherry";
 }

 public double cost() {
  return flavor.cost() + COST;
 }
}

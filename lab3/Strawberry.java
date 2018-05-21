// a concrete instance of an ice cream
public class Strawberry extends Dessert {
 public static final double COST = 1.05;
 
 public Strawberry() {
  description = "Fruity Strawberry";
 }
 
 public double cost() {
  return COST;
 }

}

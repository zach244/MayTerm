public class WhippedCream extends IceCreamDecorator{
  protected IceCream flavor;
  public static final double COST = 0.15;
  
public WhippedCream(IceCream flavor){
    this.flavor = flavor;
}
public String getDescription() {
    return flavor.getDescription() + " with whipped cream";
   }
   public double cost() {
    return flavor.cost() + COST;
   }
}
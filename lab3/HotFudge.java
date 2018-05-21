public class HotFudge extends IceCreamDecorator{
    protected Dessert flavor;
    public static final double COST = .60;
    
    public HotFudge(Dessert flavor){
        this.flavor = flavor;
    }
    public String getDescription() {
        return flavor.getDescription() + " with hot fudge";
       }
       public double cost() {
        return flavor.cost() + COST;
       }
}
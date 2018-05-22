public class HotFudge extends IceCreamDecorator{
    protected IceCream flavor;
    public static final double COST = .60;
    
    public HotFudge(IceCream flavor){
        this.flavor = flavor;
    }
    public String getDescription() {
        return flavor.getDescription() + " with hot fudge";
       }
       public double cost() {
        return flavor.cost() + COST;
       }
}
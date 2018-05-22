



public class LetsEat{

    public static void main(String[] args) {
        IceCreamShop dq = new DairyQueen();
        IceCream cone;
        
        cone = dq.orderCone("Vanilla");
        cone = new Cherry(new WhippedCream(cone));
        System.out.println("Enjoying some " + cone.getDescription() + " which costs " + cone.cost());
    }
}
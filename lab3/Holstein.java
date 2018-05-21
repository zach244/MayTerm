// Test code for the decorator pattern.

public class Holstein {
 public static void main(String[] args) {
  Dessert chocolate = new Chocolate();
  Dessert vanilla = new Vanilla();

  System.out.println(vanilla.getDescription());
  System.out.println(vanilla.cost());
  System.out.println(chocolate.getDescription());
  System.out.println(chocolate.cost());
  
  // now decorate the chocolate with a cherry
  chocolate = new Cherry(chocolate);
  System.out.println(chocolate.getDescription());
  System.out.println(chocolate.cost());
  
  // now add a second cherry
  chocolate = new Cherry(chocolate);
  System.out.println(chocolate.getDescription());
  System.out.println(chocolate.cost());

  // we can also decorate an ice cream cone with
  // two cherries in a single step
  Dessert strawberry= new Strawberry();
  strawberry = new Cherry(new Cherry(strawberry));
  System.out.println(strawberry.getDescription());
  System.out.println(strawberry.cost());
//add cherry and whipped cream
vanilla = new WhippedCream(new Cherry(vanilla));
System.out.println(vanilla.getDescription());
  System.out.println(vanilla.cost());
Dessert chocolate2 = new Chocolate();
chocolate2 = new Cherry(new HotFudge(new WhippedCream(chocolate2)));
System.out.println(chocolate2.getDescription());
  System.out.println(chocolate2.cost());
 }
}

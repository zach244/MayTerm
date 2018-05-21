/**
 * Example program that uses java.util.List interface
 */

import java.util.*;

public class UseList
{
 public static void main(String[] args) {
  // polymorphism being  practiced here ....
  // we could allow fruits to be a LinkedList, Vector as well ....
  List<String> fruits = new LinkedList<String>();

  populate(fruits);

  output(fruits);
 }

 // populate the list with some values
 public static void populate(List<String> list) {
  list.add("apples");
  list.add("bananas");
  list.add("cherries");
  list.add("dates");
 }

 // output what is in the list
 // note this is not the best way to do this ....
 // more on this issue in a moment ......
 public static void output(List list) {
  Object[] items = list.toArray();
  for (int i = 0; i < items.length; i++)
   System.out.println((String)items[i]);
 }
}

/**
 * This program generates random numbers between 1 and a specified 
 * upper bound.
 */

public class RandomNumbers
{
    public static final int SIZE = 20;
    
 public static void main(String[] args) {
  if (args.length != 1) {
   System.err.println("Usage: RandomNumbers <upper bound>");
   System.exit(0);
  }

  int max = Integer.parseInt(args[0]);
  int number = 0;

  java.util.Random randomNumber = new java.util.Random();

  for (int i = 0; i < SIZE; i++) {
   number = 1+ (int)(max * randomNumber.nextFloat());
   System.out.println(number);
  }
 }
}


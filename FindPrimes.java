import java.util.*;    
public class FindPrimes
{
   private static ArrayList<Integer> myList = new ArrayList();
   
   //post: returns true if value is a prime number
   public static boolean isPrime(int value)
   {
      if(findSmallestFactor(value) == value)
         return true;
      else
         return false;
   }
   
   //post:  returns the index of the first non-prime number in myList.
   //			returns -1 if all numbers are prime
   private static int findNotPrime()
   {
      for(int x = 0; x < myList.size(); x++)
      {
         if(!isPrime(myList.get(x)))
            return x;
      }
      return -1;
   }
   
   //post:  returns the smallest factor (excluding 1) of a number
   private static int findSmallestFactor(int num)
   {
      boolean found = false;
      int factor = 2;
      while(!found)
      {
         if(num % factor == 0)
            found = true;
         else
            factor++;   
      }
      return factor;
   }
   
   //post:	recursive method that places the prime factorization into myList
   //
   private static void generateList()
   {
      int x = findNotPrime();
      if(x != -1)
      {
         int small = findSmallestFactor(myList.get(x));
         int big = (myList.get(x))/small;
         myList.set(x, small);
         myList.add(big);
         generateList();
      }
   }
   //post:  calculates the prime factorization of number and returns the list containing factors
   public static ArrayList<Integer> calculateFactors(int number)
   {
         /*	place number in myList, generate the prime factorizations and return the list.*/
      myList.add(new Integer(number));
      generateList();
      return myList;
   }	   
   public static void main(String[] arg)
   {
      
      System.out.println(8 + ":" + calculateFactors(8));
      myList.clear();
      System.out.println(23 + ":" + calculateFactors(23));
      myList.clear();
      System.out.println(60 + ":" + calculateFactors(60));
      myList.clear();
      System.out.println(75 + ":" + calculateFactors(75));
   }
}
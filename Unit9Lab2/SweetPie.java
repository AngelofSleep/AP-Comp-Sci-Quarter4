public class SweetPie extends Pie
{
   private boolean istherewhippedcream;
   public SweetPie(String f, double g, boolean t, boolean i)
   {
      super(f, g, t);
      istherewhippedcream = i;
   }
   public boolean isThereWhippedCream()
   {
      return istherewhippedcream;
   }
}
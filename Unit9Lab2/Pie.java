public class Pie extends BakersConfection
{
   private boolean topcrust;
   public Pie(String f, double g, boolean t)
   {
      super(f, g);
      topcrust = t;
   }
   public boolean isThereATopCrust()
   {
      return topcrust;
   }
}
public class Cake extends BakersConfection
{
   private int slices;
   public Cake(String f, double g, int s)
   {
      super(f, g);
      slices = s;
   }
   public int getSlices()
   {
      return slices;
   }
}
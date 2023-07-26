public class BakersConfection
{
   private String flavor;
   private double gramsofsugar;
   public BakersConfection(String f, double g)
   {
      flavor = f;
      gramsofsugar = g;
   }
   public String getFlavor()
   {
      return flavor;
   }
   public double getGramsOfSugar()
   {
      return gramsofsugar;
   }
}
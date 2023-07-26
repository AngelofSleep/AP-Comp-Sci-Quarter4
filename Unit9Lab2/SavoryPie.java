public class SavoryPie extends Pie
{
   private String meat;
   public SavoryPie(String f, double g, boolean t, String m)
   {
      super(f, g, t);
      meat = m;
   }
   public String getMeat()
   {
      return meat;
   }
}
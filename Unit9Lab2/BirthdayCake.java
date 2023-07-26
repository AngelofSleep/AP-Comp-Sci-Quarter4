public class BirthdayCake extends Cake
{
   private int candles;
   public BirthdayCake(String f, double g, int s, int c)
   {
      super(f, g, s);
      candles = c;
   }
   public int getCandles()
   {
      return candles;
   }
}
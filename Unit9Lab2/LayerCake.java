public class LayerCake extends Cake
{
   private int layers;
   public LayerCake(String f, double g, int s, int l)
   {
      super(f, g, s);
      layers = l;
   }
   public int getLayers()
   {
      return layers;
   }
}
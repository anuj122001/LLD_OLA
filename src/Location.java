package strategyImpl;
import strategy.DistanceStrategy;

public class Location {
    private int x;
    private int y;

    private DistanceStrategy strategy;

    public Location(int x,int y)
    {
        this.x=x;
        this.y=y;
    }
    public void setStrategy( DistanceStrategy strategy)
    {
        this.strategy=strategy;
    }

    public int getX(){
      return x;
  }
  public int getY(){
      return y;
  }
  public double getDistance(Location l)
  {
     if(strategy == null){
          strategy = new EuclideanStrategyClass();
     }
     return strategy.calculateDistance(this, l);
  }
}

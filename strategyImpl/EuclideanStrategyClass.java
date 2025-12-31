package strategyImpl;

import strategy.DistanceStrategy;
public class EuclideanStrategyClass implements DistanceStrategy {

    @Override
    public double calculateDistance(Location start, Location end) {
        // TODO Auto-generated method stub
       return Math.sqrt(Math.pow(start.getX() - end.getX(), 2) + Math.pow(start.getY() - end.getY(), 2));
    }
    
}

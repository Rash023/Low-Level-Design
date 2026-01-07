package snake_and_ladder;

public class Ladder {
    int startPoint=0;
    int endPoint=0;
    public Ladder(int startPoint,int endPoint){
        if(startPoint<endPoint){
            this.startPoint=startPoint;
            this.endPoint=endPoint;
        }
    }
}

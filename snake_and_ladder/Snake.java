package snake_and_ladder;

public class Snake {
    int startPoint=0;
    int endPoint=0;

    public Snake(int startPoint,int endPoint){
        if(startPoint>endPoint){
            this.startPoint=startPoint;
            this.endPoint=endPoint;
        }
    }
}

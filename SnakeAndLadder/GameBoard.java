package SnakeAndLadder;

import java.util.List;
import java.util.Map;
import java.util.OptionalInt;
import java.util.Queue;

public class GameBoard {
    private Dice dice;
    private Map<String,Integer> playersPosition;
    private Queue<Player> nextTurn;

    private List<Snake> snakes;

    private List<Ladder> ladders;

    int boardSize;

    GameBoard(Dice dice,Queue<Player> nextTurn,Map<String,Integer> playersPosition,List<Snake> snakes,List<Ladder> ladders,int boardSize){
        this.dice=dice;
        this.nextTurn=nextTurn;
        this.playersPosition=playersPosition;
        this.snakes=snakes;
        this.ladders=ladders;
        this.boardSize=boardSize;
    }

    void startGame(){
        while(nextTurn.size()>1){
            Player p1=nextTurn.poll();
            int currPos=playersPosition.get(p1.getPlayerName());
            int diceVal=dice.rollDice();
            int nextCell=diceVal+currPos;
            if(nextCell>boardSize) nextTurn.offer(p1);
            else if(nextCell==boardSize) System.out.println(p1.getPlayerName()+" Won the game");
            else{
                int []nextPosition=new int[1];
                nextPosition[0]=nextCell;
                boolean []flag=new boolean[1];
                snakes.forEach(v->{
                    if(v.startPoint==nextCell && (v.startPoint!=0 && v.endPoint!=0)){
                        nextPosition[0]=v.endPoint;
                    }
                });

                if(nextPosition[0]!=nextCell) System.out.println(p1.getPlayerName()+" Bitten by snake at "+nextCell);
                ladders.forEach(l->{
                    if(l.startPoint==nextCell && (l.startPoint!=0 && l.endPoint!=0)){
                        nextPosition[0]=l.endPoint;
                        flag[0]=true;
                    }
                });

                if(nextPosition[0]!=nextCell && flag[0]) System.out.println(p1.getPlayerName()+" Climbed the ladder at "+nextCell);
                if(nextPosition[0]==boardSize){
                    System.out.println(p1.getPlayerName()+" Has won the game!");
                }
                else {
                    playersPosition.put(p1.getPlayerName(),nextPosition[0]);
                    System.out.println(p1.getPlayerName()+" is at position "+nextPosition[0]);
                    nextTurn.offer(p1);

                }
            }
        }
    }
}

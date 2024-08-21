package SnakeAndLadder;

public class Player {
    private String playerName;
    private int id;

    public Player(String playerName,int id){
        this.playerName=playerName;
        this.id=id;

    }

    String getPlayerName(){
        return this.playerName;
    }
}

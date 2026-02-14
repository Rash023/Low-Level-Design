package tic_tac_toe;

public class GameContext {
    private GameState currentState;

    public GameContext(){
        currentState=new XTurnState();
    }

    public void setState(GameState gameState){
        this.currentState=gameState;
    }

    public void next(Player player,boolean hasWon){
        currentState.next(this,player,hasWon);
    }

    public boolean isGameOver(){
        return currentState.isGameOver();
    }

    public GameState getCurrentState(){
        return currentState;
    }
}

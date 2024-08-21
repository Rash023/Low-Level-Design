package SnakeAndLadder;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Dice dice=new Dice(2);
        Player p1=new Player("Rashid",1);
        Player p2=new Player("Alice",2);
        Player p3=new Player("Bob",3);
        Queue<Player> Lobby=new LinkedList<>();
        Lobby.offer(p1);
        Lobby.offer(p2);
        Lobby.offer(p3);
        Snake snake1=new Snake(10,2);
        Snake snake2=new Snake(99,1);
        List<Snake> snakes=new ArrayList<>();
        snakes.add(snake1);
        snakes.add(snake2);
        Ladder ladder1=new Ladder(4,15);
        Ladder ladder2=new Ladder(10,88);
        List<Ladder> ladders=new ArrayList<>();
        ladders.add(ladder1);
        ladders.add(ladder2);
        Map<String,Integer> playerPosition=new HashMap<>();
        playerPosition.put(p1.getPlayerName(),0);
        playerPosition.put(p2.getPlayerName(),0);
        playerPosition.put(p3.getPlayerName(),0);
        GameBoard gb=new GameBoard(dice,Lobby,playerPosition,snakes,ladders,100);
        gb.startGame();

    }
}

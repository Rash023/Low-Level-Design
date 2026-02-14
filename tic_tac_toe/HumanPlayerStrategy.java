package tic_tac_toe;

import java.util.Scanner;

public class HumanPlayerStrategy implements PlayerStrategy{

    private Scanner scanner;
    private String playerName;

    public HumanPlayerStrategy(String playerName){
        this.playerName=playerName;
        this.scanner=new Scanner(System.in);
    }

    @Override
    public Position makeMove(Board board){

        while(true){
            System.out.printf("Enter your move row(0-2) and col(0-2):",playerName);
            try{
                int row=scanner.nextInt();
                int col=scanner.nextInt();
                Position move=new Position(row,col);
                if(board.isValidMove(move)){
                    return move;
                }
                System.out.println("Invalid move please try again!");
            }
            catch (Exception e){
                System.out.println("Invalid input: please enter row and col as numberrs");
                scanner.nextLine();
            }
        }
    }
}

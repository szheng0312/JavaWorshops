import java.util.Scanner;
import java.util.Random;

public class W2P3RPS{
    public static void main(String[] arg){
        Scanner input = new Scanner(System.in);
        int games = 0;
        int wins = 0;
        String userWin = "False";
        while (games != 3){
            userWin = "None";
            System.out.println("Choose a move to play. Type 1 for rock, 2 for paper, and 3 for scissors.");
            int user = input.nextInt();
            int computerMove = (int) (3 * Math.random() + 1);
            if (user == 1){
                if (computerMove == 2){
                    userWin = "False";

                } else if (computerMove == 3){
                    userWin = "True";
                }
            } else if (user == 2){
                if (computerMove == 1){
                    userWin = "True";
                } else if (computerMove == 3){
                    userWin = "False";
                }
            } else if (user == 3){
                if (computerMove == 1){
                    userWin = "False";
                } else if (computerMove == 2){
                    userWin = "True";
                } 
            }
            if (userWin == "True"){
                games ++;
                wins ++;
                System.out.println("Congradulations, you won the round!");
        
            } else if (userWin == "False"){
                games ++;
                System.out.println("Oops, you lost!");
            } else {
                System.out.println("The game was a tie!");
            }

        }
        System.out.println("You won " + wins + " games out of 3.");

    }
}
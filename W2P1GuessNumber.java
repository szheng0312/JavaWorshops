import java.util.Scanner;
import java.util.Random;

public class W2P1GuessNumber {
    public static void main(String[] args){
        Scanner ans = new Scanner(System.in);
        int surpriseNum = (int) (10 * Math.floor(Math.random()) + 1);
        System.out.println("Guess a number between and including 1 to 10.");
        int guess = ans.nextInt();
        while (guess != surpriseNum) {
            System.out.println("Your answer is wrong, guess again!");
            guess = ans.nextInt();
        }
        System.out.println("You are right! The number I was thinking of is " + surpriseNum);
    }
}

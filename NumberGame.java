import java.util.*;
import java.util.Random;

public class NumberGame {
    public static void main(String[] args) {
        System.out.println("\t\t\tNumber Game");

        Random ran = new Random();
        int number, guess_number, limit = 3,score = 1;
        number = ran.nextInt(100);
        System.out.println("Generated Number: " + number );

        Scanner sc = new Scanner(System.in);

        while(true) {
            System.out.println("Guess Number: ");
            guess_number = sc.nextInt();

            if ((guess_number < number) && (limit > 1)) {
                limit--;
                score++;
                System.out.println("The Number is higher than the guessed number. Please try again!!\n Limits left: " + (limit));
            } else if ((guess_number > number) && (limit > 1)) {
                limit--;
                score++;
                System.out.println("The Number is lower than the guessed number. Please try again!!\n Limits left: " + (limit));
            } else if ((guess_number == number) && (limit > 1)) {
                System.out.println("Equal");
                break;
            }
            else{
                score=0;
                break;
            }
        }
            switch(score) {
                case 1:
                    System.out.println("Score = 1. You did a great job");
                    break;
                case 2:
                    System.out.println("Score = 2. Good job");
                    break;
                case 3:
                    System.out.println("Score = 3. Could have been better. Play Again..");
                    break;
                default:
                    System.out.println("Wrong Answer \nOut of limits...");
                    break;
            }
    }
}
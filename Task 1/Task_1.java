import java.util.*;
public class Task1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome!!");
        int max = 10;
        int score = 100;
    
        while (true) {
            int n = (int)Math.floor(Math.random()*100);
            int guesses = 0;
            while(guesses<max){
                System.out.print("Enter your guess: ");
                int num = sc.nextInt();
                sc.nextLine();
                guesses++;
                if (num == n) {
                    System.out.println("Congratulations! You guessed the correct number in " + guesses + " attempts.");
                    score = score - (guesses*10);
                    break;
                } else if (num < n) {
                    System.out.println("Too low. Try again.");
                } else {
                    System.out.println("Too high. Try again.");
                }

                if (guesses == max) {
                    System.out.println("You've reached the maximum number of attempts. The correct number was " + n);
                }
            }

            System.out.print("Do you want to play again? (yes/no): ");
            String str = sc.nextLine();
         
            if (!str.equals("yes")) {
                System.out.println("Your total score is: " + score);
                break;
            }
        }
     
}
}

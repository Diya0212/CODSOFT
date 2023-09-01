import java.util.*;
public class Task_1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = (int)Math.floor(Math.random()*100);
        System.out.println(n);
        
        System.out.print("No. of guesses u need to find the correct number : ");
        int guess = sc.nextInt();
        System.out.print("Enter your guess for the generated number : ");
        int num = sc.nextInt();
        while(guess>0){
            if(num>n){
                System.out.println("\tTry a smaller number");
            }
            else if(num<n){
                System.out.println("\tTry a larger number");

            }
            else{
                System.out.println("Congratulations,YOU WON!!!!");
                break;
            }
            if(guess>1){
                num = sc.nextInt();
                guess--;
            }
        
            if(guess==1){
                if(num==n){
                    System.out.println("Congratulations,YOU WON!!!!");
                    break;
                }
                else{
                System.out.println("Sorry , YOU LOST");
                System.out.println("Correct number was :"+ n);
                }
                System.out.println("Would you like to play again ? Enter Yes to play again " );
                String ch = sc.next();

                if(ch.charAt(0)=='Y'||ch.charAt(0)=='y' ){
                    n = (int)Math.floor(Math.random()*100);
                    System.out.print("No. of guesses u need to find the correct number : ");
                    guess = sc.nextInt();
                    
                    System.out.print("Enter your guess for the generated number : ");
                    num = sc.nextInt();
                
                }
            
                else{
                    break;
                }
            }

            }            
        }   

    }

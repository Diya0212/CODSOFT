import java.util.*;
public class Task_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the number of subjects");
        int n = sc.nextInt();
        double arr[] = new double[n];
        int i =0;
        double sum =0;
        int total = n*100;
        while(n>0){
            System.out.println("Enter marks : ");
                arr[i] = sc.nextDouble();
                sum = sum +arr[i];
                i++;
                n--;
            }
            float avg = (float)(sum/total)*100;
       
            System.out.println("You have secured "+ String.format("%.2f", sum)+" marks");
            System.out.println("Your average percentage is "+avg);
            if(avg<=32){
                System.out.print(" Sorry , You failed.");

            }
            else if(avg>=33 && avg<=40){
                System.out.print("Congratulations, you passed with D grade.");
            }

            else if(avg>=41 && avg<=50){
                System.out.print("Congratulations, you passed with C2 Grade");
            }

            else if(avg>=51 && avg<=60){
                System.out.print("Congratulations, you passed with C1 grade.");
            }

            else if(avg>=61 && avg<=70){
                System.out.print("Congratulations, you passed with B2 Grade");
            }

            else if(avg>=71 && avg<=80){
                System.out.print("Congratulations, you passed with B1 grade.");
            }

            else if(avg>=81 && avg<=90){
                System.out.print("Congratulations, you passed with A2 Grade");
            }
            else{
                System.out.print("Congratulations, you passed with A1 grade.");
            }
            
        }
    
    }


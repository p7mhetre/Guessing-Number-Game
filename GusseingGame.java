import java.util.Scanner;
import java.lang.Math;

public class GusseingGame {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int attempt=0,t=0;
        int min=0,max=100;
        System.out.println("Guess Number between 1 to 100 ");
        int randomNo=(int)(Math.random()*(max-min+1)+min);
        int limit=0;
        while(limit==0)
        {
            
            System.out.println("Enter number : ");
            int no=sc.nextInt();
            //System.out.println("Guessed number is = "+randomNo);
            if(no==randomNo){
                attempt++;
                System.out.println("Guessed Number is correct ");
                System.out.println("You Guessed right number at "+attempt+" th  attempts");
                limit=1;
            }
            else{
                if(no<randomNo){
                System.out.println("Guessed Number is less than generated number .");
                attempt++;
                }
                else{
                System.out.println("Guessed number is greater than generated number .");
                attempt++;
                }
                limit=0;
            }
            System.out.println();
        }
    }
}

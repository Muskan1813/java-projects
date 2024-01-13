import java.util.Random;
import java.util.Scanner;
public class RockPaperScissors{
    public static void main(String[]args){
        String computerChoice = " ";
        String yourChoice = " ";
        Random rn = new Random();
        int computer = rn.nextInt(3);
        if(computer == 0){
          computerChoice = "rock";
        }
        if(computer == 1){
            computerChoice = "scissors";
        }
        if(computer == 2){
            computerChoice = "paper";
        }
        System.out.println("Enter you choice (0 = rock , 1 = scissors , 2 = paper) : ");
        Scanner sc = new Scanner(System.in);
        int your = sc.nextInt();
        if(your == 0){
            yourChoice = "rock";
        }
        if(your == 1){
            yourChoice = "scissors";
        }
        if(your == 2){
            yourChoice = "paper";
        }
        System.out.println("your choice is " + yourChoice);

        if (computer == your){
            System.out.printf("it is a tie as computer selected %s%n" , computerChoice);
        }
        if (computer == 0 && your == 1){
            System.out.printf("you lost as computer selected %s%n" , computerChoice);
        }
         if (computer == 1 && your == 2){
            System.out.printf("you lost as computer selected %s%n" , computerChoice); 
    }
        if (computer == 2 && your == 0){
             System.out.printf("you lost as computer selected %s%n", computerChoice);
        }
        if (computer == 0 && your == 2){
            System.out.printf("you win as computer selected %s%n", computerChoice);
        }
        if (computer == 1 && your == 0){
            System.out.printf("you win as computer selected %s%n", computerChoice);
        }
        if (computer == 2 && your == 1){
            System.out.printf("you win as computer selected %s%n", computerChoice);
        }
    }
}
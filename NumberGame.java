import java.util.Random;
import java.util.Scanner;

public class NumberGame
{
    public static void main(String args[])
    {
        int i;
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int random_no = random.nextInt(100)+1;
        for(i=1;i<=10;++i)
        {
            
            System.out.println("Enter your guessing number (1-100):");
            int guess = scanner.nextInt();
            if(guess < 1 || guess > 100)
            {
                System.out.println("Invalid guess.\nTry again!");
            }
            else if(random_no == guess)
            {
                System.out.println("You win the game!!!");
                break;
            }
            else if(random_no > guess)
            {
                System.out.println("Your guess number is too low.\nPlay again!");
            }
            else if(random_no < guess)
            {
                System.out.println("Your guess number is too high.\nPlay agian!");
            }
        
        }        
        if (i>10)
        {
            System.out.println("You Lose.\nBetter luck next time.");
        }
        else
        {
            System.out.println("Congratulations.\nYour are very lucky.");
        }
        System.out.println("Your attempts "+i);
    }
}

import java.util.*;
import java.util.Random;
public class NumberGaming{
    public static void main(String[] args){
        Random rand= new Random();
        Scanner scanner=new Scanner(System.in);

        int randomNumber =rand.nextInt(100) + 1 ;

        int tryCount=0;
        System.out.println("Random number is"+randomNumber);
        while (true) {
        System.out.println("Enter your guess (1-100):");
        int playerGuess = scanner.nextInt();
        tryCount++;
        
        if(playerGuess == randomNumber){
            System.out.println("correct ! you win!"); 
            System.out.println("It took you " +tryCount+  " tries ");
            break;
        }
        else if(randomNumber > playerGuess){
            System.out.println("Nope! The number is higher. Guess again");
        }
        else{
            System.out.println("Nope! The number is low. Guess again");
        }
    }
}
}

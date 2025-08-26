import java.util.Random;
import java.util.Scanner;

public class guessNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Random ran=new Random();
        int systemGuess=ran.nextInt(100);
        int userGuess;
        do{
            System.out.println("Enter Guess nNumber!");
            userGuess=sc.nextInt();
            if (systemGuess==userGuess) {
                System.out.println("correct guess");
                break;
            }else if(userGuess>systemGuess){
                System.out.println("Too high");
            }else if(userGuess<systemGuess){
                System.out.println("Too low");
            }
            else{
                System.out.println("correct");
            }
        }while(true);
    }
}

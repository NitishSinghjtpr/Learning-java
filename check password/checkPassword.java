import java.util.Scanner;

public class checkPassword {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int myPassword=811302;
        int userPassword;
        do{
            System.out.println("Enter your password");
            userPassword =sc.nextInt();
         if(myPassword==userPassword){
            System.out.println("Correct your password Ewlcome!");
            break;
         }else{
            System.out.println("Wrong password Try Again!");
         }
        }while (true);sc.close();    
     }
}



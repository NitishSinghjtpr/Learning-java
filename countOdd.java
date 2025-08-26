import java.util.Scanner;

public class countOdd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number");
        int number=sc.nextInt();
        int sum=0,i=1;
        while (i<=number) {
            sum+=i;
            i=i+2;

        }
        System.out.println(sum);
        sc.close();
    }
}

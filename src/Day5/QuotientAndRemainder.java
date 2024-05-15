package Day5;
import java.util.Scanner;
public class QuotientAndRemainder {
    //Print the quotient and remainder of program
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num=sc.nextInt();

        int quotientValue=num / 10;
        int remainderValue=num % 10;

        System.out.println("quotientValue is :"+ quotientValue);
        System.out.println("remainderValue is :"+ remainderValue);

    }
}

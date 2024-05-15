package Day5;
import java.util.Scanner;
public class Practice {
    // Check is the number is prime or not
        public static void main(String[] args) {

            Scanner sc=new Scanner(System.in);
            System.out.print("Enter the number: ");
            int input=sc.nextInt();

            boolean isPrime = true;
            for(int i=2;i<input;i++){ // if any numbers quotient is equal to zero then the number is not prime
                if(input % i==0){
                    isPrime=false;
                    break;
                }
            }
            if (isPrime && input > 1) {
                System.out.print(input + " is a prime number.");
            } else {
                System.out.print(input + " is not a prime number.");
            }sc.close();
        }
    }


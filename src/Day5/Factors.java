package Day5;
import java.util.Scanner;
public class Factors{//find the prime factors of the number

    public static void factors(int num) {
        for (int i = 2; i <= num; i++) {
            if (num % i == 0) {
                boolean prime = true;//if true then we got the factor now check the factor is prime or not
                for (int j = 2; j < i; j++) {
                    if (i % j == 0) {
                        prime = false;
                        break;
                    }
                }
                if (prime) {
                    System.out.println(i);
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int num = sc.nextInt();
        factors(num);
        sc.close();
        }
    }


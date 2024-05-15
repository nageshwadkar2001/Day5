package Day5;
import java.util.Scanner;
public class Power2 {
//for int upto 2^30 is allowed if we give input more than that then we get the
    public static double pow2(int num)
    {
        double result=Math.pow(2,num);
                return result;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number :");
        int num=sc.nextInt();
        if (pow2(num)<=(Integer.MAX_VALUE )){
            System.out.println("2 ^ "+ num + "is "+ (int)pow2(num));
        }
        else {
            System.out.println("Stack is overflow");
        }

    }
}

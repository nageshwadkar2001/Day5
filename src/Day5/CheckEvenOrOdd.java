package Day5;

import java.util.Scanner;

public class CheckEvenOrOdd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num=sc.nextInt();

        if (num % 2 ==0)
            System.out.println(num +" is Even Number ");
        else
            System.out.println(" is Odd Number ");
    }
}

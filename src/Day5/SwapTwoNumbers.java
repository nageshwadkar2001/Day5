package Day5;

public class SwapTwoNumbers {
    public static void main(String[] args) {
        int num1=10;
        int num2=20;

        int temp=num1;//For some time the number is stored in temp
        num1=num2;
        num2 =temp;

        System.out.println("After Swapping two numbers are  : "+ num1 + " "+ num2);
    }
}

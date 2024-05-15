package Day5;
import java.util.Scanner;
public class HarmonicNumber {
	//Find the harmonic series upto the specific number if num=10,means upto 1/1,1/2,1/3......1/10

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number ");
		int num=sc.nextInt();
		
		double result=0.0;

		System.out.println("Harmonic series:");
		for (int i=1; i <=num;i++) {
			result=result + (double)1/i;
			System.out.println(result + ",");
		}
	}

}

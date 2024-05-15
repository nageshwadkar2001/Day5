package Day5;

import java.util.Random;
import java.util.Scanner;

public class FlipCoin {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please Enter the number of times to flip the coin :");
		int flipCount=sc.nextInt();//input for to number of time flip coin
		
		int headCount=0;
		int tailCount=0;
		
		Random random=new Random();
		
		for (int i=0; i < flipCount; i++){	
		double num=random.nextDouble();
		
		if (num < 0.5) {
			tailCount++;
		}
		else {
			headCount++;
		}
	}
		int headPercent = (headCount * 100) / flipCount;
        int tailPercent = (tailCount * 100) / flipCount;
        
        System.out.println("Total FlipCount :" + flipCount);
        System.out.println("HeadCount :" + headCount);
        System.out.println("TailCount :" + tailCount);
		System.out.println("Head Percentage is :" + headPercent);
		System.out.println("TailPercentage is :"+ tailPercent);
	}

}

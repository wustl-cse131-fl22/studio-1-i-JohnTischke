package studio1;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("What is the first of your two integers you intend to average?");
		int n1 = in.nextInt();
		
		System.out.println("What is the second of your two integers you intend to average?");
		int n2 = in.nextInt();
		
		double ave = ((n1 + n2)/2.0);
		
		System.out.println("The average is " + ave + ".");
		
		
	}

}

package pkg;

import java.util.Scanner;

public class Factorials {
	public static void main(String[] args) throws IllegalArgumentException{
		String S = "y";
		Scanner scan=new Scanner(System.in);
		
		
		while(S.equals("y") || S.equals("Y")) {
			try {
			System.out.println("Enter an integer: ");
			int val=scan.nextInt();
			System.out.println("Factorial(" + val + ")=" + MathUtils.factorial(val));
			System.out.println("Another factorial? (y/n) ");
			S = scan.next();
		}
		catch(IllegalArgumentException e) {
			System.out.println("Exception occured"+e);
		}
	}
		scan.close();
	}
}

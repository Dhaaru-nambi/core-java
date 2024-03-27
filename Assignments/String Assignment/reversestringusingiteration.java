package pkg;

import java.util.Scanner;

public class ReverseString {
public static void main(String[] a) {
	Scanner myObj = new Scanner(System.in);
	String str = myObj.next();  
	for(int index=str.length()-1;index>=0;index--) {
		System.out.print(str.charAt(index));
	}
}
}

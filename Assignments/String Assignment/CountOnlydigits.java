package pkg;
import java.util.*;
public class Stringass {
public static void main(String[] args) {
	Scanner myObj = new Scanner(System.in);
	String str = myObj.next();
	int count=0;
	for(int i=0;i<str.length();i++) {
		if(Character.isDigit(str.charAt(i))){
			count+=1;
		}
	}
	if(count==str.length()) {
		System.out.println("Only digits");
	}
	else {
		System.out.println("Contain alphabets");
	}
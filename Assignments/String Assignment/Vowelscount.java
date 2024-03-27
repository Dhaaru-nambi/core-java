package pkg;
import java.util.*;
public class Stringass {
public static void main(String[] args) {
	Scanner myObj = new Scanner(System.in);
	String str = myObj.next();
int vowel=0;
	int consonant=0;
	char data[]= {'a','e','i','o','u','A','E','I','O','U'};
	for(int i =0;i<str.length();i++) {
		int k=0;
		for(int j=0;j<data.length;j++) {
			if(data[j]==str.charAt(i)) {
				k=1;
			}
		}
		if(k==1) {
			vowel+=1;
		}
		else {
			consonant+=1;
		}
		
	}
	System.out.println(vowel);
	System.out.println(consonant);
	}
}
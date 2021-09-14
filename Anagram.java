package Assignment1;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String val1 ="hello";
		String val2 ="hello";
		int lenth1 = val1.length();
		int length2 = val2.length();
		
		if(lenth1==length2) {
			System.out.println("Yes, they are equal in length");
		}
		else {
			System.out.println("Their lengths are different");
		}
		
		char[] valChar = val1.toCharArray();
		System.out.println("Char1 "+Arrays.toString(valChar));
		Arrays.sort(valChar);
		System.out.println("Sorted Val1 "+Arrays.toString(valChar));
		char[] val2Char = val2.toCharArray();
		System.out.println(val2Char);
		Arrays.sort(val2Char);
				System.out.println("Sorted Val2 "+Arrays.toString(val2Char));
				if((val1)==(val2)) {
					System.out.println("Both values are same");
				}
				else {
					System.out.println("They are different");
				}
	}

	
}

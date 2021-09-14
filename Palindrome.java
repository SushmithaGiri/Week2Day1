package Assignment1;

public class Palindrome {
	
	
	
	public static void main(String[] args) {
		String OriginalValue = "MADAM";
		char[] val= OriginalValue.toCharArray();
		System.out.println(val);
		int length = val.length;
		System.out.println(+length);
	
		for(int i=length-1;i<=length-1;i--) {
			
			for(int a=0;a<=length-1;a++) {
			char value = val[a];
			char reverseVal = val[i];
			
			
			 System.out.println("value is  "+value);
			  System.out.println("rev val "+reverseVal);
			 
			if((reverseVal)==(value)) {
								System.out.println("Its matching");
								i--;
								if((val).equals(reverseVal)) {
								System.out.println(+reverseVal +": Its a palindrome");
								}	
			}
			else {
				System.out.println(" Its not a palindrome");
			}
			}
		}
	

	}

}

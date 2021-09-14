package Assignment1;

public class FindType {

	public static void main(String[] args) {
		String test = "Welcome  2  testLeaf!!!";
		int letter = 0, space = 0, num = 0, specialChar = 0;
		char[] testChar = test.toCharArray();
		System.out.println("String to char" + testChar.toString());
		int length = testChar.length;

		for (int i = 0; i <= length - 1; i++) {
			char EachChar = testChar[i];
			// System.out.println("Each character "+EachChar);
			if (Character.isLetter(EachChar)) {
				letter = letter + 1;

			} else if (Character.isDigit(EachChar)) {
				num = num + 1;

			} else if (Character.isSpace(EachChar)) {

				space = space + 1;
			} else {
				specialChar=specialChar+1;
				
			}

		}

		System.out.println("letter: " + letter);
		System.out.println("number: " + num);
		System.out.println("space: " + space);
		System.out.println("Special charater : "+specialChar);
	}

}

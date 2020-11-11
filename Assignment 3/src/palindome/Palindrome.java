package palindome;

public class Palindrome {

	public String palindromeCheck(String string) {
		String reverseString = "";
		for (int i = string.length() - 1; i >= 0; i--) {
			reverseString = reverseString + string.charAt(i);
		}
		System.out.println(reverseString);
		if (reverseString.equals(string)) {
			return "Yes";
		} else {
			return "NO";
		}
	}
}

/**
 * 
 */
package stringmiddlecharacter;

/**
 * @SaiKumar
 *
 */
public class StringMiddleCharcter {
	private String string;

	public void setString(String string) {
		this.string = string;
	}

	public String middleCharcter() {
		int middle = (string.length()) / 2;
		if (string.length() % 2 != 0) {

			char middleChar = string.charAt(middle);
			return Character.toString(middleChar);
		} else {
			return string.charAt(middle-1) + "," + string.charAt(middle);

		}
	}

}

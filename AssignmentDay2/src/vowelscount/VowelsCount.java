package vowelscount;

public class VowelsCount {

	private String string;

	public void setString(String string) {
		this.string = string;
	}

	public int vowelsCount() {
		int count = 0;
		for (int i = 0; i < string.length(); i++) {
			string = string.toUpperCase();
			char character = string.charAt(i);

			if (character == 'A' || character == 'E' || character == 'I' || character == 'O' || character == 'U') {
				count += 1;
			}
		}
		return count;
	}
}
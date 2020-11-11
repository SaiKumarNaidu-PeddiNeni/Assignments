package stringreshape;

public class StringReshape {
	
	public String stringReshape(String string, char additive)
	{
		String reshapedString = "";
		for (int i = string.length()-1; i >= 0; i--) {
			if(i!=0)
			{
				reshapedString = reshapedString + string.charAt(i) + additive;
			}
			else
			{
				reshapedString = reshapedString + string.charAt(i);
			}
		}
		return reshapedString;
	}
}

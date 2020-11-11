package strigmodification;

public class StringModification {
	
	
	public String ModifyTheString(String string)
	{
		if((string.charAt(0)== 'k' || string.charAt(0)== 'K') && (string.charAt(1)== 'b' || string.charAt(1)== 'B'))
		{
			return string;
		}
		else if (string.charAt(0)== 'k' || string.charAt(0)== 'K')
		{
			return string.charAt(0) + string.substring(2, string.length());
		}
		else if (string.charAt(1)== 'b' || string.charAt(1)== 'B')
		{
			return string.charAt(1) + string.substring(2, string.length());
		}
		else
		{
			return string.substring(2, string.length());
		}
	}

}

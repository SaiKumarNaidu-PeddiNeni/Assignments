package panagram;

public class Panagram {
	
	public String checkPanagram(String string)
	{
		int count =0;
		string =string.toUpperCase();
		for (int j = 0; j < string.length(); j++) {
			if(string.charAt(j) >= 'A' && string.charAt(j) <= 'Z' )
			{
				string = string.replace(string.charAt(j), ' ');
				count++;
			}
		}
		if(count == 26)
		{
			return "yes";
		}
		else
		{
			return "no";
		}
		
	}

}

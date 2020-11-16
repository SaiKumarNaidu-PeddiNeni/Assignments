package countingVowels;
import java.lang.*;
public class SwitchBehaviour {
	String string = null;
	
	int findVowels(String string)
	{  int count=0;
		for(int i=0;i<string.length();i++)
		{
			string=string.toUpperCase();
			switch((string.charAt(i)))
			{
			case 'A':
				count+=1;
				break;
			case 'E' :
				count+=1;
				break;
			case 'I':
				count+=1;
				break;
			case 'O':
				count+=1;
				break;
			case 'U':
				count+=1;
				break;
			}
			
		}
		return count;
	}
	
}

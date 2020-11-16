package pattern;

public class Pattern {
		
	int i=0;
	public void printPattern()
	{
		for(i=1; i<=100;i++)
		{
			if(i%3==0 && i%5!=0)
			{
				System.out.print(" fizz ");
			}
			else if(i%5==0 && i%3!=0)
			{
				System.out.print(" buzz ");
			}
			else if(i%3==0 && i%5==0)
			{
				System.out.print(" fizz buzz ");
			}
			else
			{
				System.out.print(i+" ");
			}
			
		}
	}
}

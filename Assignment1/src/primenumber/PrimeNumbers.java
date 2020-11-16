package primenumber;

public class PrimeNumbers {
	private int number;

	/*
	 * for(public int getNumber() { return number; }
	 */
	public void setNumber(int number) {
		this.number = number;
	}
	public String prime()
	{
		int flag = 0; 
		for(int i=2;i<number ;i++)
		{
			if(number%i==0)
			{
				flag=1;
				break;
			}
		}
		if(flag==0)
		{
			return "Prime";
		}
		else
		{
			return "Not Prime";
		}
	}

}

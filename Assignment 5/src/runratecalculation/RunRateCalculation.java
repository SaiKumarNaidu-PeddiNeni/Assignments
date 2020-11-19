package runratecalculation;

public class RunRateCalculation {
	
	public void runRate(int totalRuns, int overs)
	{
		try
		{
			int runRate;
			System.out.println(totalRuns);
			System.out.println(overs);
			runRate = (int)(totalRuns/overs);
			System.out.println("total run_rate is"+ runRate);
		}
		catch(NumberFormatException | ArithmeticException e )
		{
			System.out.println(e);
		}
	}
}

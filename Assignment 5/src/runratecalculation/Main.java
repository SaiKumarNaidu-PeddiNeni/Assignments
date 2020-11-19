package runratecalculation;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		InputStreamReader is = new InputStreamReader(System.in);
		
		BufferedReader read= new BufferedReader(is);
		int totalRuns=0;
		int overs=0;
		try
		{
		System.out.println("enter total runs");
		totalRuns = Integer.parseInt(read.readLine());
		System.out.println("enter overs");
		overs = Integer.parseInt(read.readLine());
		}
		catch(NumberFormatException e )
		{
			System.out.println(e);
		}
		
		RunRateCalculation runRateCalculation = new RunRateCalculation();
		
		runRateCalculation.runRate(totalRuns,overs);
		
	}

}

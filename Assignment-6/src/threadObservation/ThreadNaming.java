package threadObservation;

import java.time.LocalDateTime;

public class ThreadNaming extends Thread {
	
	public ThreadNaming(String string)
	{
		super(string);
	}
	@Override
	public void run()
	{
		System.out.println(LocalDateTime.now());
		
	}

}
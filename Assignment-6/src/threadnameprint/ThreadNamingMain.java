
/*Write a program to assign the current thread to t1. 
 * Change the name of the thread to MyThread. Display the changed name of the thread.
 *  Also it should display the current time.
 *   Put the thread to sleep for 10 seconds and display the time again.
*/
package threadnameprint;

public class ThreadNamingMain {

	public static void main(String[] args) {
		Thread thread = new ThreadNaming("MyThread");
		
		System.out.println(thread.getName());
		thread.run();
		try
		{
			Thread.sleep(10000);
		}
		catch(Exception e)
		{
		}
		
		thread.run();
	}

}

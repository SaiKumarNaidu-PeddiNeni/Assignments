package runnableinterfacethread;

/*Write a program to create a class RunnableInterfaceThread implementing Runnable interface. 
 * In the constructor, create a new thread and start the thread. 
 * In run() display a message "running child Thread in loop : " display the value of the counter ranging from 1 to 10. 
 * Within the loop put the thread to sleep for 2 seconds. 
 * In main create 3 objects of the DemoTread1 and execute the program.
*/
public class RunnableInterfaceMain {

	public static void main(String[] args) {
		RunnableInterfaceThread thread1 = new RunnableInterfaceThread();
		RunnableInterfaceThread thread2 = new RunnableInterfaceThread();
		RunnableInterfaceThread thread3 = new RunnableInterfaceThread();

		Thread myThread1 = new Thread(thread1);
		Thread myThread2 = new Thread(thread2);
		Thread myThread3 = new Thread(thread3);

		myThread1.start();
		try {
			Thread.sleep(20000);
		} catch (Exception e) {
		}
		myThread2.start();
		try {
			Thread.sleep(20000);
		} catch (Exception e) {
		}
		myThread3.start();
		try {
			Thread.sleep(20000);
		} catch (Exception e) {
		}
	}
}

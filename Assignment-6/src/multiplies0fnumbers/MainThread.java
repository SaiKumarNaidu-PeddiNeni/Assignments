package multiplies0fnumbers;

public class MainThread {

	public static void main(String[] args) throws InterruptedException {
		Threadclass myThread1 = new Threadclass();
		Threadclass myThread2 = new Threadclass();
		Threadclass myThread3 = new Threadclass();

		Thread thread1 = new Thread(myThread1);
		Thread thread2 = new Thread(myThread2);
		Thread thread3 = new Thread(myThread3);

		// showThreadStatus(thread1);
		System.out.println(thread1.getState() + " thread initiated ");
		thread1.start();
		Thread.sleep(10000);
		System.out.println(thread1.getState() + " terminated ");

		System.out.println(thread2.getState() + " thread initiated ");
		myThread2.run(5);
		thread2.start();
		Thread.sleep(10000);
		System.out.println(thread2.getState() + " terminated ");

		System.out.println(thread3.getState() + " thread initiated ");
		myThread3.run(8);
		thread3.start();
		Thread.sleep(10000);
		System.out.println(thread3.getState() + " terminated ");
	}

}

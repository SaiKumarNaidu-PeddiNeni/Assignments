package threadimp;

public class MainThread {

	public static void main(String[] args) {
		Thread myThread1 = new MyThread();
		Thread myThread2 = new MyThread();
		Thread myThread3 = new MyThread();

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

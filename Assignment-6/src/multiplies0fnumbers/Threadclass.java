package multiplies0fnumbers;

public class Threadclass implements Runnable {

	private int number;

	public void run(int number) {
		this.number = number;

	}

	@Override
	public void run() {

		if (number == 2) {
			for (int i = 1; i <= 10; i++) {
				System.out.println("2 * " + i + " = " + 2 * i);
			}
		}
		if (number == 5) {
			for (int i = 1; i <= 10; i++) {
				System.out.println("5 * " + i + " = " + 5 * i);
			}
		}
		if (number == 8) {
			for (int i = 1; i <= 10; i++) {
				System.out.println("8 * " + i + " = " + 8 * i);
			}
		}

	}

}

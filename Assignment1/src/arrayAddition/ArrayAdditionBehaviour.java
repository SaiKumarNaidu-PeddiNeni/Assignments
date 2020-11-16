package arrayAddition;

public class ArrayAdditionBehaviour {
	public int size;
	ArrayAdditionBehaviour sum;

	int arrayAddition(Integer[] array) {
		int sum = 0;
		for (int i : array) {
			sum += i;
		}
		return sum;
	}
}

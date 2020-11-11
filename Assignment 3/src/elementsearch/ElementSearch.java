package elementsearch;

public class ElementSearch {

	private int[] array;

	public void arraySize(int size) {
		array = new int[size];
	}

	public void setArray(int element, int index)

	{
		for (int i = 0; i < array.length; i++) {

			array[index] = element;

		}
	}

	public boolean elementSearch(int value) {
		boolean result = false;
		for (int i = 0; i < array.length; i++) {
			if (array[i] == value) {
				result = true;
			}

		}
		return result;
	}

}

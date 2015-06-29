public class Sort<T> {
	/**
	 * 选择排序
	 * 
	 * @param array
	 */
	public static <T extends Comparable<? super T>> void selectionSort(T[] array) {
		int n = array.length;
		for (int i = 0; i < n; i++) {
			int min = i;
			for (int j = i + 1; j < n; j++) {
				if (array[min].compareTo(array[j]) > 0)
					min = j;
			}
			Swap(array, i, min);
		}
	}
	/**
	 * 插入排序
	 * @param array
	 */
	public static <T extends Comparable<? super T>> void insertionSort(T[] array) {
		int n = array.length;
		for (int i = 1; i < n; i++) {
			for (int j = i; j > 0; j--) {
				if (array[j].compareTo(array[j - 1]) < 0) {
					Swap(array, j, j - 1);
					printArray(array);
				} else {
					break;
				}
			}
		}

	}

	private static <T extends Comparable<? super T>> void Swap(T[] array,
			int i, int min) {
		T temp = array[i];
		array[i] = array[min];
		array[min] = temp;
	}

	public static <T extends Comparable<? super T>> void printArray(T[] array) {
		System.out.print("[");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println("]");
	}
}

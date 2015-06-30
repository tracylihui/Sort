import org.junit.Test;

public class SortTest {

	@Test
	public void testSelectionSort() {
		Integer[] array = { 3,6,8,2,1,4,9,5,7 };
		Sort.printArray(array);
		Sort.selectionSort(array);
		Sort.printArray(array);
	}
	@Test
	public void testInsertionSort() {
		Integer[] array = { 3,6,8,2,1,4,9,5,7 };
		Sort.printArray(array);
		Sort.insertionSort(array);
		Sort.printArray(array);
	}
	@Test
	public void testShellSort() {
		Integer[] array = { 3,6,8,2,1,4,9,5,7 };
		Sort.printArray(array);
		Sort.shellSort(array);
		Sort.printArray(array);
	}
	@Test
	public void testMergeSort() {
		Integer[] array = { 3,6,8,2,1,4,9,5,7 };
		Sort.printArray(array);
		Sort.mergeSort(array);
		Sort.printArray(array);
	}
}

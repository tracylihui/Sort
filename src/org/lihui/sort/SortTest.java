package org.lihui.sort;
import org.junit.Test;
import org.lihui.util.SortUtil;

public class SortTest {
	private Integer[] array = { 3,6,8,2,1,4,9,5,7 };
	@Test
	public void testSelectionSort() {
		SortUtil.printArray(array);
		Sort.selectionSort(array);
		SortUtil.printArray(array);
	}
	@Test
	public void testInsertionSort() {
		SortUtil.printArray(array);
		Sort.insertionSort(array);
		SortUtil.printArray(array);
	}
	@Test
	public void testShellSort() {
		SortUtil.printArray(array);
		Sort.shellSort(array);
		SortUtil.printArray(array);
	}
	@Test
	public void testMergeSort() {
		SortUtil.printArray(array);
		Sort.mergeSort(array);
		SortUtil.printArray(array);
	}
	@Test
	public void testQuickSort() {
		SortUtil.printArray(array);
		Sort.quickSort(array);
		SortUtil.printArray(array);
	}
	@Test
	public void testHeapSort() {
		SortUtil.printArray(array);
		Sort.heapSort(array);
		SortUtil.printArray(array);
	}
}

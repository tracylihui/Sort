package org.lihui.util;

public class SortUtil {
	public static <T extends Comparable<? super T>> void swap(T[] array,
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

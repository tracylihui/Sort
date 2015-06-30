package org.lihui.sort;

import org.lihui.util.SortUtil;

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
			SortUtil.swap(array, i, min);
		}
	}

	/**
	 * 插入排序
	 * 
	 * @param array
	 */
	public static <T extends Comparable<? super T>> void insertionSort(T[] array) {
		int n = array.length;
		for (int i = 1; i < n; i++) {
			for (int j = i; j > 0; j--) {
				if (array[j].compareTo(array[j - 1]) < 0) {
					SortUtil.swap(array, j, j - 1);
				} else {
					break;
				}
			}
		}

	}

	/**
	 * shell排序
	 * @param array
	 */
	public static <T extends Comparable<? super T>> void shellSort(T[] array) {
		int n = array.length;
		int h = 1;
		while (h < n / 3)
			h = h * 3 + 1;
		System.out.println(h);
		while (h >= 1) {
			for (int i = 1; i < n; i++) {
				for (int j = i; j >= h; j = j - h) {
					if (array[j].compareTo(array[j - h]) < 0) {
						SortUtil.swap(array, j, j - h);
					} else {
						break;
					}
				}
			}
			h = h / 3;
		}
	}

	/**
	 * 合并排序
	 * 
	 * @param array
	 */
	public static <T extends Comparable<? super T>> void mergeSort(T[] array) {
		MergeSort.sort(array);
	}
	/**
	 * 快速排序
	 * @param array
	 */
	public static <T extends Comparable<? super T>> void quickSort(T[] array) {
		QuickSort.sort(array);
	}
	/**
	 * 堆排序
	 * @param array
	 */
	public static <T extends Comparable<? super T>> void heapSort(T[] array) {
		HeapSort.sort(array);
	}

}

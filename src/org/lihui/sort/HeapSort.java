package org.lihui.sort;

import org.lihui.util.SortUtil;

public class HeapSort<T> {
	/**
	 * Rearranges the array in ascending order, using the natural order.
	 * 
	 * @param pq
	 *            the array to be sorted
	 */
	public static <T extends Comparable<? super T>> void sort(T[] pq) {
		int n = pq.length;
		System.out.println("n=" + n);
		
		for (int k = n / 2; k >= 1; k--) {
			System.out.println("-------------");
			System.out.println("k=" + k + " : n=" + n);
			sink(pq, k, n);
		}

		// while (n > 1) {
		// exch(pq, 1, n--);
		// sink(pq, 1, n);
		// }
	}

	/***********************************************************************
	 * Helper functions to restore the heap invariant.
	 **********************************************************************/

	private static <T extends Comparable<? super T>> void sink(T[] pq, int k,
			int n) {
		while (2 * k <= n) {
			int j = 2 * k;
			if (j < n && less(pq, j, j + 1))
				j++;
			if (!less(pq, k, j))
				break;
			SortUtil.swap(pq, k - 1, j - 1);
			k = j;
		}
		SortUtil.printArray(pq);
	}

	/***********************************************************************
	 * Helper functions for comparisons and swaps. Indices are "off-by-one" to
	 * support 1-based indexing.
	 **********************************************************************/
	private static <T extends Comparable<? super T>> boolean less(T[] pq,
			int i, int j) {
		return pq[i - 1].compareTo(pq[j - 1]) < 0;
	}
}

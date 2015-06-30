package org.lihui.sort;
/**
 * 归并排序
 * @author Tractli
 *
 * @param <T>
 */
public class MergeSort<T> {
	//private static final int CUTOFF = 7;// 采用插入排序的阈值

	public static <T extends Comparable<? super T>> void sort(T[] array) {
		T[] aux = array.clone();
		sort(array, aux, 0, array.length - 1);
	}

	private static <T extends Comparable<? super T>> void sort(T[] array,
			T[] aux, int lo, int hi) {
		if (lo >= hi)
			return; // 如果下标大于上标，则返回
		//TODO
		// if (hi <= lo + CUTOFF - 1) Sort.selectionSort(array, lo, hi);
		int mid = lo + (hi - lo) / 2;// 平分数组
		sort(array, aux, lo, mid);// 循环对左侧元素排序
		sort(array, aux, mid + 1, hi);// 循环对右侧元素排序
		if (array[mid].compareTo(array[mid + 1]) <= 0)
			return;
		merge(array, aux, lo, mid, hi);// 对左右排好的序列进行合并
	}

	private static <T extends Comparable<? super T>> void merge(T[] array,
			T[] aux, int lo, int mid, int hi) {
		int i = lo, j = mid + 1;
		// 把元素拷贝到辅助数组中
		for (int k = lo; k <= hi; k++) {
			aux[k] = array[k];
		}
		// 然后按照规则将数据从辅助数组中拷贝回原始的array中
		for (int k = lo; k <= hi; k++) {
			// 如果左边元素没了， 直接将右边的剩余元素都合并到到原数组中
			if (i > mid) {
				array[k] = aux[j++];
			}// 如果右边元素没有了，直接将所有左边剩余元素都合并到原数组中
			else if (j > hi) {
				array[k] = aux[i++];
			}// 如果左边右边小，则将左边的元素拷贝到原数组中
			else if (aux[i].compareTo(aux[j]) < 0) {
				array[k] = aux[i++];
			} else {
				array[k] = aux[j++];
			}
		}
	}
}
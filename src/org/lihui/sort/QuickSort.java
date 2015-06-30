package org.lihui.sort;

import org.lihui.util.SortUtil;
/**
 * 快速排序
 * @author Tractli
 *
 * @param <T>
 */
public class QuickSort<T> {
	public static <T extends Comparable<? super T>> void sort(T[] array) {
		sort(array, 0, array.length - 1);
	}

	private static <T extends Comparable<? super T>> void sort(T[] array, int lo, int hi) {
		// 如果子序列为1，则直接返回
		if (lo >= hi)
			return;
		
		int m = medianOf3(array, lo, lo + (hi - lo) / 2, hi);
		SortUtil.swap(array, lo, m);
		
		// 划分，划分完成之后，分为左右序列，左边所有元素小于array[index]，右边所有元素大于array[index]
		int index = partition(array, lo, hi);

		// 对左右子序列进行排序完成之后，整个序列就有序了
		// 对左边序列进行递归排序
		sort(array, lo, index - 1);
		// 对右边序列进行递归排序
		sort(array, index + 1, hi);
	}
	/**
	 * 快速排序的划分过程
	 * @param array 待划分的数组
	 * @param lo 最左侧位置
	 * @param hi 最右侧位置
	 * @return 中间元素位置
	 */
	private static <T extends Comparable<? super T>> int partition(T[] array, int lo, int hi)
	{
	    int i = lo, j = hi + 1;
	    while (true)
	    {
	        //从左至右扫描，如果碰到比基准元素array[lo]小，则该元素已经位于正确的分区，i自增，继续比较i+1；
	        //否则，退出循环，准备交换
	        while (array[++i].compareTo(array[lo]) < 0)
	        {
	            //如果扫描到了最右端，退出循环
	            if (i == hi) break;
	        }

	        //从右自左扫描，如果碰到比基准元素array[lo]大，则该元素已经位于正确的分区，j自减，继续比较j-1
	        //否则，退出循环，准备交换
	        while (array[--j].compareTo(array[lo]) > 0)
	        {
	            //如果扫描到了最左端，退出循环
	            if (j == lo) break;
	        }

	        //如果相遇，退出循环
	        if (i >= j) break;

	        //交换左a[i],a[j]右两个元素，交换完后他们都位于正确的分区
	        SortUtil.swap(array, i, j);
	    }
	    //经过相遇后，最后一次a[i]和a[j]的交换
	    //a[j]比a[lo]小，a[i]比a[lo]大，所以将基准元素与a[j]交换
	    SortUtil.swap(array, lo, j);
	    //返回扫描相遇的位置点
	    return j;
	}
	private static <T extends Comparable<? super T>> int medianOf3(T[] array, int lo, int center, int hi)
	{
	    return (less(array[lo], array[center]) ?
	           (less(array[center], array[hi]) ? center : less(array[lo], array[hi]) ? hi : lo) :
	           (less(array[hi], array[center]) ? center : less(array[hi], array[lo]) ? hi : lo));
	}

	private static <T extends Comparable<? super T>> boolean less(T t1, T t2)
	{
	    return t1.compareTo(t2) < 0;
	}
}

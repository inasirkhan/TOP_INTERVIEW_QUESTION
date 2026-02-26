package top150.arraystrings;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MergeTwoSortedArray {

	private static void merge(int[] arr1, int m, int[] arr2, int n) {
		int len1 = m;
		int len2 = n;
		
		for(int i=0;i<len2;i++) {
			arr1[len1] = arr2[i];
			len1++;
		}
		
		Arrays.sort(arr1);
	}
	public static void merge2(int[] a1,int n, int[] a2, int m){

		for(int i=0;i<m;i++){
			a1[n] = a2[i];
			n++;
		}
		Arrays.toString(a1);

	}
	
	public static void main(String[] args) {
		int arr1[] = {1,2,3,0,0,0};
		int arr2[] = {2,5,6};
//		merge2(arr1 , 3, arr2,3);
		System.out.println(Arrays.toString(arr1));
		int[] array = IntStream.concat(Arrays.stream(arr1), Arrays.stream(arr2)).sorted().toArray();
		System.out.println(Arrays.toString(array));


	}

	
}

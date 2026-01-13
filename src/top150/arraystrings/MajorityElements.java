package top150.arraystrings;

import java.util.Arrays;

public class MajorityElements {

	static int getMajorityElement(int[] arr) {
		int n = arr.length;
		Arrays.sort(arr);

		int count = 1;

		for (int i = 1; i < n; i++) {
			if (arr[i] == arr[i - 1]) {
				count++;
			} else {
				count = 1;
			}

			if (count > n / 2) {
				return arr[i];
			}
		}

		return -1;
	}

	 public static void main(String[] args) {
		int arr[] = {2,2,1,1,1,2,2};
		 System.out.println(getMajorityElement(arr));
	}
}

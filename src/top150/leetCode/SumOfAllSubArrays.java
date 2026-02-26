package top150.leetCode;

public class SumOfAllSubArrays {

    public static void main(String[] args) {
        int[] arr = {1,2,3};
//        [1],[2],[3],[1,2],[2,3],[1,2,3]
        System.out.println(sumOfAllSubArrays(arr));
        printSubarrays(arr);
    }

    private static int sumOfAllSubArrays(int[] arr) {
        int n = arr.length;
        int sum = 0;
        for (int i=0;i<n;i++){
            int currentSum =0;
            for (int j=i;j<n;j++){
                currentSum+=arr[j];
                sum+=currentSum;
            }
        }
        return sum;
    }

    public String multiply(String num1, String num2) {
        Integer n1 = Integer.valueOf(num1);
        Integer n2 = Integer.valueOf(num2);

        Integer n3 = n1*n2;
        return String.valueOf(n3);
    }

    public static void printSubarrays(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {

                // print subarray from i to j
                System.out.print("[");
                for (int k = i; k <= j; k++) {
                    System.out.print(arr[k]);
                    if (k < j) System.out.print(", ");
                }
                System.out.println("]");
            }
        }
    }
}

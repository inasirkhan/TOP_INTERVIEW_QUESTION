package top150.deqode.intuit.day1;


public class SunNotVisibleOnBuilding {

    public static int sunNotVisible(int[] arr) {
        int count = 0;
        int n=arr.length;
        int max = arr[0];
        for (int i=1;i<n;i++){
            if (arr[i]>max){
                max= arr[i];
            }
            else {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int[] arr = {5, 4, 7, 11, 5, 3, 1};
        System.out.println(sunNotVisible(arr));

    }
}

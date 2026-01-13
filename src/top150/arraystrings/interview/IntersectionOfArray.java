package top150.arraystrings.interview;

import java.util.*;

public class IntersectionOfArray {

    public static void main(String[] args) {
        int arr[] = {1,2,4,6};
        int arr2[] = {2,3,4,7};
        int[] intersection = findIntersection(arr, arr2);
        int[] intersection2 = findIntersectionPractice(arr, arr2);
        System.out.println("Intersection : "+Arrays.toString(intersection));
        System.out.println("Intersection 2 : "+Arrays.toString(intersection2));
        int[] union = findUnion(arr, arr2);
        System.out.println("Union : "+ Arrays.toString(union));
    }

    private static int[] findUnion(int[] arr, int[] arr2) {
        Set<Integer> union = new HashSet<>();
        for (int i=0;i<arr.length;i++){
            union.add(arr[i]);
        }
        for (int i=0;i<arr2.length;i++){
            union.add(arr2[i]);
        }

        return union.stream().mapToInt(Integer::intValue).toArray();
    }

    private static int[] findIntersection(int[] arr, int[] arr2) {
        List<Integer> intersection = new ArrayList<>();
        for (int i=0;i<arr.length;i++){
                for (int j=0;j<arr2.length;j++){
                    if (arr[i]==arr2[j]){
                        intersection.add(arr[i]);
                    }
                }
            }
        int[] result = new int[intersection.size()];
        for (int i = 0; i < intersection.size(); i++) {
            result[i] = intersection.get(i);
        }
        return result;
    }

    static int[] findIntersectionPractice(int[] arr1, int[] arr2){
        HashSet<Integer> set1 = new HashSet<>();
        for (int i=0;i<arr1.length;i++){
            set1.add(arr1[i]);
        }

        ArrayList<Integer> intersections = new ArrayList<>();
        for (int i=0;i<arr2.length;i++){
            if (set1.contains(arr2[i])){
                intersections.add(arr2[i]);
                set1.remove(arr2[i]); // avoid duplicate in intersection
            }
        }

        int[] intersects = new int[intersections.size()];
        for (int i=0;i<intersections.size();i++){
            intersects[i] = intersections.get(i);
        }
        return intersects;
    }
}

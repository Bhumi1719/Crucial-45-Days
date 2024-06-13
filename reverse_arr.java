package Recursion;

import java.util.*;
public class reverse_arr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int []arr = {5, 3, 7, 8, 9};
        // revArray(arr, 0, arr.length-1);
        revArr(arr, 0, arr.length);
    }

    public static void revArray(int []arr, int p1, int p2){
        if(arr[p1] >= arr[p2]){
            System.out.println(Arrays.toString(arr));
            return;
        }
        int temp = arr[p1];
        arr[p1] = arr[p2];
        arr[p2] = temp;
        revArray(arr, p1+1, p2-1);
    }

    public static void revArr(int []arr, int p, int n){
        if(p == n/2){
            System.out.println(Arrays.toString(arr));
            return;
        }
        int temp1 = arr[p];
        arr[p] = arr[n-p-1];
        arr[n-p-1] = temp1;
        System.out.println(arr[p]+"  " +arr[n-p-1]);
        revArr(arr, p+1, n);
    }
}

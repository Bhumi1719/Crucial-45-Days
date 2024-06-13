package Recursion;

import java.util.*;
public class reverse_arr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int []arr = {5, 3, 7, 8, 9};
        revArray(arr, 0, arr.length-1);
    }

    public static void revArray(int []arr, int p1, int p2){
        if(arr[p1] == arr[p2]){
            System.out.println(Arrays.toString(arr));
            return;
        }
        int temp = arr[p1];
        arr[p1] = arr[p2];
        arr[p2] = temp;
        revArray(arr, p1+1, p2-1);
    }
}

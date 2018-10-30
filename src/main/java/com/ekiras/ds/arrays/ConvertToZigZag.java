package com.ekiras.ds.arrays;

public class ConvertToZigZag {

    public static void zigzag(int arr[]) {
        if(arr==null)
            return;
        for (int i = 0; i < arr.length - 1; i++) {
            boolean isEven = i%2==0;
            if (isEven && (arr[i] > arr[i + 1])) {
                swap(arr, i, i + 1);
            } else if (!isEven && (arr[i] < arr[i + 1])) {
                swap(arr, i, i + 1);
            }
        }
    }

    private static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}

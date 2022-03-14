package Sorting;

public class SelectionSort {

    // in each pass find the minimum element and swap with appropriate position at its index 0,1,2...

    public void selectionSort(int[] arr) {

        for (int j = 0; j < arr.length - 1; j++) {

            int min = j;

            for (int i = j + 1; i < arr.length; i++) {

                if (arr[i] < arr[min]) {
                    min = i;

                }
            }
            swap(arr, j, min);
        }

        for (int i : arr) {
            System.out.println(i);
        }
    }

    void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}

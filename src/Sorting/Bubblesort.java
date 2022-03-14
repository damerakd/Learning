package Sorting;

public class Bubblesort {

    // in each pass the largest element comes to the right side of array making it sorted partition

    public void bubbleSort(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {

            boolean flag = false;

            for (int j = 0; j < arr.length - i - 1; j++) { // no need to visit the sorted array at the right end in each pass

                if (arr[j] > arr[j + 1]) {
                    flag = true;

//                    int temp = arr[j];
//                    arr[j] = arr[j+1];
//                    arr[j+1] = temp;

                    swap(arr, j, j + 1);
                }
            }
            if (flag == false) break;
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

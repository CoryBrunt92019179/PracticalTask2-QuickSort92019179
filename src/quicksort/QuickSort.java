/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quickSort;

/**
 *
 * @author 92019179
 */
public class QuickSort {

    private CatalogueItem[] items;
    private int number;

    public void sort(CatalogueItem[] values) {

        // check for empty or null array
        if (values == null || values.length == 0) {
            return;
        }
        this.items = values;
        number = values.length;
        quicksort(0, number - 1);
    }
// this is the quicksort algorithm

    private void quicksort(int low, int high) {

        int i = low, j = high;
        // Get the pivot element from the middle of the list
        int pivot = items[low + (high - low) / 2].getItemId();

        // Divide into two lists
        while (i <= j) {
            // If the current value from the left list is smaller than the pivot
            // element then get the next element from the left list
            while (items[i].getItemId() < pivot) {
                i++;
            }
            // If the current value from the right list is larger than the pivot
            // element then get the next element from the right list
            while (items[j].getItemId() > pivot) {
                j--;
            }

            // If we have found a value in the left list which is larger than
            // the pivot element and if we have found a value in the right list
            // which is smaller than the pivot element then we exchange the
            // values.
            // As we are done we can increase i and j
            if (i <= j) {
                exchange(i, j);
                i++;
                j--;

            }
        }
        // Recursion
        if (low < j) {
            quicksort(low, j);

        }
        if (i < high) {
            quicksort(i, high);

        }
    }

    private void exchange(int i, int j) {

        CatalogueItem temp = items[i];
        items[i] = items[j];
        items[j] = temp;
    }

    /* Prints the array */
    void printArray(CatalogueItem arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i) {
            System.out.print(
                    "id: " + arr[i].getItemId() + " "
                    + "name: " + arr[i].getItemName() + " "
                    + "category: " + arr[i].getCategory() + "\n");
        }
        System.out.println();
        System.out.println();
    }

    // Driver method to test above
    public static void main(String args[]) {
        long startTime = System.nanoTime();
        QuickSort ob = new QuickSort();

        CatalogueItem arr[] = {
            new CatalogueItem(3, "Life of Pi", "Books"),
            new CatalogueItem(7, "Deelongie 4 way toaster", "Home and Kitchen"),
            new CatalogueItem(2, "Glorbarl knife set", "Home and Kitchen"),
            new CatalogueItem(4, "Diesorn vacuum cleaner", "Appliances"),
            new CatalogueItem(5, "Jennie Olivier sauce pan", "Home and Kitchen"),
            new CatalogueItem(6, "This book will save your life", "Books"),
            new CatalogueItem(8, "Kemwould hand mixer", "Appliances"),
            new CatalogueItem(1, "Java for Dummies", "Books"),};

        //apply sort
        ob.sort(arr);
        System.out.println("[The QuickSort array 1] \n");
        ob.printArray(arr);
        long endTime = System.nanoTime();
        long duration = ((endTime - startTime) / 100000);
        System.out.println("The Array 1 sort time took: " + duration + " milliseconds \n \n");

        long startTime2 = System.nanoTime();
        QuickSort ob2 = new QuickSort();

        CatalogueItem arr2[] = {
            new CatalogueItem(8, "Kemwould hand mixer", "Appliances"),
            new CatalogueItem(7, "Deelongie 4 way toaster", "Home and Kitchen"),
            new CatalogueItem(6, "This book will save your life", "Books"),
            new CatalogueItem(5, "Jennie Olivier sauce pan", "Home and Kitchen"),
            new CatalogueItem(4, "Diesorn vacuum cleaner", "Appliances"),
            new CatalogueItem(3, "Life of Pi", "Books"),
            new CatalogueItem(2, "Glorbarl knife set", "Home and Kitchen"),
            new CatalogueItem(1, "Java for Dummies", "Books"),};
//apply sort 2
        ob.sort(arr2);
        System.out.println("[The Quicksort array2] \n ");
        ob.printArray(arr2);
        long endTime2 = System.nanoTime();
        long duration2 = ((endTime2 - startTime2) / 100000);
        System.out.println("The Array 2 sort time took: " + duration2 + " milliseconds");
    }
}

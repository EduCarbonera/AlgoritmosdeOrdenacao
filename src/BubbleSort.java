public class BubbleSort {

    public static void bubbleSort(int[] values) {
      bubbleSort(values, values.length);
    }

    public static void bubbleSort(int[] values, int n) {

        // There is nothing more to sort
        if (n == 1) {
            return;
        }

        // Single pass through array: compares adjacent elements and swaps if out of order.
        // After this pass, the largest element "bubbles up" to the end.
        for (int i = 0; i < n - 1; i++) {
            if (values[i] > values[i + 1])
                Util.swap(values, i, i + 1);
        }

        // Recursive call to sort the remaining elements of array
        bubbleSort(values, n - 1);
    }
}

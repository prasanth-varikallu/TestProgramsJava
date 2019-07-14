public class MergeSort {

    public void mergeSort(int[] array, int left, int right) {
        //exit condition
        if (left >= right)
            return;

        int mid = (left + right) / 2;

        mergeSort(array, left, mid);
        mergeSort(array, mid + 1, right);

        merge(array, left, mid, right);
        //mergesort
        //mergesort
        //merge
    }

    public void merge(int[] array, int left, int mid, int right) {
        int[] helperArray = array;

        int leftPtr = left;
        int rightPtr = mid + 1;

        while (leftPtr <= mid && rightPtr <= right) {
            if(array[leftPtr] > array[rightPtr]);

        }
    }
}

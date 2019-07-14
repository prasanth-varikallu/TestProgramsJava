
public class QuickSort {

    public void quickSort(int[] array, int left, int right) {
        int counter = 1;

        if (left < right) {
            int pivot = array[right];
            int partitionVar = partition(array, left, right, pivot);
            System.out.println("Partition: " + counter++);
            for(int i: array)
                System.out.print(i);
            System.out.println();
            quickSort(array, left, partitionVar - 1);
            quickSort(array, partitionVar + 1, right);
        }
    }

    private int partition(int[] array, int left, int right, int pivot) {
        int leftPtr = left - 1;
        int rightPtr = right;

        while (true) {
            while (array[++leftPtr] < pivot);
            while (rightPtr > 0 && array[--rightPtr] > pivot);

            if (leftPtr < rightPtr)
                swap(array, leftPtr, rightPtr);
            else
                break;
        }
        swap(array, leftPtr, right);
        return leftPtr;
    }

    private void swap(int[] array, int left, int right) {

        int temp = array[left];
        array[left] = array[right];
        array[right] = temp;
    }

    public static void main(String[] args) {
        int[] array = {1, 9, 2, 4, 5, 6};

        new QuickSort().quickSort(array, 0, array.length - 1);
        for (int i : array) {
            System.out.print(i);
        }

    }
}

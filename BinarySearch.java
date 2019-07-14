public class BinarySearch {

    public boolean binarySearch(int [] array, int start, int end, int searchValue) {
        if (start > end)
            return false;

        int mid = (start + end)/2;

        if (array[mid] == searchValue)
            return true;

        if (searchValue > array[mid])
            return binarySearch(array, mid + 1, end, searchValue);
        else
            return binarySearch(array, start, mid, searchValue);

    }

    public static void main(String [] args)
    {
        int [] array = {1, 2, 3, 4, 5, 8, 16, 32, 64};
        BinarySearch binarySearch = new BinarySearch();

        System.out.println(binarySearch.binarySearch(array, 0, array.length - 1, 8));
    }
}

public class BinSearch {

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        final long startTime = System.currentTimeMillis();
        int d = binSearch(arr, 2);
        final long duration = System.currentTimeMillis() - startTime;
        System.out.println("Execution time:" + duration);
        System.out.println(d);
        System.out.println("Updated this message in DEV branch");
    }

    public static int binSearch(int[] arr, int x) {
        int low = 1;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] > x) {
                high = mid - 1;

            } else if (x > arr[mid]) {
                low = mid + 1;
            } else
                return mid;

        }

        return 0;
    }

}
package assignment.string.binarySearch;

public class FloorAndCeil {
    static void floorAndCeil(int a[], int N, int x) {

        int low = 0, high = N - 1;
        while (low <= high) {
            int mid = (low + high) / 2;

            if (a[mid] == x) {
                break;
            } else if (a[mid] < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        // if element doesn't exist
        if (low > high) {
            int lowerElement = (high < 0) ? -1 : a[high];
            int higherElement = (low >= N) ? -1 : a[low];
            System.out.println(lowerElement + " " + higherElement);
        } else {
            System.out.println(x + " " + x);
        }

    }

        /**

         2 5 6 11 15.   el = 4

         // apply binary search and tell me the final values of low and high

         2 5 6 11 15 low = 0 high = 4
         i1                   mid = 2 high = mid-1 = 1
         low =0 high = 1
         i2
         mid = 1/2 = 0
         low = mid+1 = 1
         high = 1
         i3:
         mid = (1+1)/2= 1
         high = mid-1 = 0
         low = 1

         at the end: low>high -> Element doesn't exist
         */
}

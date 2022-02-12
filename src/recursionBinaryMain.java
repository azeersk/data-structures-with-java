import java.util.Scanner;

class binaryRecursionClass{
    public int binarySearch(int[] arr, int find, int start, int end) {
        if (end >= start) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == find) {
                return mid;
            }
            if (arr[mid] > find) {
                return binarySearch(arr, find, start, mid - 1);
            }
            return binarySearch(arr, find, mid + 1, end);
        }
        return -1;
//        if (high >= low) {
//            int mid = low + (high - low) / 2;
//
//            // If found at mid, then return it
//            if (arr[mid] == x)
//                return mid;
//
//            // Search the left half
//            if (arr[mid] > x)
//                return binarySearch(arr, x, low, mid - 1);
//
//            // Search the right half
//            return binarySearch(arr, x, mid + 1, high);
//        }

    }
}

public class recursionBinaryMain {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int[] array = {12,23,34,45,56,67,78,89};
        int a = input.nextInt();

        int start = 0;
        int end = array.length-1;
        binaryRecursionClass obj = new binaryRecursionClass();
        int result = obj.binarySearch(array, a, start, end);
        System.out.println("array: "+ obj.binarySearch(array,a,start,end));
        if(result == -1){
            System.out.println("Given element is not found in array!!!");
        }
        else{
            System.out.println("Given element found at index "+ result + "!!!");
        }
    }


}

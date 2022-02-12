import java.util.Scanner;

class twoPinter {
    public boolean twoPintewrm(int[] arr, int find) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            if (arr[start] + arr[end] == find) {
                System.out.println(start + " " + end);
                return true;
            } else if (arr[start] + arr[end] < find) {
                start++;
            } else {
                end--;
            }
        }
        return false;
    }
}

public class twoPointerClass {
    public static void main(String[] aegs) {
        Scanner input = new Scanner(System.in);
        int[] array = {2, 3, 4, 5, 6, 7, 8, 9};
        int a = input.nextInt();
        twoPinter obj = new twoPinter();
        System.out.println(obj.twoPintewrm(array, a));
    }
}
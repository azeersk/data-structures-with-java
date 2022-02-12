import java.util.Scanner;

class binaryClass{
    public int binarySearch(int[] arr, int find){
        int length = arr.length;
        int start = 0;
        int end = length -1;

        while(start <= end){
            int mid = start + (end - start)/2;
           // System.out.println(mid);

            if(arr[mid] == find){
                return mid;
            }
            else if(arr[mid]<find){
                start++;
            }
            else{
                end--;
            }
        }
        return -1;
    }
}

public class binaryMain {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int[] array ={12,23,34,45,56,67,78};
        int a = input.nextInt();
        binaryClass objB = new binaryClass();
        int result = objB.binarySearch(array, a);

        if(result == -1){
            System.out.println(a + " is not found in array!!!");
        }
        else{
            System.out.println(a + " is found at index "+ result + "!!!");
        }
    }
}

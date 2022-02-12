import java.util.Arrays;
import java.util.Scanner;

class pointerClass{
    public String twoPointer(int[] arr, int find){
        int start = 0;
        int end = arr.length-1;
        while(start < end){
            if(arr[start] + arr[end] == find){
                return start + " " + end;
            }
            else if(arr[start] + arr[end] < find){
                start ++;
            }
            else{
                end --;
            }
        }

        return "-1";
    }
}

public class twoMain {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int[] array = new int[7];
        for(int i=0; i<7; i++){
            array[i] = i*7;
        }
        System.out.println("array is: " + Arrays.toString(array));
        int a = input.nextInt();
        pointerClass obj = new pointerClass();

        String result = obj.twoPointer(array,a);

        if(result == "-1"){
            System.out.println("given sum is not found!!!");
        }
        else{
            System.out.println("given element sum is: "+result);
        }
    }
}

import java.util.Scanner;

class linearClass{
    public int linearSearch(int[] arr, int find){
        int length = arr.length;
        for(int i=0; i<length; i++){
            if(arr[i] == find){
                return i;
            }
        }
        return -1;
    }
}

public class linearMain {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int[] array = {12,34,45,56,67,78,98};
        int a = input.nextInt();
        linearClass obj = new linearClass();
        int result = obj.linearSearch(array, a);

        if(result == -1){
            System.out.println("Given element index is not found!!!");
        }
        else{
            System.out.println(a + " index is: "+ result);
        }
    }
}

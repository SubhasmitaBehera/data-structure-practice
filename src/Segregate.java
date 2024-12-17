import java.util.Arrays;

public class Segregate {
    public static void main(String[] args){
        int[] arr = {22,33,44,55,56,99,2,0,43};
        System.out.println("Array: "+ Arrays.toString(arr));
        EvenOddSegregation(arr);
        System.out.println("Array: "+ Arrays.toString(arr));
    }
    public static void EvenOddSegregation(int[] arr) {
        int left=0; int right = arr.length - 1;
        while(left<right){
            if(arr[left]%2==0){
                left++;
            }
            else if(arr[right]%2!=0){
                right--;
            }
            else{
                int temp =arr[left];
                arr[left]= arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }
    }
}

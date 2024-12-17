import java.util.Arrays;

public class ThirdLargest {
    public static void main(String[] args){
        int[] arr = {22,33,44,55,56,99,2,0,43};
        if(arr.length < 3){
            System.out.println("Array should contain atleast 3 items...");
        }
//        else {
//            System.out.println("The array is: "+ Arrays.toString(arr));
//            Arrays.sort(arr);
//            System.out.println("Third largest number is: "+ arr[arr.length-3]);
//        }
        else {
            int first = arr[0],second = 0, third= 0;
            for( int i = 1; i<arr.length ; i++){
                if(arr[i]>first){
                    third = second;
                    second = first;
                    first = arr[i];
                }
                else if(arr[i]>second){
                    third = second;
                    second = arr[i];
                }
                else if (arr[i]>third){
                    third = arr[i];
                }
            }
            System.out.println("Third Largest number is: "+ third);
        }
    }
}

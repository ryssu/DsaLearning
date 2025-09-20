package array;
// Utility class for array operations

public class ArrayUtils {
    public void printArray(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // removing even integers from an array
    public int[] removeEven(int[] arr) {
        int oddCounter = 0; // this will serve as the array size

        for(int i = 0; i < arr.length; i++) {
            // checking if it is odd
            if(arr[i] % 2 != 0) {
                oddCounter++;
            }
        }
        int[] result = new int[oddCounter];

        int counter = 0;
        for(int i = 0; i < arr.length; i++) {
            // adding the odd numbers to result
            if(arr[i] % 2 != 0) {
                result[counter] = arr[i];
                counter++;
            }
        }
        return result;
    }

    // removing odd integers from an array
    public int[] removeOdd(int[] arr) {
        int evenCounter = 0; // array's size

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 == 0) {
                evenCounter++;
            }
        }
        int[] result = new int[evenCounter];

        int counter = 0;
        for(int i = 0; i < arr.length; i++) {
            // adding the even numbers
            if(arr[i] % 2 == 0) {
                result[counter] = arr[i];
                counter++;
            }
        }
        return result;
    }    
}

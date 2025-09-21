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
    
    // reverse an array
    public int[] reverseArray(int[] arr) {
        int[] reversed = new int[arr.length];
        int counter = 0;

        // traversing the array from the end
        for(int i = arr.length - 1; i >= 0; i--) {
            reversed[counter] = arr[i];
            counter++;
        }
        return reversed;
    }
    
    // another way to reverse an array (video's solution)
    public void reverseArray2(int[] arr, int start, int end) {
        while(start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    // finding the min value of an array
    public void minValue(int[] arr) {
        int minVal = arr[0];

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] < minVal) {
                minVal = arr[i];
            }
        }
        System.out.println("minimum value in the array is: " + minVal);
    }

    // finding the max value of an array
    public void maxValue(int[] arr) {
        int maxVal = arr[0];

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > maxVal) {
                maxVal = arr[i];
            }
        }
        System.out.println("maximum value in the array is: " + maxVal);
    }

    // finding the 2nd highest value
    public int secondMaxVal(int[] arr) {
        int maxVal = arr[0];
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > maxVal) {
                maxVal = arr[i];
            }
        }

        int secondMaxVal = arr[0];
        for(int i = 0; i< arr.length; i++) {
            if(arr[i] > secondMaxVal && arr[i] < maxVal) {
                secondMaxVal = arr[i];
            }
        }
        return secondMaxVal;
    }

    // another way to find the 2nd highest (video's solution)
    public int secondMaxVal2(int[] arr) {
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > max) {
                secondMax = max;
                max = arr[i];
            } else if(arr[i] > secondMax && arr[i] != max) {
                secondMax = arr[i];
            }
        }
        return secondMax;
    }

    // move all zero's to end of an array
    public void zeroToEnd(int[] arr) {
        
    }
}

package array;

public class ArrayDemo {
    public static void main(String[] args) {
        ArrayDemo arrayDemo = new ArrayDemo();
        ArrayUtils arrayUtils = new ArrayUtils();

        // testing printing arrays
        // arrayDemo.arrayTest();

        //dummy arrays
        int[] dummyArray = {3, 2, 4, 7, 10, 6, 5, 7, 11, 14, 23, 26};
        int[] dummy2 = {12, 34, 2, 34, 33, 1};

        // int[] oddArray = arrayUtils.removeEven(dummyArray);
        // int[] evenArray = arrayUtils.removeOdd(dummyArray);

        // System.out.print("Odd only array: ");
        // arrayUtils.printArray(oddArray);

        // System.out.print("Even only array: ");
        // arrayUtils.printArray(evenArray);

        System.out.print("original array: ");
        arrayUtils.printArray(dummy2);
        System.out.print("reversed array: ");
        int[] reversedArray = arrayUtils.reverseArray(dummy2);
        arrayUtils.printArray(reversedArray);
        System.out.print("reversing it again: ");
        arrayUtils.reverseArray2(reversedArray, 0, reversedArray.length - 1);
        arrayUtils.printArray(reversedArray);
        arrayUtils.minValue(reversedArray);
        arrayUtils.maxValue(reversedArray);

        System.out.println("second maximum value in the array is: " + arrayUtils.secondMaxVal(reversedArray));
    }
}

package array;

public class ArrayDemo {
    ArrayUtils arrayUtils = new ArrayUtils();

    public void arrayTest() {
        int [] myArray = new int[5];
        // printArray(myArray);
        myArray[0] = 5;
        myArray[1] = 1;
        myArray[2] = 8;
        myArray[3] = 2;
        myArray[4] = 10;
        myArray[2] = 9;
        arrayUtils.printArray(myArray);
        System.out.println("Array length: " + myArray.length);
        System.out.println("Last Element: " + myArray[myArray.length - 1]);
    }

    public static void main(String[] args) {
        ArrayDemo arrayDemo = new ArrayDemo();
        ArrayUtils arrayUtils = new ArrayUtils();

        // testing printing arrays
        // arrayDemo.arrayTest();

        //dummy array
        int[] dummyArray = {3, 2, 4, 7, 10, 6, 5, 7, 11, 14, 23, 26};

        int[] oddArray = arrayUtils.removeEven(dummyArray);
        arrayUtils.printArray(oddArray);
    }
}

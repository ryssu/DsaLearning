package array;

public class ArrayDemo {
    public static void main(String[] args) {
        ArrayUtils arrayUtils = new ArrayUtils();
        
        int[] dummy3 = {0, 1, 0, 4, 12};
        
        arrayUtils.printArray(dummy3);
        System.out.println("size of array was: " + dummy3.length);
        int[] newdummy3 = arrayUtils.resize(dummy3, 10);
        System.out.println("now size of array is: " + newdummy3.length);
    }
}

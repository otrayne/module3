import java.util.ArrayList;

public class ArrayDifference {
    public static void main(String[] args) {

        //Working with a regular Java Array, they have fixed size
        int[] intArray = new int[3];
        intArray[0] = 1;
        intArray[1] = 2;
        intArray[2] = 3;
        // intArray[3] = 4; this would cause an out of bounds error due to exceeding size

        System.out.println("Array contents:");
        for (int i = 0; i < intArray.length; i++) {
            System.out.println("Index " + i + ": " + intArray[i]);
        }

        // ArrayLists are resizable 
        ArrayList<Integer> intList = new ArrayList<>();

        intList.add(1);
        intList.add(2);
        intList.add(3);
        intList.add(4); // No error because size increases automatically

        System.out.println("\nArrayList contents:");
        for (int i = 0; i < intList.size(); i++) {
            System.out.println("Index " + i + ": " + intList.get(i));
        }

        // Differences:
        // 1. Arrays have a fixed size once declared.
        // 2. Array Lists can grow and shrink dynamically.
        // 3. Array syntax uses [], while Array List uses methods like add(), get(), size(), etc.
    }
}

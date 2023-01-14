package day13;

public class PrintArray {

    public static void toPrint(Integer[] inputArray) {
        for (int element : inputArray) {
            System.out.print(element+" ");
        }
        System.out.println();
    }

    public static void toPrint(Double[] inputArray) {
        for (double element : inputArray) {
            System.out.print(element+" ");
        }
        System.out.println();
    }

    public static void toPrint(Character[] inputArray) {
        for (char element : inputArray) {
            System.out.print(element+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3};
        Double[] doubleArray = {0.1, 0.2, 0.3};
        Character[] charArray = {'g', 'h', 'j'};
        PrintArray.toPrint(intArray);
        PrintArray.toPrint(doubleArray);
        PrintArray.toPrint(charArray);
    }
}
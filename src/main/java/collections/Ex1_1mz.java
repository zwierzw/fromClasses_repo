package collections;


public class Ex1_1mz {
    private int[] array;

    public Ex1_1mz() {
        array = new int[10];
    }

    public Ex1_1mz(int size) {
        array = new int[size];
    }

    public int[] addToArray() {
        for (int i = 1; i <= array.length; i++) {
            array[i - 1] = i;
        }
        return array;
    }

    public void printArray() {
        for (int elements : array) {
            System.out.print(elements + " ");
        }
        System.out.println();
    }


    public void printArraySize() {
        System.out.println("The array size is: " + array.length);
    }

    public int getArraySize() {
        return array.length;
    }

    public int[] multiplication(int mul) {
        for (int i = 0; i<array.length; i++) {
            array[i] *= mul;
        }
        return array;
    }
}

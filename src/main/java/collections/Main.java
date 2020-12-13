package collections;

public class Main {

    public static void main(String[] args) {
        Ex1_1mz myArray = new Ex1_1mz((25));
        myArray.addToArray();
        myArray.printArray();
        System.out.println(myArray.getArraySize());
        myArray.printArraySize();
        myArray.multiplication(16);
        myArray.printArray();


        Ex2_1mz myList = new Ex2_1mz();
        myList.addElemList(2,3,4,5,6);
        System.out.println(myList.listLength());
        myList.addElemList(7,8);
        System.out.println(myList.listLength());

        System.out.println(myList.getFirst());
        System.out.println(myList.getLast());
        myList.printList();
    }
}

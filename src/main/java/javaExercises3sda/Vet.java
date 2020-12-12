package javaExercises3sda;

public class Vet {
    public void sayHello (Cat cat) {
        System.out.println("Hello cat: " + cat.getName());
    }

    public void sayHello (Dog dog){
        System.out.println("Hello dog: "+ dog.getName());
    }

    public void universalSayHello (AbstractAnimal animal) {
        System.out.println("Hello animal: " + animal.getName());
    }
}

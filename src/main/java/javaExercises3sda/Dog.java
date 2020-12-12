package javaExercises3sda;

public class Dog extends AbstractAnimal implements Animal {

    public Dog(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(this.name + " woff woff!");
    }


}

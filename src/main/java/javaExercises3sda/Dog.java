package javaExercises3sda;

public class Dog implements Animal {
    private String name;

    public Dog(String name) {
        this.name = name;
    }

    @Override

    public void makeSound() {
        System.out.println(this.name + " woff woff!");
    }

}

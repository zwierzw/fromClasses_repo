package javaExercises3sda;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Puszek");
        Cat cat2 = new Cat("Okruszek");
        Cat cat3 = new Cat("Mruczek");

        cat1.makeSound();
        cat2.makeSound();
        cat3.makeSound();

        List<Cat> cats = new ArrayList<>();
        cats.add(cat1);
        cats.add(cat2);
        cats.add(cat3);

        for (Cat cat: cats){
            cat.makeSound();
        }

        cat1.eatMouse();
        cat1.eatMouse();
        cat1.eatMouse();


    }
}

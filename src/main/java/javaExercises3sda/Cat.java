package javaExercises3sda;

public class Cat extends AbstractAnimal implements Animal, Movable{

    private String name;
    private Integer mouseCounter;


    Cat(String name) {
        super (name);
        this.mouseCounter = 0;
    }

    public Cat(String name, Integer mouseCounter) {
        super (name);
        this.mouseCounter = mouseCounter;
    }


    public Integer getMouseCounter() {
        return mouseCounter;
    }

    public void setMouseCounter(Integer mouseCounter) {
        this.mouseCounter = mouseCounter;
    }

    @Override
    public void makeSound() {
        System.out.println(this.name + " goes meow!!!");
    }

    public void eatMouse() {
        this.mouseCounter++;
        //this.mouseCounter = this.mouseCounter + 1
        System.out.println("I ate " + this.mouseCounter + " mice!");
    }

    @Override
    public String move () {
        System.out.println("Idę!");
        return "Idę";
    }


    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", mouseCounter=" + mouseCounter +
                '}';
    }
}

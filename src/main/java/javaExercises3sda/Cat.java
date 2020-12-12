package javaExercises3sda;

public class Cat {

    private String name;
    private Integer mouseCounter;


    Cat(String name) {
        this.name = name;
        this.mouseCounter = 0;
    }

    public Cat(String name, Integer mouseCounter) {
        this.name = name;
        this.mouseCounter = mouseCounter;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getMouseCounter() {
        return mouseCounter;
    }

    public void setMouseCounter(Integer mouseCounter) {
        this.mouseCounter = mouseCounter;
    }

    public void makeSound() {
        System.out.println(this.name + " goes meow!!!");
    }

    public void eatMouse() {
        this.mouseCounter++;
        //this.mouseCounter = this.mouseCounter + 1
        System.out.println("I ate " + this.mouseCounter + " mice!");
    }
}

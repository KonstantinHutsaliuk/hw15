package oop_practice.cat_dog.dog;

import oop_practice.cat_dog.animal.Animal;

public class Dog implements Animal {
private String name;
private String className = "Doc";


    public Dog(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String voice() {
        return "Gav";
    }

    @Override
    public void sound() {
        System.out.println("I'am a " + className + ". My name is " + getName() + ". " + voice());
    }
}

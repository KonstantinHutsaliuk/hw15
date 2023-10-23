package oop_practice.cat_dog.cat;

import oop_practice.cat_dog.animal.Animal;

public class Cat implements Animal {
    private String name;
    private String className = this.getClass().getSimpleName();

    public Cat(String name) {
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
        return "Mew";
    }

    @Override
    public void sound() {

        System.out.println("I'am a " + className + ". My name " + getName() + ". " + voice());
    }
}

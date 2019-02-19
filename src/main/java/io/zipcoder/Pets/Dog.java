package io.zipcoder.Pets;

public class Dog extends Pet {

    public String speak(){
        return "Bark!";
    }

    public Dog(String name, Integer age) {
        super(name, age);
    }

    public Dog(String name) {
        super(name);
    }

    public Dog(Integer age) {
        super(age);
    }

    public Dog() {
    }

}

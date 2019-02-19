package io.zipcoder.Pets;

public class Cat extends Pet{

    public String speak(){
        return "Meow!";
    }

    public Cat(String name, Integer age) {
        super(name, age);
    }

    public Cat(String name) {
        super(name);
    }

    public Cat(Integer age) {
        super(age);
    }

    public Cat() {
    }

}

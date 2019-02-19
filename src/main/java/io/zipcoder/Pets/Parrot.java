package io.zipcoder.Pets;

public class Parrot extends Pet{
    public Parrot(String name, Integer age) {
        super(name, age);
    }

    public Parrot(String name) {
        super(name);
    }

    public Parrot(Integer age) {
        super(age);
    }

    public Parrot() {
    }

    public String speak(){
        return "" + this.name + "Parrot wants a cracker";
    }

}

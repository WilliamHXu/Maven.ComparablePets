package io.zipcoder.Pets;

public class Pet {
    protected String name;
    protected Integer age;

    public Pet(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public Pet(String name) {
        this(name, 0);
    }

    public Pet(Integer age) {
        this(name, 0);
    }

    public Pet() {
        this("", 0);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String speak() {
        return "";
    }
}

package io.zipcoder.Pets;

public abstract class Pet implements Comparable<Pet>{
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
        this("", 0);
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

    @Override
    public String toString(){
        return String.format("%s says %s", getName(), speak());
    }

    public int compareTo(Pet petToCompare){
        if(this.getName().equals(petToCompare.getName())){
            return this.petTypeString().compareTo(petToCompare.petTypeString());
        }
        else {
            return this.getName().compareTo(petToCompare.getName());
        }
    }

    public String petTypeString(){
        if (this instanceof Cat) {
            return "cat";
        }
        else if (this instanceof Dog) {
            return "dog";
        }
        else {
            return "parrot";
        }
    }

}

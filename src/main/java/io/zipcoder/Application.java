package io.zipcoder;


import io.zipcoder.Pets.Cat;
import io.zipcoder.Pets.Dog;
import io.zipcoder.Pets.Parrot;
import io.zipcoder.Pets.Pet;

public class Application {

     IOConsole console = new IOConsole();
     Pet[] petArray;

    public void start(){
        Integer numberOfPets = console.getIntegerInput("How Many Pets Do You Have?");
        petArray = new Pet[numberOfPets];
        for (int i = 0; i < numberOfPets; i++) {
            String petType = console.getStringInput("What Type of Pet Do You Have?").toLowerCase();
            String petName = console.getStringInput("What is this Pet's Name?");
            petArray[i] = createPetOfType(petType, petName);

        }
        for (Pet pet : petArray) {
            console.println(pet.toString());
        }
    }

    public Pet createPetOfType(String petType, String name){
        Pet pet;
        if (petType.equals("cat")) {
            pet = new Cat(name);
        }
        else if (petType.equals("dog")) {
            pet = new Dog(name);
        }
        else {
            pet = new Parrot(name);
        }
        return pet;
    }

}

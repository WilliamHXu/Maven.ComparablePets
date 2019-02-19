package io.zipcoder;

import io.zipcoder.Pets.Cat;
import io.zipcoder.Pets.Dog;
import io.zipcoder.Pets.Parrot;
import io.zipcoder.Pets.Pet;

import java.util.Scanner;

public class IOConsole {
    Scanner in = new Scanner(System.in);

    public Integer askHowManyPets(){
        System.out.println("How Many Pets Do You Have?");
        Integer numberOfPets = in.nextInt();
        return numberOfPets;
    }

    public Pet askWhatTypeOfPet(){
        System.out.println("What Type Of Pet Do You Have and What's It's Name?");
        String typeOfPets = (in.next()).toLowerCase();
        Pet pet = new Pet();
        if (typeOfPets.equals("dog")){
            pet = new Dog(in.next());
        }
        else if (typeOfPets.equals("cat")){
            pet = new Cat(in.next());
        }
        else if (typeOfPets.equals("parrot")){
            pet = new Parrot(in.next());
        }
        return pet;
    }

    public void printPetArray(Pet[] petArray){
        String print = "";
        for (Pet pet : petArray){
            print += pet.getName() +
                    " says " + pet.speak() + "\n";

        }
        System.out.println(print);
    }


}

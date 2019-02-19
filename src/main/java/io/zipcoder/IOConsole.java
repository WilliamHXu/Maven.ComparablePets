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
        String petName = in.next();
        Pet pet = new Pet(petName);
        if (typeOfPets == "dog"){
            pet = new Dog(petName);
        }
        else if (typeOfPets == "cat"){
            pet = new Cat(petName);
        }
        else if (typeOfPets == "parrot"){
            pet = new Parrot(petName);
        }
        return pet;
    }
}

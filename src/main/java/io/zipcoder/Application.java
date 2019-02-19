package io.zipcoder;


import io.zipcoder.Pets.Pet;

public class Application {

    public static void application(){
        IOConsole console = new IOConsole();
        Integer numberOfPets = console.askHowManyPets();
        Pet[] petArray = new Pet[numberOfPets];
        for (int i = 0; i < numberOfPets; i++) {
            petArray[i] = console.askWhatTypeOfPet();
        }
        console.printPetArray(petArray);
    }
}

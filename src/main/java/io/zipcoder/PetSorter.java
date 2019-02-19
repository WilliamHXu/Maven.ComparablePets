package io.zipcoder;

import io.zipcoder.Pets.Pet;

import java.util.Comparator;

public class PetSorter {
    private Pet[] pets;

    public PetSorter(Pet[] pets) {
        this.pets = pets;
    }

    public Pet[] sort(Comparator<Pet> comparator) {
        Pet[] sortedArray = pets;
        for (int i = 1; i < sortedArray.length; i++) {
            for (int j = i; j > 0; j--) {
                if (comparator.compare(sortedArray[j], sortedArray[j - 1]) < 0) {
                    Pet temp = sortedArray[j];
                    sortedArray[j] = sortedArray[j - 1];
                    sortedArray[j - 1] = temp;
                }

            }
        }
        return sortedArray;
    }


}

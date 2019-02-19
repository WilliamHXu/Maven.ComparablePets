package io.zipcoder.PetComparators;

import io.zipcoder.Pets.Pet;

import java.util.Comparator;

public class PetComparator implements Comparator<Pet> {

    public int compare(Pet a, Pet b) {
        if (a.petTypeString().equals(b.petTypeString())){
            return a.getName().compareTo(b.getName());
        }
        else {
            return a.petTypeString().compareTo(b.petTypeString());
        }
    }

}
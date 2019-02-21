package io.zipcoder;


import io.zipcoder.PetComparators.PetComparator;
import io.zipcoder.Pets.Cat;
import io.zipcoder.Pets.Dog;
import io.zipcoder.Pets.Parrot;
import io.zipcoder.Pets.Pet;
import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.instanceOf;

public class ApplicationTest {
    Application newApp = new Application();

    @Test
    public void testCreatePetOfTypeCat() {
        //Given
        String expectedType = "cat";
        String spokenWord = "Meow!";
        String name = "Martha";
        Pet testCat = newApp.createPetOfType(expectedType, name);

        //When
        String actualType = testCat.petTypeString();
        String actualName = testCat.getName();
        String actualSpokenWord = testCat.speak();

        //Then
        Assert.assertEquals(expectedType, actualType);
        Assert.assertEquals(name, actualName);
        Assert.assertEquals(spokenWord, actualSpokenWord);

    }

    @Test
    public void testCreatePetOfTypeDog() {
        //Given
        String expectedType = "dog";
        String spokenWord = "Bark!";
        String name = "Harriet";
        Pet testDog = newApp.createPetOfType(expectedType,name);

        //When
        String actualType = testDog.petTypeString();
        String actualName = testDog.getName();
        String actualSpokenWord = testDog.speak();

        //Then
        Assert.assertEquals(expectedType, actualType);
        Assert.assertEquals(name, actualName);
        Assert.assertEquals(spokenWord, actualSpokenWord);

    }

    @Test
    public void testCreatePetOfTypeParrot() {
        //Given
        String expectedType = "parrot";
        String name = "Harriet";
        String spokenWord = "" + name + " wants a cracker";

        Pet testParrot= newApp.createPetOfType(expectedType,name);

        //When
        String actualType = testParrot.petTypeString();
        String actualName = testParrot.getName();
        String actualSpokenWord = testParrot.speak();

        //Then
        Assert.assertEquals(expectedType, actualType);
        Assert.assertEquals(name, actualName);
        Assert.assertEquals(spokenWord, actualSpokenWord);

    }

    @Test
    public void testSortPetArraySameName() {
        //Given
        Pet cat = new Cat("Bob");
        Pet dog = new Dog("Bob");
        Pet parrot = new Parrot("Bob");

        Pet[] testArray = new Pet[]{dog, cat, parrot};
        Pet[] expected = new Pet[]{cat, dog, parrot};
        PetSorter testSorter = new PetSorter(testArray);
        PetComparator testComp = new PetComparator();

        //When

        Pet[] actual = testSorter.sort(testComp);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSortPetArrayDifferentName() {
        //Given
        Pet cat = new Cat("Zane");
        Pet dog = new Dog("Hector");
        Pet parrot = new Parrot("Alice");

        Pet[] testArray = new Pet[]{dog, cat, parrot};
        Pet[] expected = new Pet[]{cat, dog, parrot,};
        PetSorter testSorter = new PetSorter(testArray);
        PetComparator testComp = new PetComparator();

        //When
        Pet[] actual = testSorter.sort(testComp);

        Assert.assertArrayEquals(expected, actual);
    }
}

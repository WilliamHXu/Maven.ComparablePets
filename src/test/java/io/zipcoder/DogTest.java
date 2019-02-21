package io.zipcoder;

import io.zipcoder.Pets.Cat;
import io.zipcoder.Pets.Dog;
import io.zipcoder.Pets.Pet;
import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.instanceOf;

public class DogTest {

    @Test
    public void testDogGetter() {

        //Given
        Dog myDog = new Dog("Frank");
        String expected = "Frank";
        //When
        String actual = myDog.getName();
        //Then
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void testDogSetter() {
        //Given
        Dog anotherDog = new Dog("Margarita");
        String expected = "Bob";

        //When
        anotherDog.setName(expected);
        String actual = anotherDog.getName();

        //Then
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void testDogSpeak() {
        //Given
        Dog pup = new Dog("Hank");
        String expected = "Bark!";

        //When
        String actual = pup.speak();

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testDogInstanceOf() {
        //Given
        Dog dog = new Dog("Bubbles");
        //Then
        Assert.assertThat(dog, instanceOf(Pet.class));
    }

    @Test
    public void testDogCompareToEqual() {
        //Given
        Dog dog1 = new Dog("Jeff");
        Dog dog2 = new Dog("Jeff");

        //When
        int comparisonValue = dog1.compareTo(dog2);

        //Then
        Assert.assertTrue(comparisonValue == 0);
    }

    @Test
    public void testDogDogCompareToNegative() {
        //Given
        Dog doggie = new Dog("Hank");
        Dog dog = new Dog("Jeff");

        //When
        int comparisonValue = doggie.compareTo(dog);

        //Then
        Assert.assertTrue(comparisonValue < 0);

    }

    @Test
    public void testDogCatCompareToPositive() {
        //Given
        Cat gato = new Cat("Jeff");
        Dog doge = new Dog("Jeff");

        //When
        int comparisonValue = doge.compareTo(gato);

        //Then
        Assert.assertTrue(comparisonValue > 0);

    }

    @Test
    public void testDogDogComparePositive() {
        //Given
        Dog dog1 = new Dog("Zane");
        Dog dog2 = new Dog("Ann");

        //When
        int comparisonValue = dog1.compareTo(dog2);

        //Then
        Assert.assertTrue(comparisonValue > 0);

    }
}

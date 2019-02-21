package io.zipcoder;

import io.zipcoder.Pets.Cat;
import io.zipcoder.Pets.Dog;
import io.zipcoder.Pets.Pet;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.instanceOf;

public class CatTest {

    @Test
    public void testCatGetter() {

        //Given
        Cat myCat = new Cat("Frank");
        String expected = "Frank";
        //When
        String actual = myCat.getName();
        //Then
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void testCatSetter() {
        //Given
        Cat anotherCat = new Cat("Margarita");
        String expected = "Bob";

        //When
        anotherCat.setName(expected);
        String actual = anotherCat.getName();

        //Then
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void testCatSpeak() {
        //Given
        Cat kitty = new Cat("Hank");
        String expected = "Meow!";

        //When
        String actual = kitty.speak();

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testCatInstanceOf() {
        //Given
        Cat cat = new Cat("Bubbles");
        //Then
        Assert.assertThat(cat, instanceOf(Pet.class));
    }

    @Test
    public void testCatCompareToEqual() {
        //Given
        Cat gato = new Cat("Jeff");
        Cat secondGato = new Cat("Jeff");

        //When
        int comparisonValue = gato.compareTo(secondGato);

        //Then
        Assert.assertTrue(comparisonValue == 0);
    }

    @Test
    public void testCatCatCompareToNegative() {
        //Given
        Cat gato = new Cat("Hank");
        Cat secondGato = new Cat("Jeff");

        //When
        int comparisonValue = gato.compareTo(secondGato);

        //Then
        Assert.assertTrue(comparisonValue < 0);

    }

    @Test
    public void testCatDogCompareToNegative() {
        //Given
        Cat gato = new Cat("Jeff");
        Dog doge = new Dog("Jeff");

        //When
        int comparisonValue = gato.compareTo(doge);

        //Then
        Assert.assertTrue(comparisonValue < 0);

    }

    @Test
    public void testCatCatComparePositive() {
        //Given
        Cat gato = new Cat("Zane");
        Cat secondGato = new Cat("Ann");

        //When
        int comparisonValue = gato.compareTo(secondGato);

        //Then
        Assert.assertTrue(comparisonValue > 0);

    }
}
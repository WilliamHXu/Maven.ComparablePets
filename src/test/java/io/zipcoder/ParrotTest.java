package io.zipcoder;

import io.zipcoder.Pets.Cat;
import io.zipcoder.Pets.Dog;
import io.zipcoder.Pets.Parrot;
import io.zipcoder.Pets.Pet;
import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.instanceOf;

public class ParrotTest {

    @Test
    public void testParrotGetter() {

        //Given
        Parrot parrot = new Parrot("Frank");
        String expected = "Frank";
        //When
        String actual = parrot.getName();
        //Then
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void testParrotSetter() {
        //Given
        Parrot parrot = new Parrot("Margarita");
        String expected = "Bob";

        //When
        parrot.setName(expected);
        String actual = parrot.getName();

        //Then
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void testParrotSpeak() {
        //Given
        Parrot parrot = new Parrot("Hank");
        String expected = "" + parrot.getName() + " wants a cracker";

        //When
        String actual = parrot.speak();

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testParrotInstanceOf() {
        //Given
        Parrot par = new Parrot("Bubbles");
        //Then
        Assert.assertThat(par, instanceOf(Pet.class));
    }

    @Test
    public void testParrotCompareToEqual() {
        //Given
        Parrot par = new Parrot("Jeff");
        Parrot par2 = new Parrot("Jeff");

        //When
        int comparisonValue = par.compareTo(par2);

        //Then
        Assert.assertTrue(comparisonValue == 0);
    }

    @Test
    public void testParrotParrotCompareToNegative() {
        //Given
        Parrot par = new Parrot("Hank");
        Parrot par2 = new Parrot("Jeff");

        //When
        int comparisonValue = par.compareTo(par2);

        //Then
        Assert.assertTrue(comparisonValue < 0);

    }

    @Test
    public void testParrotDogCompareToPositive() {
        //Given
        Parrot par = new Parrot("Jeff");
        Dog dog = new Dog("Jeff");

        //When
        int comparisonValue = par.compareTo(dog);

        //Then
        Assert.assertTrue(comparisonValue > 0);

    }

    @Test
    public void testParrotParrotComparePositive() {
        //Given
        Parrot par1 = new Parrot("Zane");
        Parrot par2 = new Parrot("Ann");

        //When
        int comparisonValue = par1.compareTo(par2);

        //Then
        Assert.assertTrue(comparisonValue > 0);

    }
}

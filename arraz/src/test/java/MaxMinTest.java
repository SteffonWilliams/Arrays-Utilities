import org.junit.Assert;
import org.junit.Test;

public class MaxMinTest {

    Arraz arraz = new Arraz();

    @Test
    public void test1findMaxMinOfArray(){
        //Given
        Integer[] nums = {55,67,45,33,57,84,24,67};
        //
        int maxExpected = 84;
        int minExpected = 24;
        MaxMin maxMin = arraz.findMaxMinOfArray(nums);
        //Then
        Assert.assertEquals(maxExpected, maxMin.getMax());
        Assert.assertEquals(minExpected, maxMin.getMin());
    }

    @Test
    public void test2findMaxMinOfArray(){
        //Given
        Integer[] nums = {55,67,45,33,57,89,20,67};
        //
        int maxExpected = 89;
        int minExpected = 20;
        MaxMin maxMin = arraz.findMaxMinOfArray(nums);
        //Then
        Assert.assertEquals(maxExpected, maxMin.getMax());
        Assert.assertEquals(minExpected, maxMin.getMin());

    }
}

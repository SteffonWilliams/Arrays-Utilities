import oracle.jvm.hotspot.jfr.ThreadGroupEntry;
import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class ArrazTest {
    Arraz arraz = new Arraz();

    @Test
    public void test1SumValuesOfArray() {
        //Given
        Arraz arrazClass = new Arraz();
        Integer[] nums = {1, 2, 3};
        //When
        Integer expected = 6;
        Integer actual = arrazClass.sumValuesOfArray(nums);
        //Then
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void test2SumValuesOfArray() {
        //Given
        Arraz arrazClass2 = new Arraz();
        Integer[] nums2 = {1, 2,3, 3};
        //When
        Integer expected2 = 9;
        Integer actual2 = arrazClass2.sumValuesOfArray(nums2);
        //Then
        Assert.assertEquals(expected2, actual2);


    }

    @Test
    public void test1sumDoublesOfArray(){
        //Given
        Arraz arrazClass1 = new Arraz();
        Double[] nums = {1.00,2.00,3.00};
        //When
        double expected = 6.00;
        double actual = arrazClass1.sumDoublesOfArray(nums);
        //Then
        Assert.assertEquals(expected,actual);

    }

    @Test
    public void test2sumValuesOfArray(){
        //Given
        Arraz arrazClass2 = new Arraz();
        Double[] nums = {1.00,2.00,3.00,1.00};
        //When
        double expected2 = 7.00;
        double actual2 = arrazClass2.sumDoublesOfArray(nums);
        //Then
        Assert.assertEquals(expected2,actual2);


    }
    @Test
    public void test1averageOfArray(){
        //Given
        Arraz arrazClass1 = new Arraz();
        Integer[] nums = {5,5};
        //When
        Integer expected = 5;
        Integer actual = arrazClass1.averageOfArray(nums);
        //Then
        Assert.assertEquals(expected,actual);

    }
    @Test
    public void test2averageOfArray(){
        //Given
        Arraz arraz  = new Arraz();
        Integer[] nums = {3,3,3};
        //When
        Integer expected = 3;
        Integer actual = arraz.averageOfArray(nums);
        //
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void test1doubleAverageOfArray(){
        //Given
        Arraz arraz = new Arraz();
        Double[] nums = {3.25,2.45,1.00,4.55};
        //When
        Double expected = 2.8125;
        Double actual = arraz.doubleAverageOfArray(nums);
        //Then
        Assert.assertEquals(expected,actual);

    }
    @Test
    public void test2doubleAverageOfArray(){
        //Given
        Arraz arraz = new Arraz();
        Double[] nums = {1.00,2.25, 3.25,3.44};
        //Then
        Double expected = 2.485;
        Double actual = arraz.doubleAverageOfArray(nums);
        //Then
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void test1containsValue(){
        //Given
        Arraz arraz = new Arraz();
        Double[] nums = {1.00,2.25, 3.25,3.44};
        Double value = 1.00;
        //When
        Boolean actual = arraz.containsValue(nums,value);
        //Then
        Assert.assertTrue(actual);
    }
    @Test
    public void test2containsValue(){
        //Given
        Arraz arraz = new Arraz();
        Double[] nums = {1.00, 2.25, 3.25,4.567};
        Double value = 4.568;
        //When
        Boolean actual = arraz.containsValue(nums,value);
        //Then
        Assert.assertFalse(actual);

    }

    @Test
    public void test1reverseArray(){
        //Given
        Arraz arraz = new Arraz();
        Integer[] nums = {1,2,3,4,5,6,7};
        //When
        Integer[] expected = {7,6,5,4,3,2,1};
        Integer[] actual = arraz.reverseArray(nums);
        //Then
        Assert.assertEquals(expected,actual);

    }
    @Test
    public void test2reverseArray(){
        //Given
        Integer[] nums ={10,11,12,13,14};
        //When
        Integer[] expected = {14,13,12,11,10};
        Integer[] actual = arraz.reverseArray(nums);
        //Then
        Assert.assertEquals(expected,actual);

    }
    @Test
    public void test1findIndexOf(){
        //Given
        int [] nums = {1,2,3,4,5,6};
        int val = 2;
        //When
        int expectedIndex = 1;
        int actualIndex = arraz.findIndexOf(nums,val);
        //Then
        Assert.assertEquals(expectedIndex,actualIndex);

    }
    @Test
    public void test2findIndexOf(){
        //Given
        int[] nums = {1,2,3,4,5,6,7,8};
        int val = 5;
        //When
        int expectedIndex = 4;
        int actualIndex = arraz.findIndexOf(nums,val);
        //Then
        Assert.assertEquals(expectedIndex,actualIndex);
    }
    @Test
    public void test1copyArrayByIterator (){
        //Given
        Integer[] nums = {1,2,3,4,5,6};
        //When
        Integer [] expectedNums = {1,2,3,4,5,6};
        Integer [] actualNums = arraz.copyArrayByIterator(nums);
        //Then
        Assert.assertEquals(expectedNums,actualNums);

    }
    @Test
    public void test2coppyArrayByIterator(){
        //Given
        Integer[] nums ={1,2};
        //When
        Integer[] expectedNums = {1,2};
        Integer[] actualNums = arraz.copyArrayByIterator(nums);
        //Then
        Assert.assertEquals(expectedNums,actualNums);
    }
    @Test
    public void test1copyArrayByLoop(){
        //Given
        Integer[] nums ={1,2};
        //When
        Integer[] expectedNums = {1,2};
        Integer[] actualNums = arraz.copyArrayByLoop(nums);
        //Then
        Assert.assertEquals(expectedNums,actualNums);
    }
    @Test
    public void test2copyArrayByLoop(){
        //Given
        Integer[] nums = {12,3,4,5,6,7};
        //When
        Integer[] expectedNums = {12,3,4,5,6,7};
        Integer[] actualNums = arraz.copyArrayByLoop(nums);
        //Then
        Assert.assertEquals(expectedNums,actualNums);

    }
    @Test
    public void test1removeElementFromArray() {
        //Given
        Integer[] nums = {1,2,3};
        Integer valToRemove = 2;
        //When
        Integer[] expectedNums = {1,3};
        Integer[] actualNums = arraz.removeElementFromArray(nums, valToRemove);
        //Then
        Assert.assertEquals(expectedNums,actualNums);
    }
    @Test
    public void test2removeElementFromArray(){
        //Given
        Integer[] nums = {3,4,5,6,7,8,9};
        Integer valToRemove = 9;
        //When
        Integer[] expectedNums = {3,4,5,6,7,8,};
        Integer[] actualNums = arraz.removeElementFromArray(nums,valToRemove);
        //Then
        Assert.assertEquals(expectedNums,actualNums);
    }
    @Test
    public void test1insertIntoArrayAt(){
        //Given
        Integer[] nums = {1,3,4,5,6};
        Integer valToBeInserted = 4;
        int indexToInsert = 3;
        //When
        Integer[] expectedNums = {1,3,4,4,6};
        Integer[] actualNums = arraz.insertIntoArrayAt(nums,valToBeInserted,indexToInsert);
        //Then
        Assert.assertEquals(expectedNums,actualNums);

    }
    @Test
    public void test2insertIntoArrayAt(){
        //Given
        Integer[] nums = {1,2};
        Integer valToBeInserted = 22;
        int indexToInsert = 0;
        //When
        Integer[] expectedNums = {22,2};
        Integer[] actualNums = arraz.insertIntoArrayAt(nums,valToBeInserted,indexToInsert);
    }
    @Test
    public  void test1removeDupesFromArray(){
        //Given
        Integer [] nums = {1,1,1,1,2,2,2,3,3,3,3};
        //When
        Integer[] expectedNums = {1,2,3};
        Integer[] actualNums = arraz.removeDupesFromArray(nums);
        //Then
        Assert.assertEquals(expectedNums,actualNums);
    }
    @Test
    public void test2removeDupesFromArray(){
        //Given
        Integer [] nums = {3,3,4,5,6,7,8,9,3};
        //When
        Integer[] expectedNums = {3,4,5,6,7,8,9};
        Integer[] actualNums = arraz.removeDupesFromArray(nums);
        //Then
        Assert.assertEquals(expectedNums,actualNums);
    }
    @Test
    public void test1find2ndLargestValueFromArray(){
        //Given
        Double[] nums = {9.25, 10.2334,10.2334,1.345678};
        //When
        double expected2ndLargestValue = 9.25;
        double actual2ndLargestValue = arraz.find2ndLargestValueFromArray(nums);
        //Then
        Assert.assertEquals(expected2ndLargestValue,actual2ndLargestValue);
    }
    @Test
    public void test2find2ndLargestValueFromArray(){
        //Given
        Double[] nums = {1.23, 1.23, 12.22, 123.33, 123.33};
        //When
        double expected2ndLargestValue = 12.22;
        double actual2ndLargestValue = arraz.find2ndLargestValueFromArray(nums);
        //Then
        Assert.assertEquals(expected2ndLargestValue, actual2ndLargestValue);
    }

    @Test
    public void test1makeMeAnArrayFromArrayList(){
        //Given
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(0,1);
        nums.add(1,2);
        nums.add(2,3);
        //When
        Integer[] expectedArr = {1,2,3};
        Integer[] actualArr = arraz.makeMeAnArrayFromArrayList(nums);
        //Then
        Assert.assertEquals(expectedArr,actualArr);
    }
    @Test
    public void test2makeMeAnArrayFromArrayList(){
        //Given
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(2);
        nums.add(3);
        //When
        Integer[] expectedArr = {1,2,3};
        Integer[] actualArr = arraz.makeMeAnArrayFromArrayList(nums);
        //Then
        Assert.assertEquals(expectedArr,actualArr);

    }
    @Test
    public void test1check2ArraysForEqual(){
        //Given
        int[] arr1 = {1,2,3,4};
        int[] arr2 = {1,2,3,4};
        Assert.assertTrue(Arrays.equals(arr1,arr2));
    }
    @Test
    public void test2check2ArraysForEqual() {
        //Given
        int[] arr1 = {1, 1, 4, 4};
        int[] arr2 = {1, 2, 4, 4,2};
        Assert.assertFalse(arraz.check2ArraysForEqual(arr1,arr2));
    }
    @Test
    public void test1averageArrayWithoutMaxMin(){
        //Given
        Integer[] numsArr = {2,4,6,8};
        //When
        int expectedAverage = 5;
        int actualAverage = arraz.averageWithoutMaxMin(numsArr);
        //Then
        Assert.assertEquals(expectedAverage,actualAverage);
    }
    @Test
    public void test2averageArrayWithoutMaxMin(){
        //Given
        Integer[] numsArr = {8,4,2,6};
        //When
        int expectedAverage = 5;
        int actualAverage = arraz.averageWithoutMaxMin(numsArr);
        //Then
        Assert.assertEquals(expectedAverage,actualAverage);
    }
    @Test
    public void test1arrayHas65and77(){
        //Given
        Integer[] numsArr = {1,2,3,5,3,5,67,67};
        Integer val65 = 65;
        Integer val77 = 77;
        //Then
        Assert.assertTrue(arraz.arrayHas65and77(numsArr,val65,val77));


    }



}
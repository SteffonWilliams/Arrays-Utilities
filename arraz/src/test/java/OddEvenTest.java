import org.junit.Assert;
import org.junit.Test;

public class OddEvenTest {
    Arraz arraz = new Arraz();

    @Test
    public void test1OddEven(){
        //Given
        int [] nums = {2,2,5,5};
        //When

        int odds = 2;
        int evens = 2;
        OddEven oddEvenActual = arraz.oddEven(nums);
        //Then
        Assert.assertEquals(odds,oddEvenActual.getOdds());
        Assert.assertEquals(evens,oddEvenActual.getEvens());

    }
    @Test
    public void test2OddEven(){
        //Given
        int []  nums = {22,2,2,5,5};
        //When
        int oddsExpected = 2;
        int evensExpected = 3;
        OddEven oddEvenActual = arraz.oddEven(nums);
        //Then
        Assert.assertEquals(oddsExpected,oddEvenActual.getOdds());
        Assert.assertEquals(evensExpected,oddEvenActual.getEvens());
    }

}

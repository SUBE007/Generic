package genericpro;

import genricpro.MaxInThreeInt;
import org.junit.Assert;
import org.junit.Test;

public class MaxNumberTest {
    @Test
    public void givenNumber_IfFindMaximum_ReturnThatValue1() {
         Integer largest1= MaxInThreeInt.maxInGivenThreeInteger(25,26,1);
         Assert.assertSame(26,largest1);
    }

    @Test
    public void givenNumber_IfFindMaximum_ReturnThatValue2() {
        Integer largest2= MaxInThreeInt.maxInGivenThreeInteger(100,26,0);
        Assert.assertSame(100,largest2);
    }

    @Test
    public void givenNumber_IfFindMaximum_ReturnThatValue3() {
        Integer largest3= MaxInThreeInt.maxInGivenThreeInteger(100,26,121);
        Assert.assertSame(121,largest3);
    }
}

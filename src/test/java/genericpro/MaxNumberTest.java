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

    @Test
    public void givenThreeNumber_IfFindMaximum_ReturnThatValue1() {
        Float float1= MaxInThreeInt.maxInGivenThreeFloat(125.0f,26.0f,1.0f);
        Assert.assertEquals(125.0,float1,0.01);
    }

    @Test
    public void givenThreeNumber_IfFindMaximum_ReturnThatValue2() {
        Float float2= MaxInThreeInt.maxInGivenThreeFloat(35.21f,62.5f,12.5f);
        Assert.assertEquals(62.5,float2,0.01);
    }

    @Test
    public void givenThreeNumber_IfFindMaximum_ReturnThatValue3() {
        Float float3= MaxInThreeInt.maxInGivenThreeFloat(100.0f,26.0f,62.1f);
        // Assert.assertSame(100.0f,float3);
        Assert.assertEquals(100,float3,0.01);
    }
}

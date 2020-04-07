package genericpro;

import genricpro.MaxInThreeValue;
import org.junit.Assert;
import org.junit.Test;

public class MaxNumberTest {
    @Test
    public void givenNumber_IfFindMaximum_ReturnThatValue1() {
         Integer largest1= MaxInThreeValue.largestAmongThree(25,26,1);
         Assert.assertSame(26,largest1);
    }

    @Test
    public void givenNumber_IfFindMaximum_ReturnThatValue2() {
        Integer largest2= MaxInThreeValue.largestAmongThree(100,26,0);
        Assert.assertSame(100,largest2);
    }

    @Test
    public void givenNumber_IfFindMaximum_ReturnThatValue3() {
        Integer largest3= MaxInThreeValue.largestAmongThree(100,26,121);
        Assert.assertSame(121,largest3);
    }

    @Test
    public void givenThreeNumber_IfFindMaximum_ReturnThatValue1() {
        Float float1= MaxInThreeValue.largestAmongThree(125.0f,26.0f,1.0f);
        Assert.assertEquals(125.0,float1,0.01);
    }

    @Test
    public void givenThreeNumber_IfFindMaximum_ReturnThatValue2() {
        Float float2= MaxInThreeValue.largestAmongThree(35.21f,62.5f,12.5f);
        Assert.assertEquals(62.5,float2,0.01);
    }

    @Test
    public void givenThreeNumber_IfFindMaximum_ReturnThatValue3() {
        Float float3= MaxInThreeValue.largestAmongThree(100.0f,26.0f,62.1f);
        // Assert.assertSame(100.0f,float3);
        Assert.assertEquals(100,float3,0.01);
    }

    @Test
    public void givenThreeString_IfFindMaximum_ReturnThatString1() {
       String string1= MaxInThreeValue.largestAmongThree("sube","dube","mube");
        Assert.assertSame("sube",string1);
    }

    @Test
    public void givenThreeString_IfFindMaximum_ReturnThatString2() {
        String string2= MaxInThreeValue.largestAmongThree("dube","lube","hube");
        Assert.assertSame("lube",string2);
    }

    @Test
    public void givenThreeString_IfFindMaximum_ReturnThatString3() {
        String string3= MaxInThreeValue.largestAmongThree("quba","lube","sube");
        Assert.assertSame("sube",string3);
    }

    @Test
    public void givenValues_ifFindMaximum_ReturnThatIntegerValue_UsingConstructor() {
        MaxInThreeValue findMaximum = new MaxInThreeValue<Integer>(456,85,10);
        Integer largest = (Integer) findMaximum.largestAmongThree();
        Assert.assertEquals(new Integer(456),largest);
    }

    @Test
    public void givenValues_ifFindMaximum_ReturnThatFloatValue_UsingConstructor() {
        MaxInThreeValue findMaximum = new MaxInThreeValue<Float>(1.1f,20.0f,123.1f);
        Float largest = (Float) findMaximum.largestAmongThree();
        Assert.assertEquals(new Float(123.1f),largest,0.1);
    }

    @Test
    public void givenValues_ifFindMaximum_ReturnThatStringValue_UsingConstructor() {
        MaxInThreeValue findMaximum = new MaxInThreeValue<String>("sube","dube","mube");
        String largest = (String) findMaximum.largestAmongThree();
        Assert.assertEquals("sube",largest);
    }


}

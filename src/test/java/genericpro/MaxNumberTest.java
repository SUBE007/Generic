package genericpro;

import genricpro.MaxInThreeValue;
import org.junit.Assert;
import org.junit.Test;

public class MaxNumberTest {
    @Test
    public void givenNumber_IfFindMaximum_ReturnThatValue1() {
        MaxInThreeValue largest2=new  MaxInThreeValue(25,26,1,100);
        Assert.assertSame(100,largest2.check());
    }

    @Test
    public void givenNumber_IfFindMaximum_ReturnThatValue2() {
        MaxInThreeValue largest2=new  MaxInThreeValue(100,26,0,400,200);
        Assert.assertSame(400,largest2.check());
    }

    @Test
    public void givenNumber_IfFindMaximum_ReturnThatValue3() {
        MaxInThreeValue largest3=new  MaxInThreeValue(500,121);
        Assert.assertSame(500,largest3.check());
    }

    @Test
    public void givenThreeNumber_IfFindMaximum_ReturnThatValue1() {
        MaxInThreeValue largest=new  MaxInThreeValue(125.0f,26.0f,1.0f,200.0f,213.0f);
        Assert.assertSame(213.0f,largest.check());
    }

    @Test
    public void givenThreeNumber_IfFindMaximum_ReturnThatValue2() {
        MaxInThreeValue largest=new  MaxInThreeValue(35.21f,62.5f,12.5f);
        Assert.assertSame(62.5,largest.check());
    }

    @Test
    public void givenThreeNumber_IfFindMaximum_ReturnThatValue3() {
        MaxInThreeValue largest=new  MaxInThreeValue(100.0f,26.0f,62.1f);
        Assert.assertSame(100.0,largest.check());
    }

    @Test
    public void givenThreeString_IfFindMaximum_ReturnThatString1() {
        MaxInThreeValue largest=new  MaxInThreeValue("sube","dube","mube");
         Assert.assertSame("sube",largest.check());
    }

    @Test
    public void givenThreeString_IfFindMaximum_ReturnThatString2() {
        MaxInThreeValue largest=new  MaxInThreeValue("dube","lube","hube","Subedar");
        Assert.assertSame("lube",largest.check());
    }

    @Test
    public void givenThreeString_IfFindMaximum_ReturnThatString3() {
        MaxInThreeValue findMaximum = new MaxInThreeValue("quba","lube","sube","sdf");
        Assert.assertSame("sube",findMaximum.check());
    }


}

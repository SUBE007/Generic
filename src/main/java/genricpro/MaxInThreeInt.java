package genricpro;

public class MaxInThreeInt {
    public static int maxInGivenThreeInteger(Integer num, Integer num2,Integer num3){
        Integer max=num;
        if(num2.compareTo(max)>0)
            max=num2;
        if(num3.compareTo(max)>0)
            max=num3;
        return max;
    }

}
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
    public static Float maxInGivenThreeFloat(Float num, Float num2,Float num3){
        Float max=num;
        if(num2.compareTo(max)>0)
            max=num2;
        if(num3.compareTo(max)>0)
            max=num3;
        return max;
    }
    public static String maxInGivenThreeString(String string, String string2,String string3){
        String max=string;
        if(string2.toString().compareTo(max.toString())>0)
            max=string2;
        if(string3.toString().compareTo(max.toString())>0)
            max=string3;
        return max;
    }
}
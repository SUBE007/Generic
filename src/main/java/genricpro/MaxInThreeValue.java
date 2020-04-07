package genricpro;

import java.util.Arrays;

public class MaxInThreeValue<E extends Comparable> {
    E []arrValue;

    public MaxInThreeValue(){}
    public MaxInThreeValue(E ...value) {
        arrValue=(E[]) new Comparable[value.length];
        E[] array=(E[]) new Comparable[value.length];
        int i=0;
        for(E c:value){
            array[i]=c;
            i++;
        }
        this.arrValue = array;
    }
     public E check(){
        Arrays.sort(arrValue);
        E largestValue=arrValue[arrValue.length-1];
        printMax(largestValue);
        return largestValue;
    }

    public static <E> void printMax(E value){
        System.out.println(value);
    }
}
package genricpro;

public class MaxInThreeValue<E extends Comparable> {
    E firstValue;
    E secoundValue;
    E thirdValue;
    public MaxInThreeValue(E firstValue, E secoundValue, E thirdValue) {
        this.firstValue = firstValue;
        this.secoundValue = secoundValue;
        this.thirdValue = thirdValue;
    }

    public <E extends Comparable> E largestAmongThree() {

        E max=(E) largestAmongThree(firstValue,secoundValue,thirdValue);
        return max;
    }

    public static <E extends Comparable<E>> E largestAmongThree(E firstValue, E secoundValue, E thirdValue) {
        E max=firstValue;

        if(secoundValue.compareTo(max)>0)
            max=secoundValue;
        if(thirdValue.compareTo(max)>0) {
            max=thirdValue;
        }
        return max;
    }
}
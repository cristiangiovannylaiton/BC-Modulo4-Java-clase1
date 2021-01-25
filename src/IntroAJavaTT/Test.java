package IntroAJavaTT;


import java.util.ArrayList;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        Integer[] test1 = new Integer[]{3,673,106,45,2,23};
        Integer[] test2 = new Integer[]{170, 45, 75, 90, 802, 24, 2, 66};
        System.out.println("Ejercicio de radix Sort:");
        ArrayList<Integer> initialArray = new ArrayList<Integer> (Arrays.asList(test1));
        String[] sArr= StringUtilsRadixSort.castIntToString(initialArray);
        String[] sArrFilled= StringUtilsRadixSort.fillWithZeros(sArr);
        String[] result = StringUtilsRadixSort.listCreation(sArrFilled);
        for(String s:result){
            System.out.println(s);
        }
    }
}

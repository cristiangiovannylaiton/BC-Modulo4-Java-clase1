package IntroAJavaTT;

import java.util.ArrayList;

public class StringUtilsRadixSort {

    public static String[] castIntToString(ArrayList<Integer> input){
        String[] output = new String[input.size()];
        for (int i = 0 ; i< input.size(); i ++) {
            output[i] = String.valueOf(input.get(i));
        }
        return output;
    }
    public static String[] fillWithZeros(String[] input){
        int maxLength = 0;
        String[] filledArray = new String[input.length] ;
        for(String s:input){
            if (s.length()> maxLength){
                maxLength = s.length();
            }
        }
        for(int i = 0; i < input.length; i++) {
            filledArray[i] = "0".repeat(maxLength- input[i].length()) + input[i];
        }
        return filledArray;
    }
    public static String[] listCreation(String[] input){
        int size = input[0].length();
        String[] copy = input.clone();
        ArrayList<String>[] list = new ArrayList[10];

        for (int i = 0; i < input[0].length(); i++){
            for(int j = 0; j < 10; j++){
                list[j] = new ArrayList<String>();
            }

            for (int j = 0; j <input.length;j++) {
                int currentDigit = Integer.parseInt(input[j].substring(input[j].length() - (i+1),input[j].length() -(i)));
                list[currentDigit].add(input[j]);
            }

            int count = 0;
            int l =0;
            for(int j=0; j <list.length; j++){
                for(int k =0; k < list[j].size(); k++) {
                    if (list[j].size() != 0) {
                        input[count] = list[j].get(k);
                        count++;
                    }
                }
            }
        }
        return input;
    }

}

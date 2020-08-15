package ru.slavko;

import java.util.List;

public class NumGenerator {

    public static String generateNum(List<Integer> numbers) {
        Integer generatedNumber;

        if (numbers.size() == 0 || numbers.get(0) != 1){
            generatedNumber = 1;
            return castGeneratedNumberToTripleString(generatedNumber);
        }

        for (int i = 1; i < numbers.size(); i++) {
            if (numbers.get(i) - numbers.get(i-1) > 1 ) {
                generatedNumber = numbers.get(i-1) +1;
                return castGeneratedNumberToTripleString(generatedNumber);
            }
        }
        return castGeneratedNumberToTripleString(numbers.get(numbers.size()-1)+1);
    }


    private static String castGeneratedNumberToTripleString( Integer generatedNumber) {
        String generatedNumberToString;

        if (generatedNumber < 4) {
            generatedNumberToString = Integer.toBinaryString(generatedNumber);
            StringBuilder stringBuilder = new StringBuilder(generatedNumberToString);
            return stringBuilder.insert(0, "0").toString();
        }
        return Integer.toBinaryString(generatedNumber);
    }


}

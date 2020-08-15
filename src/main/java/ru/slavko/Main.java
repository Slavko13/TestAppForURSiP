package ru.slavko;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2);
        System.out.print("В списке: ");
        numbers.stream().forEach(System.out::print);
        System.out.println(" Ваш сгенерированный номер для проекта: " + NumGenerator.generateNum(numbers));
    }
}

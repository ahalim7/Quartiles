/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.halim.statistics.quartiles;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author ABDELHALIM
 */
public class Quartiles {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int size = Integer.parseInt(scanner.nextLine().trim());
        String[] lineValues = scanner.nextLine().split(" ");
        int[] results = new int[3];
        int[] numbers = convertStringIntoInteger(size, lineValues);
        sortArray(numbers);
        int from = 0, end = size / 2;
        results[0] = Median.getResult(Arrays.copyOfRange(numbers, from, end));
        results[1] = Median.getResult(numbers);
        results[2] = Median.getResult(Arrays.copyOfRange(numbers, size % 2 == 0 ? end : end + 1, size));

        for (int result : results) {
            System.out.println(result);
        }
    }

    private static int[] convertStringIntoInteger(int size, String[] array) {
        int[] temp = new int[size];
        for (int i = 0; i < size; i++) {
            temp[i] = Integer.parseInt(array[i]);
        }
        return temp;
    }

    private static void sortArray(int[] values) {
        int temp = 0;
        for (int i = 0; i < values.length; i++) {
            for (int j = 0; j < values.length; j++) {
                if (values[i] < values[j]) {
                    temp = values[i];
                    values[i] = values[j];
                    values[j] = temp;
                }
            }
        }
    }
}

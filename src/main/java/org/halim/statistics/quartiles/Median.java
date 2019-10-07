/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.halim.statistics.quartiles;

/**
 *
 * @author ABDELHALIM
 */
public class Median {

    public static int getResult(int[] numbers) {
        
        int size = numbers.length;
        
        if (size % 2 == 0) {
            return (numbers[size / 2 - 1] + numbers[size / 2]) / 2;
        } else {
            return (numbers[size / 2]);
        }
    }

}

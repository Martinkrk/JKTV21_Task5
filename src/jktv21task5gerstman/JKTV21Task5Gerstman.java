/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jktv21task5gerstman;


import java.util.Arrays;
import java.util.Random;
/**
 *
 * @author pupil
 */
public class JKTV21Task5Gerstman {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Random rnd = new Random();
        int[][] jagged = new int[5][];
        
        jagged[0] = new int[3];
        jagged[1] = new int[5];
        jagged[2] = new int[7];
        jagged[3] = new int[8];
        jagged[4] = new int[9];
              
        System.out.println("Unsorted: ");
        for(int i = 0; i < jagged.length; i++){
            for(int j = 0; j < jagged[i].length; j++){
                jagged[i][j] = rnd.nextInt(100 - 50 + 1) + 50;
                System.out.printf(jagged[i][j] + " ");
            }    
            System.out.println();
            Arrays.sort(jagged[i]);
        }
        System.out.println("\nSorted: ");
        for(int i = 0; i < jagged.length; i++){
            for(int j = 0; j < jagged[i].length; j++){
                System.out.printf(jagged[i][j] + " ");
            }
            System.out.println();
        }
    }  
}

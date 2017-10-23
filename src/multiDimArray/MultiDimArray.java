/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multiDimArray;

import java.util.Scanner;

/**
 *
 * @author wilson
 */
public class MultiDimArray {
    static double total;
    static double  gland_total;
    static Scanner scan = new Scanner(System.in);
    static String[][] num = new String[10][7];
   

    public static void main(String[] args) {

        MultiDimArray.arrays();

    }

    public static void arrays() {
        for (int i = 0; i < num.length; i++) {
            
            for (int j = 0; j < num[1].length; j++) {
                
                if(num[i][j]==num[i][0]) {
                    System.err.println("Plis Input name Of salesMan: "+ (i+1));
                    num[i][j]=scan.next();
                }else{
                    System.out.println("Please Input Sales For Item: "+ j);
                     num[i][j]=scan.next();
                }
 
            }
        }

        System.out.printf("%10S %10S %10S %10S %10S %10S %10S %10S %n", "Name", "item 1", "item 2", "item 3", "item 4", "item 5","item 6", "total");
        System.out.printf("%20s %n", "-------------------------------------------------------------------------------------------");
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[1].length; j++) {

                if (num[i][0] != num[i][j]) {
                    
                        total += Double.parseDouble(num[i][j]);
                        gland_total+=Double.parseDouble(num[i][j]);

                }
                System.out.printf("%10S ", num[i][j]);
                
            }
            System.out.printf(" %10.2f %n", total);
            total=0;
            System.out.println();
        }
        System.out.printf("%20s %n","-------------------------------------------------------------------------------------------");
         System.out.printf("Gland total: %76.2f", gland_total);
        System.out.println();
       
    }
}

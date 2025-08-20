/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package basiccontrolstructurepart1;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Problem10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Input the Number: ");
          int number = sc.nextInt();
          
          for (int i = number; i >= 1; i--) {
              for (int j = i; j <= i; j++){
                  System.out.println("*");
                  
              }
              System.out.println("");
          }
    }
    
}

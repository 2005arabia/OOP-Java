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
public class Problem8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter Number of terms: ");
          int terms = sc.nextInt();
          
          for (int i = 1; i<= terms; i++){
              System.out.println("Number is: "+ i +" amd cube of "+" is "+ (i+i+i) );
              
          }
    }
    
}

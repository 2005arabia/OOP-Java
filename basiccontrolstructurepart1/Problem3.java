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
public class Problem3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Input a lst number: ");
        int firstnum = sc.nextInt();
        System.out.println("Imput a 2nd number: ");
        int secondnum = sc.nextInt();
        System.out.println("Imput a 3rd number: ");
        int thirdnum = sc.nextInt ();
        
        int greatest = firstnum;
        if (secondnum > firstnum){
            greatest = secondnum;
            
        }
        if (thirdnum > greatest){
            greatest = thirdnum;
        }
        System.out.println("The Greatest: "+ greatest);
    
}
}

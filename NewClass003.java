/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pack2;

/**
 *
 * @author user
 */

public class NewClass003 {
    public static void main(String[] args) {
        // ? : Operator
        boolean isHonest= false;
        
        String decisin = isHonest ? "You are Honest" : "You are liar";
        System.out.println( decisin );
        

        
        // Verilen üç sayıdan en büyüğünü bulunuz 
        int a = 15, b = 9, c = 1;
        int bigger=  a>b ? a:b ;
        System.out.println(bigger);
        bigger = bigger > c ? bigger : c ;
        System.out.println("The bigest number is : "+ bigger);

    }
}

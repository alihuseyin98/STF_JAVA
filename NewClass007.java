/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pack2;

/**
 *
 * @author user
 */
public class NewClass007 {
    public static void main(String[] args) {
        int a = 123;
        int one= a% 10; // 3
        a /=10;
        int ten = a% 10 ; // 2
        a /= 10; // 1 
        a += +(ten *10) +( one *100) ;
        System.out.println("5 : "+a);
        /// 
        int b = 21;
        System.out.println( b%2 == 0 ? "even number ": "Odd number" );
    }
    
}

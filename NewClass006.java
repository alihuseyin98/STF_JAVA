/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pack2;

/**
 *
 * @author user
 */
public class NewClass006 {
    public static void main(String[] args) {
        int a = 12;
        System.out.println("3 :  "+a%10);
        
        int b = 12;
        int tmp= b/10; // 6
        b -= (tmp*10); // 4
        b = b*10 + tmp;
        
        /*
        int tmp= b%10;
        b /= 10;
        b += tmp*10;
*/
        System.out.println("4 : "+b);
    }
}

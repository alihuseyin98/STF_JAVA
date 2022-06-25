/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pack2;

/**
 *
 * @author user
 */
public class NewClass002 {
    public static void main(String[] args) {
        //Logical Operators !, &&, ||, ^
        System.out.println(1 == 1); // (1==1) is (true)  / (1 == 2) is (false)
        System.out.println(!true);
        /*
                 ---AND && truth table:---
                 true  && true    :   true
                 true  && false   :   false 
                 false && true    :   false
                 false && false   :   false
        
                            
        */
        System.out.println("t t"+ (true && true));
        System.out.println("t f"+ (1==1 && 0>5));
        System.out.println("f t"+ (false && true));
        System.out.println("f f"+(false && false));
        
        /*
                 ---OR || truth table:---
                 true  || true    :   true
                 true  || false   :   true 
                 false || true    :   true
                 false || false   :   false
                            
        */
        System.out.println("t t "+ (true || true));
        System.out.println("t f "+ (1==1 || 0>5));
        System.out.println("f t "+ (false || true));
        System.out.println("f f "+(false || false));
        
        /*
                 ---EXOR ^ truth table:---
                 true  ^ true    :   false
                 true  ^ false   :   true 
                 false ^ true    :   true
                 false ^ false   :   false
                            
        */
        System.out.println("+------------");
        System.out.println("t t "+ (true ^ true));
        System.out.println("t f "+ (1==1 ^ 0>5));
        System.out.println("f t "+ (false ^ true));
        System.out.println("f f "+(false ^ false));
        
        /*
        (true OR false) OR false // true
        (false AND false) OR false // false
        false AND true OR false // false
        */
    }
}

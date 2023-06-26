/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package metodo;

/**
 *
 * @author davi-softplan
 */
public class Metodo {
    private static int soma (int a, int b) {
        int s = a + b;
        return s;
    }
    
    public static void main(String[] args) {
        int s = soma(5, 2);
        System.out.println("A soma vale " + s);
    }
}

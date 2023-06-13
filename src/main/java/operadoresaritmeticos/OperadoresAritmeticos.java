/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package operadoresaritmeticos;

/**
 *
 * @author Davi Vitorino
 */
public class OperadoresAritmeticos {
    public static void main(String[] args) {
        /*
        int n1 = 3;
        int n2 = 5;
        float media = (n1 + n2) / 2;
        System.out.println("A média é igual a " + media);
        */
        
        /*
        int numero = 5;
        int valor = 5 + ++numero;
        System.out.println(valor);
        System.out.println(numero);
        */
        
        /*
        int x = 4;
        x += 2;
        System.out.println(x);
        */
        
        /*
        float value = 8.3f;
        int floor = (int) Math.floor(value);
        int ceil = (int) Math.ceil(value);
        int round = (int) Math.round(value);
        
        System.out.println(floor); 
        System.out.println(ceil); 
        System.out.println(round);
        */
        
        double random = Math.random();
        int n = (int) (5 + random * (10 - 5));
        System.out.println(n);
    }
}

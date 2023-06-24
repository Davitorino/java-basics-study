/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vetores;

import java.util.Arrays;

/**
 *
 * @author davi-softplan
 */
public class Vetores {
    public static void main(String[] args) {
        int n[] = new int[4];
        int[] v = {5, 6, 3, 7, 8, 3};
        
        int valor = Arrays.binarySearch(v, 7);
        System.out.println(valor);
        
        Arrays.sort(v);        
        
        for (int numero : v) {
            System.out.println(numero);
        }
        
        Arrays.fill(n, 7);
        
        for (int numero : n) {        
            System.out.println(numero);
        }
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programamedia;

import java.util.Scanner;

/**
 *
 * @author Davi Vitorino
 */
public class ProgramaMedia {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Primeira nota: ");
        float n1 = teclado.nextFloat();
        System.out.print("Segunda nota: ");
        float n2 = teclado.nextFloat();
        float media = (n1 + n2) / 2;
        
        System.out.println("Sua média foi " + media);
        
        if (media > 9) {
            System.out.println("Parabéns!");
        }
    }
}

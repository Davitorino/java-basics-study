/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package usandoswitch;

import java.util.Scanner;

/**
 *
 * @author Davi Vitorino
 */
public class UsandoSwitch {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numeroPernas = teclado.nextInt();
        String tipo;
        
        switch (numeroPernas) {
            case 1:
                tipo = "Saci";
                break;
            case 2:
                tipo = "Bípede";
                break;
            case 4:
                tipo = "Quadrúpede";
                break;
            case 6: case 8:
                tipo = "Aranha";
                break;
            default:
                tipo = "ET";
        }
        
        System.out.println(tipo);
    }
}

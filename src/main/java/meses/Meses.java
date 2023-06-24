/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package meses;

import java.time.Year;

/**
 *
 * @author davi-softplan
 */
public class Meses {
    public static void main(String[] args) {
        String[] meses = {"Jan", "Fev", "Mar", "Abr", "Mai", "Jun", "Jul", "Ago", "Set", "Out", "Nov", "Dez"};
        int[] dias = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        
        if (Year.now().getValue() % 4 == 0) dias[1] = 29;
        
        for (int index = 0; index < meses.length; index++) {
            System.out.println("O mês de " + meses[index] + " tem " + dias[index] + " dias!");
        }
    }
}

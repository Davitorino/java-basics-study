/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programaidade;

import java.time.Year;
import java.util.Scanner;

/**
 *
 * @author Davi Vitorino
 */
public class ProgramaIdade {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite seu ano de nascimento: ");
        int bornYear = teclado.nextInt();
        int age = Year.now().getValue() - bornYear;
        System.out.println("Sua idade é " + age);
        
        if (age >= 18) {
            System.out.println("Maior");
        } else {
            System.out.println("Menor");
        }
    }
}

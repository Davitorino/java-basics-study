/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package comparacaostrings;

/**
 *
 * @author Davi Vitorino
 */
public class ComparacaoStrings {
    public static void main(String[] args) {
        String nome1 = "Davi";
        String nome2 = "Davi";
        String nome3 = new String("Davi");
        String res;
        
        res = (nome1.equals(nome3)) ? "igual" : "diferente";
        System.out.println(res);
    }
}

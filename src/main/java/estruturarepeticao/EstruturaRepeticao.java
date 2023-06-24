/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estruturarepeticao;

/**
 *
 * @author davi-softplan
 */
public class EstruturaRepeticao {
    public static void main(String[] args) {
        int cc = 0;
        
//        while (cc < 10) {
//            cc++;
//            
//            if (cc == 2 || cc == 3 || cc == 4) {
//                continue; // pula pra próxima iteração
//            }
//            
//            if (cc == 7) {
//                break; // sai do laço
//            }
//            
//            System.out.println("Cambalhota " + cc);
//        }

//        do {
//            System.out.println("Cambalhota " + cc);
//            cc++;
//        } while (cc < 4);

        for (int contador = 1; contador <= 100; contador += 10) {
            System.out.println("Cambalhota");
        }
    }
}

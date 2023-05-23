package tiposprimitivos;

import java.util.Scanner;

public class TiposPrimitivos {
    public static void main(String[] args) {
        // Declaração de variáveis de modo simples
        int idade = 20;
        float salario = 100.22f;
        char letra = 'G';
        boolean casado = false;
         
        // Usando typecast
        int quantidade = (int) 20;
        float preco = (float) 100.22;
        char alfa = (char) 'A';
        boolean solteiro = (boolean) false;
        
        // Usando Wrapper Class
        Integer inteiro = new Integer(20);
        Float pontoFlutuante = new Float(100.22);
        Character caractere = new Character('D');
        Boolean booleano = new Boolean(false);
        
        // Manipulação dos tipos
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o nome do aluno: ");
        String nome = teclado.nextLine();
        System.out.print("Digite a nota do aluno: ");
        float nota = teclado.nextFloat();
        System.out.printf("A nota de %s é %.2f \n", nome, nota);
        // System.out.format("A nota de %s é %.2f \n", nome, nota);
    }
}

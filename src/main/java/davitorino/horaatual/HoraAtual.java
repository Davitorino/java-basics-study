package davitorino.horaatual;

import java.util.Date;

public class HoraAtual {
    public static void main(String[] args) {
        Date relogio = new Date();
        
        System.out.print("A hora atual é: ");
        System.out.print(relogio.toString());
    }
}

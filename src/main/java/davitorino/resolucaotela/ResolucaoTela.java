package davitorino.resolucaotela;

import java.awt.Dimension;
import java.awt.Toolkit;

public class ResolucaoTela {
    public static void main(String[] args) {
        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        System.out.print("Sua tela tem resolução ");
        System.out.print(dimension.getWidth());
        System.out.print(" x ");
        System.out.print(dimension.getHeight());
    }
}

package Bucles;
import javax.swing.JOptionPane;
public class bucles {
    public static void main(String[] args) {
        int numero;
        int par=0;
        int i;
        for (i = 0; i < 10; i++) {
            try {
                numero =  Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero: "));
                if (numero%2==0) {
                    par += 1;
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null,"No ingresaste el numero.");
            }
        }
        JOptionPane.showMessageDialog(null,"Haz ingresado "+par+" numeros pares.");
    }

}
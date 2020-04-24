package Bucles;
import javax.swing.JOptionPane;
public class DoWhile {
    public static void main(String[] args) {
        int numero;
        int i=0;
        int suma=0;
        do {
            numero = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un numero: "));
            suma = numero + suma;
            i += 1;
        } while (i<10);
        JOptionPane.showMessageDialog(null,"La suma es  "+suma);
    }

}
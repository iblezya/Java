package Bucles;
import javax.swing.JOptionPane;
public class While {
    public static void main(String[] args) {
        int numero;
        int i=1;
        int suma=0;
        while(i<=10){
            numero = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un numero: "));
            suma = numero+ suma;
            i+=1;
        }
        JOptionPane.showMessageDialog(null,"La suma es  "+suma);
    }

}
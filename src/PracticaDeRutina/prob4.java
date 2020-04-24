package PracticaDeRutina;
/* E S T R U C T U R A S    S E L E C T I V A S
Realice un algoritmo para determinar cuánto se debe pagar por equis cantidad de lápices
considerando que si son 1000 o más el costo es de S/. 3.50; de lo contrario, el precio es de S/.
4.50.
*/
import javax.swing.JOptionPane;
import java.text.DecimalFormat;
public class prob4 {
    public static void main(String[] args) {
        int cantidadLapices;
        float precio;
        DecimalFormat df = new DecimalFormat("#.00");
        JOptionPane.showMessageDialog(null,"Este programa determina cuanto se debe pagar por X cantidad de lápices");
        cantidadLapices = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de lápices"));
        while (cantidadLapices<=0) {
            cantidadLapices = Integer.parseInt(
                JOptionPane.showInputDialog("Debe ingresar un entrada mayor a 0.\nIngrese la cantidad de lápices"));
        }
        if (cantidadLapices>=1000) {
            precio = cantidadLapices*(float)3.5;
        } else {
            precio = cantidadLapices*(float)4.5;
        }
        JOptionPane.showMessageDialog(null,"Se debe pagar por "+cantidadLapices+" lápices: S/. "+df.format(precio));
    }
}
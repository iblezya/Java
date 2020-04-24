package PracticaDeRutina;
/*
E S T R U C T U R A S  S E C U E N C I A L E S 
Un productor de leche lleva el registro de lo que produce en litros, pero cuando entrega le
pagan en galones. Realice un algoritmo que ayude al productor a saber cuánto recibirá por la
entrega de su producción de un día (1 galón = 3.785 litros)
*/
import javax.swing.JOptionPane;
import java.text.DecimalFormat;
public class prob1 {
    public static void main(String[] args) {
        int cantidadLitros;
        float precioGalon,precio;
        JOptionPane.showMessageDialog(null,"Este programa calcula cuanto recibirá un productor de leche por la venta.");
        cantidadLitros = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de litros"));
        while (cantidadLitros<=0) {
            cantidadLitros = Integer.parseInt(
                JOptionPane.showInputDialog("Debe ingresar una cantidad mayor a 0.\nnIngrese la cantidad de litros"));
        }
        precioGalon = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el precio por galon S/.:"));
        while (precioGalon<=0) {
            precioGalon = Float.parseFloat(
                JOptionPane.showInputDialog("Debe ingresar una cantidad mayor a 0.\nIngrese el precio por galon S/.:"));
        }
        double cantidadGalones;
        DecimalFormat df = new DecimalFormat("#.00");
        cantidadGalones=cantidadLitros/3.785;
        precio = (float)cantidadGalones*precioGalon;
        JOptionPane.showMessageDialog(null,"Por "+cantidadLitros+" de litros de leche.\nRecibirá S/. "+df.format(precio));        
    }
}
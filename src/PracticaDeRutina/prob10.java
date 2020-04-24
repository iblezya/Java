package PracticaDeRutina;
/*
Se requiere un algoritmo para determinar, de N cantidades, cuántas son menores o iguales a
cero y cuántas mayores a cero
*/
import javax.swing.JOptionPane;
public class prob10 {
    public static void main(String[] args) {
        int cantidadNumeros;
        float numeros;
        cantidadNumeros = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantida de números"));
        while (cantidadNumeros<=1) {
            cantidadNumeros = Integer.parseInt(
                JOptionPane.showInputDialog("Debe ingresar un entrada mayor a 1.\nIngrese la cantida de números"));
        }
        int contador=0;
        for (int i = 1; i < cantidadNumeros+1; i++) {
            numeros = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el número "+i+" :"));
            if (numeros<=0) {
                contador++;
            }
        }
        JOptionPane.showMessageDialog(null,"Hay "+contador+" números menores o igual a cero."+
            "\nHay "+(cantidadNumeros-contador)+" números mayores a cero.");
    }
}
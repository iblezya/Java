/*
Redacte el planteamiento de 2 casos o problemas, donde se ha de aplicar el uso de
estructuras de control repetitivas. Resuelva y desarrolle los diversos programas que le
han de dar solución a los problemas plateados.
*/
package Tarea01;
/* C A S O   2
Leer una serie de números por teclado hasta ingresar cero para finalizar
el programa indicando cual es el mayor de los números ingresados.
*/
import javax.swing.JOptionPane;
public class java4_1 {
    public static void main(String[] args) {
        int numero,mayor=0,cont=1;
        do {
            numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero "+cont+" :"));
            cont++;
            if (numero>mayor) {
                mayor=numero;
            }
        } while (numero!=0);
        JOptionPane.showMessageDialog(null,"El mayor número es "+mayor);
    }
}
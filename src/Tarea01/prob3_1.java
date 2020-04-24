/*
Redacte el planteamiento de 2 casos o problemas, donde se ha de aplicar estructuras
de control selectivas. Resuelva y desarrolle los diversos programas que le han de dar
solución a los problemas plateados.
*/
package Tarea01;
// C A S O    2
//Escriba un programa que pregunte primero si se quiere calcular el área de un triángulo 
//o la de un círculo. Si se contesta que se quiere calcular el área de un triángulo 
//(escribiendo T o t), el programa tiene que pedir entonces la base y la altura y escribir
// el área. Si se contesta que se quiere calcular el área de un círculo (escribiendo C o c), el 
//programa tiene que pedir entonces el radio y escribir el área.
import javax.swing.JOptionPane;
import java.text.DecimalFormat;
public class prob3_1 {
    public static void main(String[] args) {
        float base,altura,radio,areaCirculo,areaTriangulo;
        byte opcion;
        float pi = (float) 3.1416;
        DecimalFormat df = new DecimalFormat("#.00");
        JOptionPane.showMessageDialog(null,"Cálculo de áreas en m2");
        opcion = Byte.parseByte(JOptionPane.showInputDialog("Elija la opcion.\n1. Circulo\n2. Triángulo"));
        if (opcion == 1) {
            radio = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el radio: "));
            areaCirculo = radio*radio*pi;
            JOptionPane.showMessageDialog(null,"El área del circulo es "+df.format(areaCirculo)+"m2");
        } else if (opcion == 2){
            base = Float.parseFloat(JOptionPane.showInputDialog("Ingrese la base: "));
            altura = Float.parseFloat(JOptionPane.showInputDialog("Ingrese la altura: "));
            areaTriangulo = base*altura/2;
            JOptionPane.showMessageDialog(null,"El área del triángulo es "+df.format(areaTriangulo)+"m2");
        } else {
            JOptionPane.showMessageDialog(null,"Ingrese una opción correcta.");
        }
    }
}
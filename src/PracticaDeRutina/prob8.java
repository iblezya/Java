package PracticaDeRutina;
/*
Se requiere un algoritmo para obtener la edad promedio de un grupo de N alumnos.
*/
import javax.swing.JOptionPane;
import java.text.DecimalFormat;
public class prob8 {
    public static void main(String[] args) {
        int cantidadAlumnos,sumaEdad=0;
        byte edad;
        float promedioEdad;
        DecimalFormat df = new DecimalFormat("#.00");
        cantidadAlumnos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de alumnos:"));
        while (cantidadAlumnos<=1) {
            cantidadAlumnos = Integer.parseInt(
                JOptionPane.showInputDialog("Debe ingresar un entrada mayor a 1.\nIngrese la cantidad de alumnos:"));
        }
        for (int i = 1; i < cantidadAlumnos+1; i++) {
            edad = Byte.parseByte(JOptionPane.showInputDialog("Ingrese la edad del alumno "+i));
            while (edad<=0) {
                edad = Byte.parseByte(JOptionPane.showInputDialog(
                    "Debe ingresar un entrada mayor a 0.\nIngrese la edad del alumno "+i));
            }
            sumaEdad+=edad;
        }
        promedioEdad=(float)sumaEdad/cantidadAlumnos;
        JOptionPane.showMessageDialog(null,"El promedio de edades de "+cantidadAlumnos+" alumnos es "+df.format(promedioEdad));
    }   
}
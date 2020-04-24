/*
Redacte el planteamiento de 2 casos o problemas, donde se ha de aplicar el uso de
estructuras de control repetitivas. Resuelva y desarrolle los diversos programas que le
han de dar solución a los problemas plateados.
*/
package Tarea01;
// C A S O    1 
/*
Programa que permite calcular el promedio ponderado de un alumno para "n" cursos con su respectivo
credito o pesos correspondiente. Se debe solicitar apellidos y nombres, nombre de curso, su credito,
su nota.Finalizar con la impresion de todos los datos del alumno con el promedio final.
*/
import javax.swing.JOptionPane;
import java.text.DecimalFormat;
public class prob4 {
    public static void main(String[] args) {
        byte credito,numeroCursos;
        String apellidos,nombres,curso;
        float notaCurso,promedioFinal;        
        String cnc ="";//Curso, Nota, Credito\n        
        DecimalFormat df = new DecimalFormat("#.00");
        JOptionPane.showMessageDialog(null,"Programa para calcular el promedio ponderado.");
        apellidos = JOptionPane.showInputDialog("Ingrese sus apellidos: ").toUpperCase();
        nombres = JOptionPane.showInputDialog("Ingrese sus nombres: ").toUpperCase();
        numeroCursos = Byte.parseByte(JOptionPane.showInputDialog("Ingrese el numero de cursos: "));
        while (numeroCursos<=1) {
            numeroCursos = Byte.parseByte(
                JOptionPane.showInputDialog("Debe ingresar como mínimo 2 cursos.\nIngrese el numero de cursos: "));
        }
        float sumaPonderada=0,sumaCreditos=0;// Sumatoria de Notas*Credito && Sumatoria de creditos    
        boolean correctoCurso,correctoCredito;    
        for (byte i = 0; i < numeroCursos; i++) {
            curso = JOptionPane.showInputDialog("Ingrese el nombre del curso "+(i+1));
            notaCurso = Float.parseFloat(JOptionPane.showInputDialog("Ingrese la nota del curso "+(i+1)));
            correctoCurso=false;
            correctoCredito=false;
            while (correctoCurso==false) {
                if (notaCurso<=20 && notaCurso>=0) {
                    correctoCurso=true;                
                } else {                    
                    notaCurso = Float.parseFloat(
                        JOptionPane.showInputDialog("Debe ingresar una nota de 0 a 20.\nIngrese la nota del curso "+(i+1)));
                }
            }
            credito = Byte.parseByte(JOptionPane.showInputDialog("Ingrese el credito del curso "+(i+1)));
            while (correctoCredito==false)  {
                if (credito<=6 && credito>=0) {
                    correctoCredito=true;
                } else {
                    credito = Byte.parseByte(
                        JOptionPane.showInputDialog("Debe ingresar un credito de 0 a 6.\nIngrese el credito del curso "+(i+1)));
                }                
            }            
            sumaPonderada += notaCurso*credito;
            sumaCreditos += credito;
            cnc += "Curso "+(i+1)+": "+curso+"  ";
            cnc += "Nota: "+notaCurso+"  ";
            cnc += "Credito: "+credito+"\n";            
        }
        promedioFinal = sumaPonderada/sumaCreditos;
        JOptionPane.showMessageDialog(null,"Alumno: "+apellidos+", "+nombres+"\nNúmero de cursos: "+numeroCursos+
        "\n"+cnc+"El promedio final es: "+df.format(promedioFinal));        
    }
}
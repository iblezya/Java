/*
Redacte el planteamiento de 2 casos o problemas, donde se ha de aplicar estructuras
de control selectivas. Resuelva y desarrolle los diversos programas que le han de dar
solución a los problemas plateados.
*/
package Tarea01;
// 1er CASO
//Progama para calcular el producto escalar  y la suma, resta y producto vectorial en un 
//espacio vectorial R2.
import java.text.DecimalFormat;
import javax.swing.JOptionPane;
public class prob3 {
    public static void main(final String[] args) {
        byte opcion;
        float vector_X1, vector_Y1,vector_X2,vector_Y2;
        float sumaVectorial_X,restaVectorial_X,productoEscalar,productoVecotial;
        float sumaVectorial_Y,restaVectorial_Y;
        boolean correcto;        
        JOptionPane.showMessageDialog(null,"Calculadora vectorial R2\nElija una opción:\n"+
        "0. Cerrar el programa\n1. Suma vectorial\n2. Resta Vectorial\n3. Producto escalar\n4. Producto vectorial");
        correcto=false;
        while (correcto==false) {            
            opcion = Byte.parseByte(JOptionPane.showInputDialog("Ingrese una opción:"));
            if (opcion==0){
                correcto=true;
            } else if (opcion>0 && opcion<5) {    
                final DecimalFormat df = new DecimalFormat("#.000");
                vector_X1 = Float.parseFloat(JOptionPane.showInputDialog("Ingrese la componente X1 del vector: "));
                vector_Y1 = Float.parseFloat(JOptionPane.showInputDialog("Ingrese la componente Y1 del vector: "));
                vector_X2 = Float.parseFloat(JOptionPane.showInputDialog("Ingrese la componente X2 del vector: "));
                vector_Y2 = Float.parseFloat(JOptionPane.showInputDialog("Ingrese la componente Y2 del vector: "));
                JOptionPane.showMessageDialog(null,"Los vectores introducidos son:\n"+
                df.format(vector_X1)+"i + "+df.format(vector_Y1)+"j\n"+df.format(vector_X2)+"i + "+df.format(vector_Y2)+"j");       
                switch (opcion) {
                    case 1:
                        sumaVectorial_X = vector_X1 + vector_X2;
                        sumaVectorial_Y = vector_Y1 + vector_Y2;
                        JOptionPane.showMessageDialog(null,"La suma vectorial es: "+
                        df.format(sumaVectorial_X)+"i + "+df.format(sumaVectorial_Y)+"j");
                        break;
                    case 2:
                        restaVectorial_X = vector_X1 - vector_X2;
                        restaVectorial_Y = vector_Y1 - vector_Y2;
                        JOptionPane.showMessageDialog(null,"La suma vectorial es: "+
                        df.format(restaVectorial_X)+"i + "+df.format(restaVectorial_Y)+"j");
                        break;
                    case 3:
                        productoEscalar = vector_X1*vector_X2 + vector_Y1*vector_Y2;
                        JOptionPane.showMessageDialog(null,"El producto esclar es: "+df.format(productoEscalar));
                        break;
                    case 4:
                        productoVecotial = vector_X1*vector_Y2-vector_Y1*vector_X2;
                        JOptionPane.showMessageDialog(null,"El producto vectorial es: "+df.format(productoVecotial)+"k");
                        break;
                }                
                correcto = true;
                break;
            } else {
                JOptionPane.showMessageDialog(null,"Ingrese una opción de 0 a 4.");
                correcto=false;
            }            
        }    
    }
}
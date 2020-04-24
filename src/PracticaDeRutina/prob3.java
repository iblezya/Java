package PracticaDeRutina;
/*
Una modista, para realizar sus prendas de vestir, encarga las telas al extranjero. Para cada
pedido, tiene que proporcionar las medidas de la tela en pulgadas, pero ella generalmente las
tiene en metros. Realice un algoritmo para ayudar a resolver el problema, determinando
cuántas pulgadas debe pedir con base en los metros que requiere. (1 pulgada = 0.0254 m)
*/
import javax.swing.JOptionPane;
import java.text.DecimalFormat;
public class prob3 {
    public static void main(String[] args) {        
        float metros;
        double pulgadas;
        JOptionPane.showMessageDialog(null,"Este programa convierte metros a pulgadas.");
        metros = Float.parseFloat(JOptionPane.showInputDialog("Ingrese la tela en metros :"));
        while (metros<=0) {
            metros = Float.parseFloat(
                JOptionPane.showInputDialog("Debe ingresar un entrada mayor a 0.\nIngrese la tela en metros :"));
        }
        DecimalFormat df = new DecimalFormat("#.000");
        pulgadas = metros/0.0254;
        JOptionPane.showMessageDialog(null,"La tela en pulgadas es "+df.format(pulgadas));
    }
}
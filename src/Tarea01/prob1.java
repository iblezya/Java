/*Resto Bar “Solitario” desea implementar una aplicación para generar la boleta por
consumo de un cliente. La aplicación debe solicitar al cliente Nombre, Producto a
Consumir y Cantidad. Además la aplicación debe permitir el ingreso del precio del
producto. Se calculara el subtotal, el IGV y el monto a pagar.
*/
package Tarea01;
import javax.swing.JOptionPane;
import java.text.DecimalFormat;
public class prob1 {
    public static void main(String[] args) {
        String nombre,producto;
        byte cantidad;
        float precio;
        double monto,igv,subtotal;        
        JOptionPane.showMessageDialog(null,"Bienbenido al Resto Bar \"Solitario\"");
        nombre = JOptionPane.showInputDialog("Ingrese su nombre: ");
        producto = JOptionPane.showInputDialog("Ingrese el producto que desea consumir: ");
        cantidad = Byte.parseByte(JOptionPane.showInputDialog("Ingrese la cantidad:"));
        while (cantidad<=0) {
            cantidad = Byte.parseByte(JOptionPane.showInputDialog("Ingrese la cantidad:"));
        }
        precio = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el precio:"));
        while (precio<=0) {
            precio = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el precio:"));
        }
        DecimalFormat df = new DecimalFormat("#.00");
        subtotal = precio*cantidad;
        igv = 0.18*subtotal;
        monto = subtotal+igv;        
        JOptionPane.showMessageDialog(null,"Hola "+nombre+", usted ordeno "+producto+
        " con una cantidad de "+cantidad+".\nEl monto a pagar es S/. "+df.format(monto)+
        "\nEl subtotal es S/. "+df.format(subtotal)+"\nEl IGV es S/. "+df.format(igv));    
    }
}
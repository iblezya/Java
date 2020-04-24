package PracticaDeRutina;
/*
Una compañía de viajes cuenta con tres tipos de autobuses (A, B y C), cada uno tiene un precio
por kilómetro recorrido por persona, los costos respectivos son S/. 2.00, S/. 2.50 y S/. 3.00. Se
requiere determinar el costo total y por persona del viaje considerando que cuando éste se
presupuesta debe haber un mínimo de 20 personas, de lo contrario el cobro se realiza con
base en este número límite.
*/
import javax.swing.JOptionPane;
import java.text.DecimalFormat;
public class prob5 {
    public static void main(String[] args) {
        byte personas;
        char tipoDeAutobus;
        float c=0,costoTotal;//costos respectivos son S/. 2.00, S/. 2.50 y S/. 3.00
        JOptionPane.showMessageDialog(null,"Costo de viajes por kilómetro de una compañía de viajes.");
        DecimalFormat df = new DecimalFormat("#.00");
        personas = Byte.parseByte(JOptionPane.showInputDialog("Ingrese el número de personas:"));
        while (personas<=0) {
            personas = Byte.parseByte(
                JOptionPane.showInputDialog("Debe ingresar un entrada mayor a 0.\nIngrese el número de personas:"));
        }
        tipoDeAutobus = JOptionPane.showInputDialog("Ingrese el tipo de autobus\nA, B o C : ").charAt(0);
        if (tipoDeAutobus=='A') {
            c=(float)2.0;            
        } else if (tipoDeAutobus=='B') {
            c=(float)2.5;            
        } else if (tipoDeAutobus=='C') {
            c=(float)3.0;
        } else {
            JOptionPane.showMessageDialog(null,"Debe ingresar un opción valida");
        }
        if (personas<20) {
            costoTotal = c*20;        
        } else {
            costoTotal = c*personas;            
        }
        JOptionPane.showMessageDialog(null,"El costo por por kilómetro es S/. "+c+
        "\nEl costo total es S/. "+df.format(costoTotal));
    }
}
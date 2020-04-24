package PracticaDeRutina;
/*
El consultorio del Dr. Lorenzo T. Mata Lozano tiene como política cobrar la consulta con base
en el número de cita, de la siguiente forma:
o Las tres primeras citas a S/. 80.00 c/u.
o Las siguientes dos citas a S/. 60.00 c/u.
o Las tres siguientes citas a S/. 40.00 c/u.
o Las restantes a S/. 30.00 c/u, mientras dure el tratamiento.
Se requiere un algoritmo para determinar:
a) Cuánto pagará el paciente por la cita.
b) El monto de lo que ha pagado el paciente por el tratamiento.
*/
import javax.swing.JOptionPane;
public class prob7 {
    public static void main(String[] args) {
        byte numeroCitas;
        float monto;
        JOptionPane.showMessageDialog(null,"Consultorio del Dr. Lorenzo T. Mata Lozano\nPrograma de cobranza.");
        numeroCitas = Byte.parseByte(JOptionPane.showInputDialog("Ingrese el número de citas que tendra su tratamiento:"));
        while (numeroCitas<=0) {
            numeroCitas = Byte.parseByte(
                JOptionPane.showInputDialog("Debe ingresar un entrada mayor a 0."+
                "\nIngrese el número de citas que tendra su tratamiento:"));
        }
        if (numeroCitas<=3 && numeroCitas>0) {
            monto = (float)80.00*numeroCitas;
            JOptionPane.showMessageDialog(null,"Uste pagara S/. 80.00 por "+numeroCitas+" cita(s) c/u."+
            "\nEl monto a pagar es S/. "+monto);
        } else if (numeroCitas<=5 && numeroCitas>3) {
            monto = (float)80.00*3+(float)60.00*(numeroCitas-3);
            JOptionPane.showMessageDialog(null,"Uste pagara S/. 80.00 por 3 citas c/u y "+
                "S/. 60.00 por "+(numeroCitas-3)+" cita(s) c/u.\nEl monto a pagar es S/. "+monto);
        } else if (numeroCitas<=8 && numeroCitas>5) {
            monto = (float)80.00*3+(float)60.00*2+(float)40.00*(numeroCitas-5);
            JOptionPane.showMessageDialog(null,"Uste pagara S/. 80.00 por 3 citas c/u, "+
                "S/. 60.00 por 2 citas c/u y S/. 40.00 por"+(numeroCitas-5)+" cita(s) c/u.\nEl monto a pagar es S/. "+monto);
        } else if (numeroCitas>8) {
            monto = (float)80.00*3+(float)60.00*2+(float)40.00*3+(float)30.00*(numeroCitas-8);
            JOptionPane.showMessageDialog(null,"Uste pagara S/. 80.00 por 3 citas c/u, "+
                "S/. 60.00 por 2 citas c/u, S/. 40.00 por 3 citas c/u y S/. 30.00 por "+
                (numeroCitas-8)+" cita(s) c/u.\nEl monto a pagar es S/. "+monto);
        }
    }
}
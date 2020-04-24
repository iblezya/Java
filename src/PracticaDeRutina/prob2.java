package PracticaDeRutina;
/*
Se requiere determinar el sueldo semanal de un trabajador con base en las horas que trabaja
y el pago por hora que recibe.
*/
import javax.swing.JOptionPane;
import java.text.DecimalFormat;
public class prob2 {
    public static void main(String[] args) {
        float sueldoSemanal,pagoPorHora;
        byte horasTrabajo;
        DecimalFormat df = new DecimalFormat("#.00");
        JOptionPane.showMessageDialog(null,"Este programa determina el sueldo semanal de un trabajador.");
        horasTrabajo = Byte.parseByte(JOptionPane.showInputDialog("Ingrese las horas de trabajo :"));
        while (horasTrabajo<=0) {
            horasTrabajo = Byte.parseByte(
            JOptionPane.showInputDialog("Debe ingresar un entrada mayor a 0.\nIngrese las horas de trabajo"));
        }
        pagoPorHora = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el pago por hora trabajada S/. :"));
        while (pagoPorHora<=0) {
            pagoPorHora = Float.parseFloat(
                JOptionPane.showInputDialog("Debe ingresar un entrada mayor a 0.\nIngrese el pago por hora trabajada S/. :"));
        }
        sueldoSemanal = horasTrabajo*pagoPorHora;
        JOptionPane.showMessageDialog(null,"El trabajador recibe un pago semanal de S/."+df.format(sueldoSemanal));
    }
}
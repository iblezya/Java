/*
Molinos COMOLSA, desea implementar una aplicación que permita gestionar la boleta
de pago del trabajador. La aplicación debe solicitar los siguientes datos: Apellidos,
Nombres, Estado Civil, Cantidad de Horas trabajadas, valor de hora.
•Calcule y muestre el Sueldo Bruto
•Calcule y muestre los descuentos de ley por aporte al SNP que es el 13% del
sueldo bruto.
•Se debe Calcular y mostrar la bonificación familiar que representa el 7% del
sueldo bruto sólo bajo la única condición del estado civil del trabajador es
“CASADO”.
•Calcule y muestre el Sueldo neto a pagar

 */
package Tarea01;
import javax.swing.JOptionPane;
import java.text.DecimalFormat;
public class prob2 {
    public static void main(String[] args) {
        String nombres,apellidos,estadoCivil;
        byte cantHorasTrabajadas;
        float valorHora,sueldoBruto=0,descuentosLey,bonificacionFamiliar,sueldoNeto;
        DecimalFormat df = new DecimalFormat("#.00");
        JOptionPane.showMessageDialog(null,"Molino COMOLSA\nPrograma de boletas para trabajadores.");
        apellidos = JOptionPane.showInputDialog("Ingrese sus apellidos: ").toUpperCase();
        nombres = JOptionPane.showInputDialog("Ingrese sus nombres: ").toUpperCase();
        estadoCivil = JOptionPane.showInputDialog("Ingrese su estado civil: ").toUpperCase();
        cantHorasTrabajadas = Byte.parseByte(JOptionPane.showInputDialog("Ingrese la cantidad de horas trabajadas: "));
        while (cantHorasTrabajadas<=0) {
            cantHorasTrabajadas = Byte.parseByte(JOptionPane.showInputDialog("Ingrese la cantidad de horas trabajadas: "));
        }
        valorHora = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el valor de hora trabajada: "));
        while (valorHora<=0) {
            valorHora = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el valor de hora trabajada: "));
        }
        sueldoBruto = cantHorasTrabajadas*valorHora;
        descuentosLey = (float)0.13*sueldoBruto;
        sueldoNeto = sueldoBruto-descuentosLey;        
        switch (estadoCivil) {
            case "CASADO":
                bonificacionFamiliar = (float)0.07*sueldoBruto;
                sueldoNeto += bonificacionFamiliar;
                JOptionPane.showMessageDialog(null,"Trabajador: "+apellidos+", "+nombres+"\nEstado civil: "+estadoCivil+
                "\nSueldo bruto: S/. "+df.format(sueldoBruto)+"\nDescuento de ley por aporte al SNP: S/. "+df.format(descuentosLey)+
                "\nBonificación familiar: S/. "+df.format(bonificacionFamiliar)+"\nSueldo Neto: S/. "+df.format(sueldoNeto));
                break;
            case "CASADA":
                bonificacionFamiliar = (float)0.07*sueldoBruto;
                sueldoNeto += bonificacionFamiliar;
                JOptionPane.showMessageDialog(null,"Trabajador: "+apellidos+", "+nombres+"\nEstado civil: "+estadoCivil+
                "\nSueldo bruto: S/. "+df.format(sueldoBruto)+"\nDescuento de ley por aporte al SNP: S/. "+df.format(descuentosLey)+
                "\nBonificación familiar: S/. "+df.format(bonificacionFamiliar)+"\nSueldo Neto: S/. "+df.format(sueldoNeto));
                break;
            default:                
                JOptionPane.showMessageDialog(null,"Trabajador: "+apellidos+", "+nombres+"\nEstado civil: "+estadoCivil+
                "\nSueldo bruto: S/. "+df.format(sueldoBruto)+"\nDescuento de ley por aporte al SNP: S/. "+df.format(descuentosLey)+
                "\nSueldo Neto: S/. "+df.format(sueldoNeto));
                break;
        }
    }
}
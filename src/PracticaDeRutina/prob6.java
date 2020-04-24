package PracticaDeRutina;
/*
“El náufrago satisfecho” ofrece hamburguesas sencillas, dobles y triples, las cuales tienen un
costo de S/. 20.00, S/. 25.00 y S/. 28.00 respectivamente. La empresa acepta tarjetas de
crédito con un cargo de 5 % sobre la compra. Suponiendo que los clientes adquieren sólo un
tipo de hamburguesa, realice un algoritmo para determinar cuánto debe pagar una persona
por N hamburguesas
*/
import javax.swing.JOptionPane;
import java.text.DecimalFormat;
public class prob6 {
    public static void main(String[] args) {
        byte cantidadHamburguesas,costoHamb=0;
        char tipoDeHamburguesa,tipoDePago=' ';
        float pago=0;
        JOptionPane.showMessageDialog(null,"“El náufrago satisfecho” ofrece hamburguesas"+
        "sencillas, dobles y triples, las cuales tienen un costo de S/. 20.00, S/. 25.00 y S/. 28.00.");
        cantidadHamburguesas = Byte.parseByte(JOptionPane.showInputDialog("Ingrese la cantidad de hamburguesas:"));
        while (cantidadHamburguesas<=0) {
            cantidadHamburguesas = Byte.parseByte(
                JOptionPane.showInputDialog("Debe ingresar un entrada mayor a 0.\nIngrese la cantidad de hamburguesas:"));
        }
        tipoDeHamburguesa = JOptionPane.showInputDialog("Ingrese la opcion para el tipo de hamburguesa."+
            "\nA. Sencilla.\nB. Doble.\nC. Triple.").charAt(0);
        DecimalFormat df = new DecimalFormat("#.00");
        switch (tipoDeHamburguesa) {
            case 'A':
                tipoDePago = JOptionPane.showInputDialog("Ingrese la opcion para el tipo de pago."+
                    "\nA. Pago efectivo.\nB. Pago con tarjeta de crédito.").charAt(0);
                costoHamb=20;
                break;
            case 'B':
                tipoDePago = JOptionPane.showInputDialog("Ingrese la opcion para el tipo de pago."+
                    "\nA. Pago efectivo.\nB. Pago con tarjeta de crédito.").charAt(0);
                costoHamb=25;
                break;
            case 'C':
                tipoDePago = JOptionPane.showInputDialog("Ingrese la opcion para el tipo de pago."+
                    "\nA. Pago efectivo.\nB. Pago con tarjeta de crédito.").charAt(0);
                costoHamb=28;
                break;
            default:
                JOptionPane.showMessageDialog(null,"Ingrese una opcion válida.");
                break;
        }
        if (tipoDePago=='A') {
            pago = cantidadHamburguesas*costoHamb;
        } else if (tipoDePago=='B') {
            pago = cantidadHamburguesas*costoHamb*(float)1.05;
        }
        if (tipoDeHamburguesa!='A'&&tipoDeHamburguesa!='B'&&tipoDeHamburguesa!='C'){            
        } else if (tipoDePago!='A'&&tipoDePago!='B'){
            JOptionPane.showMessageDialog(null,"Ingrese una opcion válida.");
        } else {
            JOptionPane.showMessageDialog(null,"Usted debe pagar por "+cantidadHamburguesas+" hamburguesas"+
                    ": S/. "+df.format(pago));
        }        
    }
}
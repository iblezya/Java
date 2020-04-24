package PracticaDeRutina;
/*
Se requiere un algoritmo para determinar cuánto ahorrará una persona en un año, si al final
de cada mes deposita variables cantidades de dinero; además, se requiere saber cuánto lleva
ahorrado cada mes
*/
import javax.swing.JOptionPane;
import java.text.DecimalFormat;
public class prob9 {
    public static void main(String[] args) {        
        byte numeroDepositos;
        float ahorroActual,depositoE1,depositoF2,depositoM3,depositoA4,depositoM5,depositoJ6;
        float ahorroFinal,depositoJ7,depositoA8,depositoS9,depositoO10,depositoN11,depositoD12;
        float ahorroE1=0,ahorroF2=0,ahorroM3=0,ahorroA4=0,ahorroM5=0,ahorroJ6=0,ahorroJ7=0;
        float ahorroA8=0,ahorroS9=0,ahorroO10=0,ahorroN11=0,ahorroD12=0;
        String mesActual="A",opcionSeguir;
        boolean correcto=false;
        JOptionPane.showMessageDialog(null,"Este programa determina el ahorro acumulado por mes.");
        ahorroActual = Float.parseFloat(JOptionPane.showInputDialog("Ingrese su ahorro actual: "));
        while (ahorroActual<=0) {
            ahorroActual = Float.parseFloat(
                JOptionPane.showInputDialog("Debe ingresar un entrada mayor a 0.\nIngrese su ahorro actual: "));
        }
        DecimalFormat df = new DecimalFormat("#.00");        
        while (correcto==false) {
            mesActual = JOptionPane.showInputDialog("Ingrese el mes actual: ").toUpperCase();
            switch (mesActual) {
                case "ENERO":
                    numeroDepositos = Byte.parseByte(JOptionPane.showInputDialog("Ingrese el número de depositos: "));
                    while (numeroDepositos<=0) {
                        numeroDepositos = Byte.parseByte(
                            JOptionPane.showInputDialog("Debe ingresar un entrada mayor a 0.\nIngrese el número de depositos: "));
                    }
                    for (int i = 0; i < numeroDepositos; i++) {
                        depositoE1 = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el deposito "+(i+1)));
                        while (depositoE1<=0) {
                            depositoE1 = Float.parseFloat(
                                JOptionPane.showInputDialog("Debe ingresar un entrada mayor a 0.\nIngrese el deposito "+(i+1)));
                        }
                        ahorroE1+=depositoE1;
                    }
                    opcionSeguir = JOptionPane.showInputDialog("El ahorro total de enero es: S/. "+df.format(ahorroE1)+
                        "\nSi desea seguir ahorrando ingrese \"S\""+
                        "y cualquier valor para finalizar.");
                    switch (opcionSeguir) {
                        case "S":
                            correcto=false;
                            break;
                    
                        default:
                            correcto=true;
                            break;
                    }
                    break;
                case "FEBRERO":
                    numeroDepositos = Byte.parseByte(JOptionPane.showInputDialog("Ingrese el número de depositos: "));
                    while (numeroDepositos<=0) {
                        numeroDepositos = Byte.parseByte(
                            JOptionPane.showInputDialog("Debe ingresar un entrada mayor a 0.\nIngrese el número de depositos: "));
                    }
                    for (int i = 0; i < numeroDepositos; i++) {
                        depositoF2 = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el deposito "+(i+1)));
                        while (depositoF2<=0) {
                            depositoF2 = Float.parseFloat(
                                JOptionPane.showInputDialog("Debe ingresar un entrada mayor a 0.\nIngrese el deposito "+(i+1)));
                        }
                        ahorroF2+=depositoF2;
                    }
                    opcionSeguir = JOptionPane.showInputDialog("El ahorro total de febrero es: S/. "+df.format(ahorroF2)+
                        "\nSi desea seguir ahorrando ingrese \"S\""+
                        "y cualquier valor para finalizar.");
                    switch (opcionSeguir) {
                        case "S":
                            correcto=false;
                            break;
                    
                        default:
                            correcto=true;
                            break;
                    }
                    break;
                case "MARZO":
                    numeroDepositos = Byte.parseByte(JOptionPane.showInputDialog("Ingrese el número de depositos: "));
                    while (numeroDepositos<=0) {
                        numeroDepositos = Byte.parseByte(
                            JOptionPane.showInputDialog("Debe ingresar un entrada mayor a 0.\nIngrese el número de depositos: "));
                    }
                    for (int i = 0; i < numeroDepositos; i++) {
                        depositoM3 = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el deposito "+(i+1)));
                        while (depositoM3<=0) {
                            depositoM3 = Float.parseFloat(
                                JOptionPane.showInputDialog("Debe ingresar un entrada mayor a 0.\nIngrese el deposito "+(i+1)));
                        }
                        ahorroM3+=depositoM3;
                    }
                    opcionSeguir = JOptionPane.showInputDialog("El ahorro total de marzo es: S/. "+df.format(ahorroM3)+
                        "\nSi desea seguir ahorrando ingrese \"S\""+
                        "y cualquier valor para finalizar.");
                    switch (opcionSeguir) {
                        case "S":
                            correcto=false;
                            break;
                    
                        default:
                            correcto=true;
                            break;
                    }
                    break;
                case "ABRIL":
                    numeroDepositos = Byte.parseByte(JOptionPane.showInputDialog("Ingrese el número de depositos: "));
                    while (numeroDepositos<=0) {
                        numeroDepositos = Byte.parseByte(
                            JOptionPane.showInputDialog("Debe ingresar un entrada mayor a 0.\nIngrese el número de depositos: "));
                    }
                    for (int i = 0; i < numeroDepositos; i++) {
                        depositoA4 = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el deposito "+(i+1)));
                        while (depositoA4<=0) {
                            depositoA4 = Float.parseFloat(
                                JOptionPane.showInputDialog("Debe ingresar un entrada mayor a 0.\nIngrese el deposito "+(i+1)));
                        }
                        ahorroA4+=depositoA4;
                    }
                    opcionSeguir = JOptionPane.showInputDialog("El ahorro total de abril es: S/. "+df.format(ahorroA4)+
                        "\nSi desea seguir ahorrando ingrese \"S\""+
                        "y cualquier valor para finalizar.");
                    switch (opcionSeguir) {
                        case "S":
                            correcto=false;
                            break;
                    
                        default:
                            correcto=true;
                            break;
                    }
                    break;
                case "MAYO":
                    numeroDepositos = Byte.parseByte(JOptionPane.showInputDialog("Ingrese el número de depositos: "));
                    while (numeroDepositos<=0) {
                        numeroDepositos = Byte.parseByte(
                            JOptionPane.showInputDialog("Debe ingresar un entrada mayor a 0.\nIngrese el número de depositos: "));
                    }
                    for (int i = 0; i < numeroDepositos; i++) {
                        depositoM5 = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el deposito "+(i+1)));
                        while (depositoM5<=0) {
                            depositoM5 = Float.parseFloat(
                                JOptionPane.showInputDialog("Debe ingresar un entrada mayor a 0.\nIngrese el deposito "+(i+1)));
                        }
                        ahorroM5+=depositoM5;
                    }
                    opcionSeguir = JOptionPane.showInputDialog("El ahorro total de mayo es: S/. "+df.format(ahorroM5)+
                        "\nSi desea seguir ahorrando ingrese \"S\""+
                        "y cualquier valor para finalizar.");
                    switch (opcionSeguir) {
                        case "S":
                            correcto=false;
                            break;
                    
                        default:
                            correcto=true;
                            break;
                    }
                    break;
                case "JUNIO":
                    numeroDepositos = Byte.parseByte(JOptionPane.showInputDialog("Ingrese el número de depositos: "));
                    while (numeroDepositos<=0) {
                        numeroDepositos = Byte.parseByte(
                            JOptionPane.showInputDialog("Debe ingresar un entrada mayor a 0.\nIngrese el número de depositos: "));
                    }
                    for (int i = 0; i < numeroDepositos; i++) {
                        depositoJ6 = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el deposito "+(i+1)));
                        while (depositoJ6<=0) {
                            depositoJ6 = Float.parseFloat(
                                JOptionPane.showInputDialog("Debe ingresar un entrada mayor a 0.\nIngrese el deposito "+(i+1)));
                        }
                        ahorroJ6+=depositoJ6;
                    }
                    opcionSeguir = JOptionPane.showInputDialog("El ahorro total de junio es: S/. "+df.format(ahorroJ6)+
                        "\nSi desea seguir ahorrando ingrese \"S\""+
                        "y cualquier valor para finalizar.");
                    switch (opcionSeguir) {
                        case "S":
                            correcto=false;
                            break;
                    
                        default:
                            correcto=true;
                            break;
                    }
                    break;
                case "JULIO":
                    numeroDepositos = Byte.parseByte(JOptionPane.showInputDialog("Ingrese el número de depositos: "));
                    while (numeroDepositos<=0) {
                        numeroDepositos = Byte.parseByte(
                            JOptionPane.showInputDialog("Debe ingresar un entrada mayor a 0.\nIngrese el número de depositos: "));
                    }
                    for (int i = 0; i < numeroDepositos; i++) {
                        depositoJ7 = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el deposito "+(i+1)));
                        while (depositoJ7<=0) {
                            depositoJ7 = Float.parseFloat(
                                JOptionPane.showInputDialog("Debe ingresar un entrada mayor a 0.\nIngrese el deposito "+(i+1)));
                        }
                        ahorroJ7+=depositoJ7;
                    }
                    opcionSeguir = JOptionPane.showInputDialog("El ahorro total de julio es: S/. "+df.format(ahorroJ7)+
                        "\nSi desea seguir ahorrando ingrese \"S\""+
                        "y cualquier valor para finalizar.");
                    switch (opcionSeguir) {
                        case "S":
                            correcto=false;
                            break;
                    
                        default:
                            correcto=true;
                            break;
                    }
                    break;
                case "AGOSTO":
                    numeroDepositos = Byte.parseByte(JOptionPane.showInputDialog("Ingrese el número de depositos: "));
                    while (numeroDepositos<=0) {
                        numeroDepositos = Byte.parseByte(
                            JOptionPane.showInputDialog("Debe ingresar un entrada mayor a 0.\nIngrese el número de depositos: "));
                    }
                    for (int i = 0; i < numeroDepositos; i++) {
                        depositoA8 = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el deposito "+(i+1)));
                        while (depositoA8<=0) {
                            depositoA8 = Float.parseFloat(
                                JOptionPane.showInputDialog("Debe ingresar un entrada mayor a 0.\nIngrese el deposito "+(i+1)));
                        }
                        ahorroA8+=depositoA8;
                    }
                    opcionSeguir = JOptionPane.showInputDialog("El ahorro total de agosto es: S/. "+df.format(ahorroA8)+
                        "\nSi desea seguir ahorrando ingrese \"S\""+
                        "y cualquier valor para finalizar.");
                    switch (opcionSeguir) {
                        case "S":
                            correcto=false;
                            break;
                    
                        default:
                            correcto=true;
                            break;
                    }
                    break;
                case "SEPTIEMBRE":
                    numeroDepositos = Byte.parseByte(JOptionPane.showInputDialog("Ingrese el número de depositos: "));
                    while (numeroDepositos<=0) {
                        numeroDepositos = Byte.parseByte(
                            JOptionPane.showInputDialog("Debe ingresar un entrada mayor a 0.\nIngrese el número de depositos: "));
                    }
                    for (int i = 0; i < numeroDepositos; i++) {
                        depositoS9 = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el deposito "+(i+1)));
                        while (depositoS9<=0) {
                            depositoS9 = Float.parseFloat(
                                JOptionPane.showInputDialog("Debe ingresar un entrada mayor a 0.\nIngrese el deposito "+(i+1)));
                        }
                        ahorroS9+=depositoS9;
                    }
                    opcionSeguir = JOptionPane.showInputDialog("El ahorro total de septiembre es: S/. "+df.format(ahorroS9)+
                        "\nSi desea seguir ahorrando ingrese \"S\""+
                        "y cualquier valor para finalizar.");
                    switch (opcionSeguir) {
                        case "S":
                            correcto=false;
                            break;
                    
                        default:
                            correcto=true;
                            break;
                    }
                    break;
                case "OCTUBRE":
                    numeroDepositos = Byte.parseByte(JOptionPane.showInputDialog("Ingrese el número de depositos: "));
                    while (numeroDepositos<=0) {
                        numeroDepositos = Byte.parseByte(
                            JOptionPane.showInputDialog("Debe ingresar un entrada mayor a 0.\nIngrese el número de depositos: "));
                    }
                    for (int i = 0; i < numeroDepositos; i++) {
                        depositoO10 = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el deposito "+(i+1)));
                        while (depositoO10<=0) {
                            depositoO10 = Float.parseFloat(
                                JOptionPane.showInputDialog("Debe ingresar un entrada mayor a 0.\nIngrese el deposito "+(i+1)));
                        }
                        ahorroO10+=depositoO10;
                    }
                    opcionSeguir = JOptionPane.showInputDialog("El ahorro total de octubre es: S/. "+df.format(ahorroO10)+
                        "\nSi desea seguir ahorrando ingrese \"S\""+
                        "y cualquier valor para finalizar.");
                    switch (opcionSeguir) {
                        case "S":
                            correcto=false;
                            break;
                    
                        default:
                            correcto=true;
                            break;
                    }
                    break;
                case "NOVIEMBRE":
                    numeroDepositos = Byte.parseByte(JOptionPane.showInputDialog("Ingrese el número de depositos: "));
                    while (numeroDepositos<=0) {
                        numeroDepositos = Byte.parseByte(
                            JOptionPane.showInputDialog("Debe ingresar un entrada mayor a 0.\nIngrese el número de depositos: "));
                    }
                    for (int i = 0; i < numeroDepositos; i++) {
                        depositoN11 = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el deposito "+(i+1)));
                        while (depositoN11<=0) {
                            depositoN11 = Float.parseFloat(
                                JOptionPane.showInputDialog("Debe ingresar un entrada mayor a 0.\nIngrese el deposito "+(i+1)));
                        }
                        ahorroN11+=depositoN11;
                    }
                    opcionSeguir = JOptionPane.showInputDialog("El ahorro total de noviembre es: S/. "+df.format(ahorroN11)+
                        "\nSi desea seguir ahorrando ingrese \"S\""+
                        "y cualquier valor para finalizar.");
                    switch (opcionSeguir) {
                        case "S":
                            correcto=false;
                            break;
                    
                        default:
                            correcto=true;
                            break;
                    }
                    break;
                case "DICIEMBRE":
                    numeroDepositos = Byte.parseByte(JOptionPane.showInputDialog("Ingrese el número de depositos: "));
                    while (numeroDepositos<=0) {
                        numeroDepositos = Byte.parseByte(
                            JOptionPane.showInputDialog("Debe ingresar un entrada mayor a 0.\nIngrese el número de depositos: "));
                    }
                    for (int i = 0; i < numeroDepositos; i++) {
                        depositoD12 = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el deposito "+(i+1)));
                        while (depositoD12<=0) {
                            depositoD12 = Float.parseFloat(
                                JOptionPane.showInputDialog("Debe ingresar un entrada mayor a 0.\nIngrese el deposito "+(i+1)));
                        }
                        ahorroD12+=depositoD12;
                    }
                    opcionSeguir = JOptionPane.showInputDialog("El ahorro total de diciembre es: S/. "+df.format(ahorroD12)+
                        "\nSi desea seguir ahorrando ingrese \"S\""+
                        "y cualquier valor para finalizar.");
                    switch (opcionSeguir) {
                        case "S":
                            correcto=false;
                            break;
                    
                        default:
                            correcto=true;
                            break;
                    }
                    break;
                default:
                    JOptionPane.showMessageDialog(null,"Ingrese un mes valido.");           
                    
            }
        }
        ahorroFinal = ahorroActual + ahorroE1 + ahorroF2 + ahorroM3 + ahorroA4 + ahorroM5 + 
            ahorroJ6 + ahorroJ7 + ahorroA8 + ahorroS9 + ahorroO10 + ahorroN11 + ahorroD12;
        JOptionPane.showMessageDialog(null,"Su ahorro final es: S/. "+df.format(ahorroFinal));
    }    
}
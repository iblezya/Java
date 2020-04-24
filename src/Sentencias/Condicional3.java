package Sentencias;

public class Condicional3 {
    public static void main(String[] args) {
        byte nota = 1;
        switch (nota) {
            case 10:
            System.out.println("Malo"); 
                break;
            case 15:
            System.out.println("Regular");
                break;
            case 18:
            System.out.println("Bueno");
                break;         
            case 20:
            System.out.println("Excelente"); 
                break;
        }
        System.out.println("Condicion no valida");
    }

}
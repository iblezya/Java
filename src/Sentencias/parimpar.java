package Sentencias;

public class parimpar {
    public static void main(String[] args) {
        int numero;
        numero = 0;
        switch (numero) {
            case 0:
            System.out.println("El cero es numero neutro"); 
                break;        
            default:
            if (numero%2==0){
                System.out.println("El numero es par"); 
            }
            else{
                System.out.println("El numero es impar"); 
            }
                break;
        }
    }
}
package Sentencias;

public class Condicional {
    public static void main(String[] args) {
        int a=25;
        int b=20;
        int c=8;
        if (a>b) {
            if (a>c) {
                System.out.println("A es mayor.");
            }
            else{
                System.out.println("C es mayor");
            }            
            }
            else if (b>c){
                System.out.println("B es mayor.");
            }
        else{
            System.out.println("C mayor.");
        }
    }

}
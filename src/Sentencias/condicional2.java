package Sentencias;

public class condicional2 {
    public static void main(String[] args) {
        byte edad = 30;
        String sexo="Masculino";
        if (edad>18) {
            System.out.println("Mayor de edad.");            
        }
        else if (edad >= 15 && edad<=18){
            System.out.println("Tienes entre 15 y 18 años");
        }
        else{
            System.out.println("Tienes menos de 15 años.");
        }
        if (sexo=="Masculino") {
            System.out.println("Es un mr");            
        }
        else if (sexo=="Femenino"){
            System.out.println("Es una miss"); 
        }
    }

}
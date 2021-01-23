package IntroAJavaTM;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Boolean exit = false;
        int regresar =0;
        do {
            System.out.println("Selecciona una opcion del menu:");
            System.out.println("1 .Ejercicio 1");
            System.out.println("2 .Ejercicio 2");
            System.out.println("3 .Ejercicio 3");
            System.out.println("4 .Ejercicio 4");
            System.out.println("5 .Ejercicio 5");
            System.out.println("Otro numero .Salir");
            int option = scanner.nextInt();
            switch (option){
                case 1 :
                    Practica.nPrimerosPares();
                    break;
                case 2 :
                    Practica.nMultiplosDeM();
                    break;
                case 3 :
                    if (Practica.nEsPrimo()) {
                        System.out.println("Es Primo");
                    }
                    else {
                        System.out.println("No es Primo");
                    }
                    break;
                case 4 :
                        Practica.nNumerosPrimos();
                    break;
                case 5 :
                        Practica.ejercicioDigitos();
                    break;
                default:
                    exit=true;
            }
            System.out.println("Desea regresar al menu?");
            System.out.println("1 .Si");
            System.out.println("Otro numero .No");

            regresar = scanner.nextInt();
            exit = (regresar ==1)? false :true;
        }while(!exit);
    }
}

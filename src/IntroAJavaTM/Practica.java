package IntroAJavaTM;

import java.util.Scanner;

public class Practica {
    public static void nPrimerosPares(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el valor de n:");
        int n = scanner.nextInt();
        int i = 0;
        int valor = 0;
        while(i < n){
            System.out.println(valor);
            valor+=2;
            i++;
        }
    }
    public static void nMultiplosDeM(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el valor de n:");
        int n = scanner.nextInt();
        System.out.println("Ingrese el valor de m:");
        int m = scanner.nextInt();
        for(int i= 0; i<n ; i++){
            System.out.println(i*m);
        }
    }
    public static boolean nEsPrimo (){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el valor de n:");
        int n = scanner.nextInt();
        if (n == 0 ||n == 1){ // se considera que ni 1 ni 0 son primos
            return false;
        }
        for(int i =2; i <=Math.sqrt(n); i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }

    public static boolean nEsPrimo (int n){
        if (n == 0 ||n == 1){ // se considera que ni 1 ni 0 son primos
            return false;
        }
        for(int i =2; i <=Math.sqrt(n); i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }

    public static void nNumerosPrimos(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el valor de n:");
        int n = scanner.nextInt();
        int count = 0;
        for(int i=2; count < n; i++){
            if(nEsPrimo(i)){
                System.out.println(i);
                count++;
            }
        }
    }

    public static void ejercicioDigitos(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el valor de n:");
        int n = scanner.nextInt();
        System.out.println("Ingrese el valor de m:");
        int m = scanner.nextInt();
        System.out.println("Ingrese el valor de d:");
        int d = scanner.nextInt();
        int count = 0;
        int Occurences =0;
        int i =0;
        String currentNumber ;
        while(count < n){
            currentNumber = String.valueOf(i);
            for (int j = 0; j < currentNumber.length();j++) {
                if (currentNumber.charAt(j) == (char)(d+48)){
                    Occurences++;
                }
            }
            if (Occurences >= m){
                System.out.println(i);
                count++;
            }
            Occurences =0;
            i++;
        }
    }
}

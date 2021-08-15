package aula02;

import java.util.Scanner;

public class MesaDeTrabalho02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira um valor inteiro: ");
        int numero = scanner.nextInt();

        if(ehPrimo(numero)){
            System.out.println(numero + " é primo");
        } else{
            System.out.println(numero + " NÃO é primo");
        }
    }

    static boolean ehDivisivel(int numero, int divisor){
        return numero % divisor == 0;
    }

    static boolean ehPrimo(int numero){
        if(numero < 2){
            return false;
        }
        for(int i = 2; i < numero; i++){
            if(ehDivisivel(numero, i)){
                return false;
            }
        }
        return true;
    }
}
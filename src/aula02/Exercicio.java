package aula02;

import java.util.Scanner;

public class Exercicio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira seu nome");
        String nome = scanner.next();

        System.out.println("Insira seu sobrenome");
        String sobrenome = scanner.next();

        String iniciais = nome.charAt(0) + "" + sobrenome.charAt(0);
        System.out.println(iniciais);

        System.out.println("Insira seu dia de nascimento");
        String diaNascimento = scanner.next();

        System.out.println("Insira seu mês de nascimento");
        String mesNascimento = scanner.next();

        System.out.println("Insira seu ano de nascimento");
        String anoNascimento = scanner.next();

        System.out.println(nome + " " + sobrenome);
        System.out.println(iniciais);
        System.out.println(dataFormatada(diaNascimento, mesNascimento, anoNascimento));
    }

    public static String dataFormatada(String dia, String mes, String ano) {
        return dia + "/" + mes + "/" + ano;
    }
}
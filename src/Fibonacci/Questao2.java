package Fibonacci;

import java.util.Scanner;

public class Questao2 {
    //    2) Dado a sequência de Fibonacci, onde se inicia por 0 e 1 e o próximo valor sempre será a soma dos 2 valores anteriores
    //       exemplo: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34...), escreva um programa na linguagem que desejar onde, informado um número,
    //       ele calcule a sequência de Fibonacci e retorne uma mensagem avisando se o número informado pertence ou não a sequência.
    //
    //    IMPORTANTE:
    //    Esse número pode ser informado através de qualquer entrada de sua preferência ou pode ser previamente definido no código;

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        int num1 = 1, num2 = 0;
        int x = 0;

        System.out.print("Digite o tamanho da sequência de Fibonacci: ");
        x = scan.nextInt();

        for(int i = 0; i <= x; i++){
            System.out.println(num2);
            num1 = num1 + num2;
            num2 = num1 - num2;
        }
    }
}

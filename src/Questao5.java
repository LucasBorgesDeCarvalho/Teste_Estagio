import java.util.Scanner;

public class Questao5 {
    public static void main(String[] args){

        /*
        5) Escreva um programa que inverta os caracteres de um string.

        IMPORTANTE:
        a) Essa string pode ser informada através de qualquer entrada de sua preferência ou pode ser previamente definida no código;
        b) Evite usar funções prontas, como, por exemplo, reverse;

         */

        Scanner scan = new Scanner(System.in);
        String palavra = scan.next();
        String novaPalavra = "";

        for (int i = palavra.length() - 1; i >= 0; i--) {
            novaPalavra = novaPalavra + palavra.charAt(i);
        }
        System.out.println(novaPalavra);
    }
}

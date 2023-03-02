public class Questao1 {
    public static void main(String[] args) {

//        1) Observe o trecho de código abaixo:
//        int INDICE = 13, SOMA = 0, K = 0;
//        enquanto K < INDICE faça
//        {
//            K = K + 1;
//            SOMA = SOMA + K;
//        }
//        imprimir(SOMA);
//        Ao final do processamento, qual será o valor da variável SOMA?

        int INDICE = 13;
        int SOMA = 0;
        for (int k = 0; k < INDICE; k++) {
            SOMA = SOMA + k;
        }
        System.out.println(SOMA);
    }
}
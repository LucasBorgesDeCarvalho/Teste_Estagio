public class Questao4 {
    public static void main(String[] args) {
    /*
4 - Dois veículos (um carro e um caminhão) saem respectivamente de cidades opostas pela mesma rodovia.
O carro de Ribeirão Preto em direção a Franca, a uma velocidade constante de 110 km/h e o caminhão de Franca
em direção a Ribeirão Preto a uma velocidade constante de 80 km/h. Quando eles se cruzarem na rodovia,
qual estará mais próximo a cidade de Ribeirão Preto?

IMPORTANTE:

a) Considerar a distância de 100km entre a cidade de Ribeirão Preto <-> Franca.

b) Considerar 2 pedágios como obstáculo e que o caminhão leva 5 minutos a
mais para passar em cada um deles e o carro possui tag de pedágio (Sem Parar)

c) Explique como chegou no resultado.
     */

        double carro = 110;
        double caminhao = 80;
        double distanciaCidades = 100;
        double distanciaCarro;
        double distanciaCaminhao;
        double tempoDaViagemCaminhao, tempoDaViagemCarro;
        double obstaculo = 0.17;
        double v2Carro, v2Caminhao;

        tempoDaViagemCarro = (distanciaCidades / carro) + obstaculo;
        tempoDaViagemCaminhao = (distanciaCidades / caminhao) + obstaculo;

        System.out.println(tempoDaViagemCaminhao);
        System.out.println(tempoDaViagemCarro);

        v2Caminhao = distanciaCidades / tempoDaViagemCaminhao;
        v2Carro = distanciaCidades / tempoDaViagemCarro;

        System.out.println("Velocidade Media Carro: " + v2Carro);
        System.out.println("Velocidade Media Caminhão: " + v2Caminhao);


        distanciaCarro = (carro * distanciaCidades) / (carro + v2Carro);
        distanciaCaminhao = (caminhao * distanciaCidades) / (caminhao + v2Caminhao);

        System.out.println("A distancia do Carro é: " + distanciaCarro);
        System.out.println("A distancia do Caminhão é: " + distanciaCaminhao);

    }

}

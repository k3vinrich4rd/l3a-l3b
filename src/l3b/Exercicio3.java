package l3b;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        double auxiliar = 0;
        double maior = 0;
        double menor = 1000000000;
        double[] limite = new double[10];

        for (double c = 0; c < 10; c++) {
            System.out.print("Digite o " + (c + 1) + "º número e aperte enter: ");
            limite[(int) c] = ler.nextDouble();
            auxiliar = limite[(int) c];
            if (menor > auxiliar) {
                menor = limite[(int) c];
            } else if (maior < auxiliar) {
                maior = limite[(int) c];
            }

        }
        System.out.println("O maior é: " + maior + "O menor é: " + menor);


    }


}



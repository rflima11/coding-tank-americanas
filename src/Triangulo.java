import java.util.Scanner;

public class Triangulo {

    /*
        Desenvolver um programa que deverá desenhar um triângulo conforme a figura abaixo.
        O programa deverá receber quantidade de linhas a serem impressas.
        Exemplo, se for informado 10 linhas, o resultado deverá ser:

        **********
        *********
        ********
        *******
        ******
        *****
        ****
        ***
        **
        *

     */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int numeroLinhas = scan.nextInt();

        for(int i = numeroLinhas; i >= 0; i--) {
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.print("*");
        }
    }
}

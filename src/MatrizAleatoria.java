import java.util.Random;
import java.util.Scanner;

/*
Crie uma matriz quadrada de inteiros com o tamanho informado pelo usuário
e atribua valores numéricos aleatórios a ela.
*/
public class MatrizAleatoria {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Por favor, informe o tamanho da matriz: ");
        int tamanho = scan.nextInt();

          /*
        Caso tamanho = 2
         [0][0]
         [0][0]
         */

        int[][] matriz = new int[tamanho][tamanho];

        Random random = new Random();

        for(int linha = 0; linha < matriz.length; linha++) {
            for(int coluna = 0; coluna < matriz[linha].length; coluna++) {
              matriz[linha][coluna] = random.nextInt(9) ;
//                matriz[linha][coluna] = (int) (Math.random() * 9) + 1;
                System.out.print(matriz[linha][coluna] + " ");
            }
            System.out.print("\n");
        }






    }
}

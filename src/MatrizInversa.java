import java.util.Scanner;

public class MatrizInversa {

    /*
            Ex: tamanho matriz 3x3

            [0][0][0]
            [0][0][0]
            [0][0][0]

            Com base no input do usuário crie uma matriz quadrada
            e preencha a sua diagonal invertida com o valor 1

            [0][0][1]
            [0][1][0]
            [1][0][0]

            [0][0][0][0][1]
            [0][0][0][1][0]
            [0][0][1][0][0]
            [0][1][0][0][0]
            [1][0][0][0][0]
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o tamanho da matriz: ");
        int tamanho = scan.nextInt();


        int[][] matrix = new int[tamanho][tamanho];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = matrix[i].length - 1; j >= 0; j--) {
                if (j == i) {
                    matrix[i][j] = 1;
                }

                System.out.print(matrix[i][j] + " ");
            }

            System.out.println();
        }
//            for(int coluna = 0; coluna < matriz.length; coluna++) {
//                if (coluna == matriz.length - linha - 1) {
//                    matriz[linha][coluna] = 1;
//                }
//                System.out.print("[" + matriz[linha][coluna] + "]");
//            }




    }
}

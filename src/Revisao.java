import java.util.ArrayList;

public class Revisao {

    public static void main(String[] args) {

        int[] arrayInteiros = new int[]{1,2,3};

//        for(int i = 0; i < arrayInteiros.length; i++) {
//            System.out.print(arrayInteiros[i]);
//        }
//
//
//        for(int inteiro : arrayInteiros) {
//            System.out.print(inteiro + " ");
//        }


        int[][] matriz = {{1,2,3}, {3,2,1}, {5,4,6}};


//        for(int linha = 0; linha < matriz.length; linha++) {
//            for(int coluna = 0; coluna < matriz[linha].length; coluna++) {
//                System.out.println("[" + matriz[linha][coluna] + "]");
//            }
//        }

        for(int[] array : matriz) {
            for(int inteiro : array) {
                System.out.print("[" + inteiro + "]");
            }
            System.out.println();
        }

//        matriz[0] = new int[5];
//        matriz[1] = new int[4];

    }



}

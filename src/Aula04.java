import java.util.Scanner;

public class Aula04 {

    public static void main(String[] args) {


        //byte short int long float e double -> 0
        // boolean -> false
        // String -> null

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Quantas idades você deseja informar: ");
//        int n = scanner.nextInt();
//        int[] arrayIdades = new int[n];
//
//
//        for(int i = 0; i < arrayIdades.length; i++) {
//            System.out.println("Informe a " + (i + 1) + " idade: ");
//            arrayIdades[i] = scanner.nextInt();
//
//        }
//
//        //duas formas de interar sobre arrays
//
//        for(int i = 0; i < arrayIdades.length; i++) {
//            System.out.print(arrayIdades[i] + " ");
//        }
//
//        for(int idade : arrayIdades) {
//            System.out.print(idade + " ");
//
//        }

        int arrayMultiDimensional[][] = {{1, 2}, {3, 4}};

        for(int linha = 0; linha < arrayMultiDimensional.length; linha++) {
            for(int coluna = 0; coluna < arrayMultiDimensional[linha].length; coluna++) {
                System.out.print(arrayMultiDimensional[linha][coluna] + " ");
            }
            System.out.println();
        }
    }
}

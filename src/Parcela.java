public class Parcela {

    public static void main(String[] args) {

        int input = 5;
        StringBuilder sb = new StringBuilder();
        for(int linhas = input; linhas > 0; linhas--) {
            for (int j = 0; j < input; j++) {
                sb.append("*");
            }
            sb.append("\n");
            int divisor = 1;
            if (linhas < input && linhas != 1) {
                System.out.println("dentro do if");
            }


        }
        System.out.println(sb);

    }
}

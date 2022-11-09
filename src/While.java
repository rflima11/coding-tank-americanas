public class While {

    public static void main(String[] args) {

        int contador = 0;
        while(true) {

            System.out.println("LOOP INFINITO");
            contador++;

            if (contador > 1000000)
                break;
        }

    }
}

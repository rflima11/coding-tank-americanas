public class Parcela {


    /*
     Uma cliente pegou um empréstimo em um banco no valor de R$20,000
     Parcela >= R$1000
     */
    public static void main(String[] args) {

        double valorTotal = 20000.00;
        double valorParcela;
//        for(int parcela = 1; parcela <= valorTotal; parcela++) {
//            valorParcela = valorTotal / parcela;
//
//            if (valorParcela < 1000) {
//                break;
//            }
//
//            System.out.println(parcela + " parcelas no valor R$" + valorParcela);
//
//
//        }

        for(int i = 1; i <= 10; i++) {

            if (i == 5) {
                continue;
            }
            System.out.println(i);
        }

    }



}

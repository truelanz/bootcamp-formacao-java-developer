public class CondicionaisSimples {
    public static void main(String[] args) {

        double saldo = 25;
        double valorSolicitado = 26;

        if(valorSolicitado < saldo)
            saldo = saldo - valorSolicitado;

        System.out.println(saldo);
        
    }
}

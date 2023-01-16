import java.text.NumberFormat;
import java.util.Scanner;

public class ContaTerminal {
    
    /* Crie o projeto ContaBanco que receberá dados via terminal contendo as características de conta em banco conforme atributos abaixo:
    Dentro do projeto, crie a classe ContaTerminal.java para realizar toda a codificação do nosso programa.
    
        Revise sobre regras de declaração de variáveis
        Atributo - Tipo - Exemplo
        Numero - Inteiro - 1021
        Agencia	- Texto - 067-8
        NomeCliente - Texto - MARIO ANDRADE
        Saldo - Decimal - 237.48

    Depois de todas as informações terem sido inseridas, o sistema deverá exibir a seguinte mensagem:
    "Olá [Nome Cliente], obrigado por criar uma conta em nosso banco, sua agência é [Agencia], conta [Numero] e seu saldo [Saldo] já está disponível para saque".*/
        
    public static void main(String[] args) {

        try (Scanner scan = new Scanner(System.in)) {
            String agencia, nomeCliente;
            int numeroConta;
            float saldo;
            boolean soNumeros;
            
            System.out.println("Digite o seu nome: ");
            nomeCliente = scan.nextLine();

            System.out.println("---");

            do{
                System.out.println("Número da agência: ");
                agencia = scan.next();
                soNumeros = true;
                if(!agencia.matches("\\d+")){ //Se conter Letras = false.
                soNumeros = false; 
                System.out.println("\nDigite apenas números: ");}
            }while(!soNumeros);
            

            System.out.println("---");

            
                System.out.println("Número da conta: ");
                numeroConta = scan.nextInt();
                
            System.out.println("---");
                
            System.out.println("Deposite alguma quantia para finalizar a criação da sua conta: ");
            saldo = scan.nextFloat();

            System.out.println("---");

            System.out.println("Olá ".concat(nomeCliente).concat(", obrigado por criar uma conta em nosso banco, sua agência é ").concat(agencia) + 
            ", conta " + numeroConta  + " e seu saldo " + NumberFormat.getInstance().format(saldo) + " já está disponível para saque.");

        }   
  }
}


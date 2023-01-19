public class SwitchCase {

    public static void main(String[] args) {

        String sigla = "M";

        switch (sigla) { // <- Condição contida no switch \\
            case "P":
            System.out.println("Pequeno");
                break;
            case "M":
            System.out.println("Médio");
                break;
            case "G":
            System.out.println("Grande");
                break;
            default:
            System.out.println("Tamanho não identificado!"); //Casso nenhuma das alternativas...

        }
        
    }
    
}

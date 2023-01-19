public class CondicaoTernaria {

    public static void main(String[] args) {
        int nota = 3;
        String resultado;

        /* resultado = nota >= 7 ? "\nAprovado\n" : "\nReprovado\n";
        System.out.println(resultado); */

        resultado = nota >= 7 && nota <= 9 ? "Aprovado" :
        nota >=5 && nota < 7 ? "Em Recuperação" :
        nota == 10 ? "Excelente! Ótimo aluno! " : 
        nota <= 3 ? "Vai, fica nos barzinhos em horários de aula... HAHAHA! " : 
        "Reprovado"; // Sempre tem que ter um -> ( ? "..." : "...." ) <- para finalizar um condicional ternário.
        System.out.println("\n" + resultado + "\n");
        

        /* if(nota >= 7 && nota <= 9) //Se dentro do if ou else houver mais de uma instrução,
        System.out.println("\naprovado\n"); //é nescessário a croação de um bloco '{}';
        
        else if (nota >= 5 && nota < 7)
        System.out.println("\nEm Recuperação...\n");

        else if (nota == 10)
        System.out.println("\nExelente aluno!\n");

        else if (nota < 3)
        System.out.println("\nIsso que da ficar no barzinho... HAHAHA\n");

        else
        System.out.println("\nReprovado\n");
    */
    }
}

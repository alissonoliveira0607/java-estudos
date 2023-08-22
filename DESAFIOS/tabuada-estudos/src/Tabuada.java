import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) throws Exception {

        //Instanciando meu objeto Scanner para obter a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor da tabuada que deseja obter: ");
        int tabuada = scanner.nextInt();

        //Tabuada com FOR
        for (int i = 1; i <= 10; i++) {
            System.out.println(tabuada + " X " + i + " = " + (tabuada * i));
        }

        System.out.println("\n");


        int contador = 1;
        System.out.println("\n");

        //Tabuada com while
        while (contador <= 10) {
            int auxiliar = 10;            
            System.out.println(tabuada + " X " + contador + " = " + (tabuada * contador));
            contador++;
        }
        System.out.println("\n");

        boolean condicao = false;

        do {
               for (int i = 1; i <= 10; i++) {
                    System.out.println(tabuada + " X " + i + " = " + (tabuada * i));
        }
            
        } while (condicao);
        
        System.out.println("\n");


        //Tabuada do 1 - 10 com for aninhado
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " X " + j + " = " + (i * j));
            }
            System.out.println("\n");
        }
        
        //Definindo um array
        String alunos[] = { "Fulano", "Sicrano", "beltrano" };

        //Percorrendo a lista de alunos com foreach
        for (String aluno : alunos) {
            System.out.println(aluno);

        }
        
        System.out.println("\n");


        //Percorrendo o array de alunos e imprimindo em tela
        for (int i = 0; i < alunos.length; i++) {
            System.out.println(alunos[i]);
        }

    }
}

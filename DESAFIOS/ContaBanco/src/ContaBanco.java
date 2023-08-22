import java.util.Scanner;
import java.util.Locale;

public class ContaBanco {
    public static void main(String[] args) throws Exception {
        ContaTerminal contaCliente = new ContaTerminal();
        Scanner scanner = new Scanner(System.in);


        System.out.print("Digite o número da conta: ");
        int conta = scanner.nextInt();

        System.out.print("Digite a agência: ");
        String agencia = scanner.next();

        System.out.print("Digite seu nome: ");
        String nome = scanner.next();

        String mensagem = String.format(
                "Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponivel para saque",
                nome, agencia, conta, contaCliente.Saldo);


        System.out.println(mensagem);
        // Operador de Concatenação (+):
        // Você pode usar o operador de adição (+) para concatenar strings e variáveis. O Java automaticamente converte os valores em strings e os une:
        // java

        // String nome = "João";
        // int idade = 30;
        // String mensagem = "Olá, meu nome é " + nome + " e tenho " + idade + " anos.";
        // System.out.println(mensagem);
        // Método concat():
        // A classe String também possui um método chamado concat() que pode ser usado para concatenar strings:
        // java

        // String nome = "Maria";
        // String sobrenome = "Silva";
        // String nomeCompleto = nome.concat(" ").concat(sobrenome);
        // System.out.println(nomeCompleto);
        // Método StringBuilder:
        // Se você estiver trabalhando com muitas operações de concatenação, é mais eficiente usar a classe StringBuilder, que é mutável e otimizada para construir strings:
        // java

        // String nome = "Carlos";
        // int numero = 123;
        // StringBuilder builder = new StringBuilder();
        // builder.append("Nome: ").append(nome).append(", Número: ").append(numero);
        // String resultado = builder.toString();
        // System.out.println(resultado);
        // Método String.format():
        // Você também pode usar o método String.format() para criar strings formatadas, que permite incorporar valores em uma string de formato:
        // java

        //String produto = "Camiseta";
        // double preco = 29.99;
        // int quantidade = 2;
        // char tamanho = 'M';

        // String mensagem = String.format("Você comprou %d %s de tamanho %c por R$ %.2f cada. Total: R$ %.2f",
        //                                 quantidade, produto, tamanho, preco, quantidade * preco);

        // System.out.println(mensagem);

    }
}

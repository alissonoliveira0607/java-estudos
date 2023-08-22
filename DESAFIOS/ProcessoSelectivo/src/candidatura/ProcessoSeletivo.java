package candidatura;

import java.util.concurrent.ThreadLocalRandom; //Lib será responsãvel em randomizar os valores de salário
public class ProcessoSeletivo {
    public static void main(String[] args) {

        selecaoCandidatos();

    }

    static void selecaoCandidatos() {
        //Array de candidatos
        String[] candidatos = { "Felipe", "joão", "MArcia", "Julia", "Luisa", "Elen", "MAria", "Andrew", "MArcos" };

        
        int candidatosSelecionados = 0;  //Inicializando a variavel auxiliar
        int candidatosAtual = 0;
        double salarioBase = 2000.0F;

        while (candidatosSelecionados < 5 && candidatosAtual < candidatos.length) {
            String candidato = candidatos[candidatosAtual];
            double salarioPretendido = valorPretendido();

            System.out.println(
                    String.format("O candidato %s solicitou o valor de salário %.2f", candidato, salarioPretendido));
            if (salarioBase >= salarioPretendido) {
                System.out.println(String.format("O candidato %s foi selecionado para a vaga", candidato));
                candidatosSelecionados++;
            }
            candidatosAtual++;
        }
    }
    
    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    static void analisarCandidato(double salarioPretendido) {
        double salarioBase = 2000.0F;


        if (salarioBase > salarioPretendido) {
            System.out.println("LIGAR PARA O CANDIDATO");
        } else if (salarioBase == salarioPretendido) {
            System.out.println("LIGAR PARA  O CANDIDATO COM CONTRA PROPOSTA");
        }
        else {
            System.out.println("AGUARDANDO O RESULTADO DOS DEMAIS CANDIDATOS");
        }
    }
}

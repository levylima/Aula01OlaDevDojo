package academy.devdojo.maratonajava.introducao;
/*
Prática

Crie variáveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem:

Eu <nome>, morando no endereço <endereço>, confirmo que recebi o salário de <salário>, na <data>
 */
public class Aula03TiposPrimitivosExercicio {
    public static void main(String[] args) {
        String nome = "Ronaldo";
        String endereco = "Rua-dos-Altos";
        double salario = 1345.35;
        String data = "18/06/2022";

        System.out.println("Eu "+nome+", morando no endereço "+endereco+", confirmo que recebi o salário de "+salario+", em "+data+".");
    }
}

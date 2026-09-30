import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Questao> questoes = new ArrayList<>();

        questoes.add(new Questao(
                "Para que serve uma avaliação fisíca?",
                new String[]{
                        "A) Apenas para descobrir o peso",
                        "B) Para conhecer o estado fisíco e acompanhar a evolução",
                        "C) Para definir a quantidade de dias que deve treinar ",
                        "D) Apenas para descobrir a altura"
                },
                2
        ));

        questoes.add(new Questao(
                "O que é IMC relaciona? ",
                new String[]{
                        "A) altura e peso",
                        "B) força e velocidade",
                        "C) gordura e musculo",
                        "D) idade e frequência cardica"
                },
                1
        ));

        questoes.add(new Questao(
                "O que a avaliação de composição corporal pode identificar?",
                new String[]{
                        "A) apenas peso",
                        "B) somente altura",
                        "C) massa muscular e gordura corporal",
                        "D) apenas idade"
                },
                3
        ));

        questoes.add(new Questao(
                "Para que serve a medição de circunferência?",
                new String[]{
                        "A) avaliar medidas corporais e acompanhar mudanças",
                        "B) medir a frenquência cardíaca ",
                        "C) descobrir a carga ideal",
                        "D) avaliar a flexibilidade"
                },
                1
        ));

        questoes.add(new Questao(
                "por que repetir a avaliação física ao longo do tempo?",
                new String[]{
                        "A) para aumentar o peso",
                        "B) para substituir o treino",
                        "C) para escolher a academia",
                        "D) para comparar a evolução"
                },
                4
        ));

        questoes.add(new Questao(
                "Qual dessas medidas pode fazer parte de uma avaliação fisíca?",
                new String[]{
                        "A) tamanho da camiseta",
                        "B) circunferencia da cintura",
                        "C) número do calçado",
                        "D) cor dos olhos"
                },
                2
        ));

        questoes.add(new Questao(
                "A avaliação física pode ajudar o profissional a:",
                new String[]{
                        "A) Escolher a roupa de treino",
                        "B) Definir o suplemento de qualquer pessoa",
                        "C) Personalizar o planejamento de treino",
                        "D) Garantir resultados em poucos dias"
                },
                3
        ));

        questoes.add(new Questao(
                "Por que é importante realizar as avaliações em condições semelhantes?",
                new String[]{
                        "A) Para facilitar a comparação dos resultados",
                        "B) Para aumentar o peso corporal",
                        "C) Para evitar qualquer tipo de exercício",
                        "D) Para substituir a alimentação"
                },
                1
        ));

        questoes.add(new Questao(
                "Qual medida é frequentemente utilizada para acompanhar mudanças na região abdominal?",
                new String[]{
                        "A) Circunferência da cintura",
                        "B) Comprimento do braço",
                        "C) Altura",
                        "D) Tamanho do pé"
                },
                3
        ));

        questoes.add(new Questao(
                " O que a frequência cardíaca pode indicar durante o exercício?",
                new String[]{
                        "A) A quantidade de gordura corporal",
                        "B) A intensidade do esforço",
                        "C) A altura da pessoa",
                        "D)  O tamanho dos músculos"
                },
                2
        ));

        questoes.add(new Questao(
                "O que a bioimpedância pode avaliar?",
                new String[]{
                        "A) Composição corporal",
                        "B) Apenas a altura",
                        "C) Apenas a flexibilidade",
                        "D) somente a frequência cardíaca"
                },
                1
        ));

        questoes.add(new Questao(
                "A avaliação física deve ser feita:?",
                new String[]{
                        "A) Somente quando a pessoa começa a academia",
                        "B) Apenas quando quer emagrecer",
                        "C) Periodicamente para acompanhar mudanças",
                        "D) Apenas quando quer emagrecer"
                },
                3
        ));

        questoes.add(new Questao(
                "O que pode ser observado ao comparar duas avaliações físicas?",
                new String[]{
                        "A) Apenas a idade",
                        "B) Evolução de medidas e composição corporal",
                        "C) Somente a frequência cardíaca",
                        "D) Apenas a altura"
                },
                2
        ));

        questoes.add(new Questao(
                " Qual informação pode ser importante antes de iniciar um programa de exercícios?",
                new String[]{
                        "A) Cor da roupa",
                        "B)  Marca do tênis",
                        "C) Histórico e condições de saúde",
                        "D) Música preferida"
                },
                3
        ));

        questoes.add(new Questao(
                "O que a avaliação de flexibilidade verifica?",
                new String[]{
                        "A) Massa muscular",
                        "B) Capacidade de movimentação das articulações",
                        "C)  Quantidade de gordura",
                        "D) Peso corporal"
                },
                2
        ));

        System.out.println("==============================================");
        System.out.println("             QUIZ AVALIAÇÃO FISÍCA          ");
        System.out.println("==============================================");
        System.out.println("Aluno: ANA LAURA LEMOS SILVA");
        System.out.println("Professor: BRENNO PIMENTA");
        System.out.println("Faculdade: UNIFAN");
        System.out.println("==============================================");
        System.out.println();

        System.out.println("Seja Bem-vindo a su avaliação fisíca");
        System.out.println("O sistema possui " + questoes.size() + " questões.");
        System.out.println("Digite o número correspondente à alternativa escolhida.");
        System.out.println();

        int acertos = 0;

        for (int i = 0; i < questoes.size(); i++) {

            Questao questao = questoes.get(i);

            System.out.println("----------------------------------------------");
            System.out.println("Questão " + (i + 1) + " de " + questoes.size());
            System.out.println("----------------------------------------------");

            System.out.println(questao.getEnunciado());

            String[] alternativas = questao.getAlternativas();

            for (String alternativa : alternativas) {
                System.out.println(alternativa);
            }

            System.out.print("Sua resposta: ");

            int respostaUsuario = scanner.nextInt();

            // Verifica se a resposta está correta
            if (respostaUsuario == questao.getRespostaCorreta()) {
                System.out.println("Resposta correta!");
                acertos++;
            } else {
                System.out.println("Resposta incorreta.");
                System.out.println(
                        "A resposta correta era: "
                                + questao.getRespostaCorreta()
                );
            }

            System.out.println();
        }

        double porcentagem = ((double) acertos / questoes.size()) * 100;

        // Exibe o resultado final
        System.out.println("==============================================");
        System.out.println("              RESULTADO FINAL");
        System.out.println("==============================================");
        System.out.println("Total de questões: " + questoes.size());
        System.out.println("Quantidade de acertos: " + acertos);
        System.out.printf("Porcentagem de acertos: %.2f%%%n", porcentagem);
        System.out.println("==============================================");

        System.out.println();
        System.out.println("Obrigado pela participação no Quiz!");
        System.out.println("Até a próxima!");

        scanner.close();
    }
}
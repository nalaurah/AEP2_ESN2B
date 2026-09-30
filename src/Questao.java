public class Questao {

    private String enunciado;
    private String[] alternativas;
    private int respostaCorreta;

    public Questao(String enunciado, String[] alternativas, int respostaCorreta) {
        this.enunciado = enunciado;
        this.alternativas = alternativas;
        this.respostaCorreta = respostaCorreta;
    }

    public String getEnunciado() {
        return enunciado;
    }

    public String[] getAlternativas() {
        return alternativas;
    }

    public int getRespostaCorreta() {
        return respostaCorreta;
    }
}
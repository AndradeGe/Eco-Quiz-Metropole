public class Questao {
    private String enunciado;
    private String alternativaA;
    private String alternativaB;
    private String alternativaC;
    private String alternativaD;
    private String respostaCorreta;
    private String categoria;

    public Questao(String enunciado, String altA, String altB,
                   String altC, String altD, String resposta,
                   String categoria) {
        this.enunciado = enunciado;
        this.alternativaA = altA;
        this.alternativaB = altB;
        this.alternativaC = altC;
        this.alternativaD = altD;
        this.respostaCorreta = resposta.toUpperCase();
        this.categoria = categoria;
    }

    public boolean verificarResposta(String resposta) {
        return this.respostaCorreta.equals(resposta.toUpperCase().trim());
    }

    public String getEnunciado() {
        return enunciado;
    }

    public String getAlternativaA() {
        return alternativaA;
    }

    public String getAlternativaB() {
        return alternativaB;
    }

    public String getAlternativaC() {
        return alternativaC;
    }

    public String getAlternativaD() {
        return alternativaD;
    }

    public String getRespostaCorreta() {
        return respostaCorreta;
    }

    public String getCategoria() {
        return categoria;
    }
}
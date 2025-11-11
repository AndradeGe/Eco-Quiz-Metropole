import java.util.ArrayList;

public class ControladorJogo {
    private ArrayList<Questao> questoes;
    private int indiceQuestaoAtual;
    private int pontuacao;
    private String nomeJogador;
    private static final int QUANTIDADE_QUESTOES = 20;
    private static final int PONTOS_POR_ACERTO = 10;

    public ControladorJogo(String nome) {
        this.nomeJogador = nome;
        this.pontuacao = 0;
        this.indiceQuestaoAtual = 0;
        this.questoes = new ArrayList<>();
    }

    public void iniciarJogo() {
        BancoQuestoes banco = BancoQuestoes.getInstance();
        this.questoes = banco.obterQuestoesAleatorias(QUANTIDADE_QUESTOES);
        this.indiceQuestaoAtual = 0;
        this.pontuacao = 0;
    }

    public Questao getQuestaoAtual() {
        if (indiceQuestaoAtual < questoes.size()) {
            return questoes.get(indiceQuestaoAtual);
        }
        return null;
    }

    public boolean processarResposta(String resposta) {
        Questao questaoAtual = getQuestaoAtual();
        if (questaoAtual != null) {
            boolean acertou = questaoAtual.verificarResposta(resposta);
            if (acertou) {
                pontuacao += PONTOS_POR_ACERTO;
            }
            return acertou;
        }
        return false;
    }

    public void proximaQuestao() {
        indiceQuestaoAtual++;
    }

    public boolean jogoFinalizado() {
        return indiceQuestaoAtual >= questoes.size();
    }

    public int getPontuacao() {
        return pontuacao;
    }

    public int getNumeroQuestaoAtual() {
        return indiceQuestaoAtual + 1;
    }

    public int getTotalQuestoes() {
        return questoes.size();
    }

    public double calcularDesempenho() {
        return (pontuacao / (double)(QUANTIDADE_QUESTOES * PONTOS_POR_ACERTO)) * 100;
    }

    public String obterMensagemFeedback() {
        if (pontuacao >= 0 && pontuacao <= 60) {
            return "Nível Iniciante - Continue estudando sobre sustentabilidade!";
        } else if (pontuacao >= 70 && pontuacao <= 100) {
            return "Nível Aprendiz - Você está no caminho certo!";
        } else if (pontuacao >= 110 && pontuacao <= 140) {
            return "Nível Consciente - Muito bem! Você conhece práticas sustentáveis.";
        } else if (pontuacao >= 150 && pontuacao <= 180) {
            return "Guardião Ambiental - Excelente conhecimento sobre sustentabilidade!";
        } else {
            return "Mestre da Sustentabilidade - Parabéns! Você é um exemplo!";
        }
    }

    public void reiniciarJogo() {
        this.pontuacao = 0;
        this.indiceQuestaoAtual = 0;
        iniciarJogo();
    }

    public String getNomeJogador() {
        return nomeJogador;
    }
}
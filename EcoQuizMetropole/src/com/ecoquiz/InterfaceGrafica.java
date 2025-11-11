import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InterfaceGrafica {
    private JFrame frame;
    private ControladorJogo controlador;
    private JPanel painelPrincipal;
    private JLabel labelEnunciado;
    private JLabel labelPontuacao;
    private JLabel labelNumeroQuestao;
    private JRadioButton radioButtonA, radioButtonB, radioButtonC, radioButtonD;
    private ButtonGroup grupoAlternativas;
    private JButton botaoConfirmar;
    private JButton botaoReiniciar;

    public InterfaceGrafica(ControladorJogo controlador) {
        this.controlador = controlador;
        inicializar();
    }

    private void inicializar() {
        frame = new JFrame("Eco Quiz Metrópole");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
        frame.setLocationRelativeTo(null);

        exibirTelaInicial();
    }

    private void exibirTelaInicial() {
        painelPrincipal = new JPanel();
        painelPrincipal.setLayout(new BorderLayout());
        painelPrincipal.setBackground(new Color(230, 245, 230));

        JPanel painelCentral = new JPanel();
        painelCentral.setLayout(new BoxLayout(painelCentral, BoxLayout.Y_AXIS));
        painelCentral.setBackground(new Color(230, 245, 230));

        JLabel labelTitulo = new JLabel("Eco Quiz Metrópole");
        labelTitulo.setFont(new Font("Arial", Font.BOLD, 36));
        labelTitulo.setForeground(new Color(34, 139, 34));
        labelTitulo.setAlignmentX(Component.CENTER_ALIGNMENT);

        JLabel labelSubtitulo = new JLabel("Teste seus conhecimentos sobre sustentabilidade urbana!");
        labelSubtitulo.setFont(new Font("Arial", Font.PLAIN, 18));
        labelSubtitulo.setAlignmentX(Component.CENTER_ALIGNMENT);

        JButton botaoIniciar = new JButton("Iniciar Quiz");
        botaoIniciar.setFont(new Font("Arial", Font.BOLD, 20));
        botaoIniciar.setBackground(new Color(34, 139, 34));
        botaoIniciar.setForeground(Color.WHITE);
        botaoIniciar.setAlignmentX(Component.CENTER_ALIGNMENT);
        botaoIniciar.setFocusPainted(false);

        botaoIniciar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controlador.iniciarJogo();
                exibirTelaPergunta();
            }
        });

        painelCentral.add(Box.createVerticalGlue());
        painelCentral.add(labelTitulo);
        painelCentral.add(Box.createRigidArea(new Dimension(0, 20)));
        painelCentral.add(labelSubtitulo);
        painelCentral.add(Box.createRigidArea(new Dimension(0, 40)));
        painelCentral.add(botaoIniciar);
        painelCentral.add(Box.createVerticalGlue());

        painelPrincipal.add(painelCentral, BorderLayout.CENTER);

        frame.setContentPane(painelPrincipal);
        frame.setVisible(true);
    }

    private void exibirTelaPergunta() {
        painelPrincipal = new JPanel();
        painelPrincipal.setLayout(new BorderLayout(10, 10));
        painelPrincipal.setBackground(new Color(240, 248, 255));
        painelPrincipal.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        // Painel superior com informações
        JPanel painelSuperior = new JPanel();
        painelSuperior.setLayout(new FlowLayout(FlowLayout.CENTER));
        painelSuperior.setBackground(new Color(240, 248, 255));

        labelNumeroQuestao = new JLabel();
        labelNumeroQuestao.setFont(new Font("Arial", Font.BOLD, 16));

        labelPontuacao = new JLabel();
        labelPontuacao.setFont(new Font("Arial", Font.BOLD, 16));
        labelPontuacao.setForeground(new Color(34, 139, 34));

        painelSuperior.add(labelNumeroQuestao);
        painelSuperior.add(Box.createRigidArea(new Dimension(50, 0)));
        painelSuperior.add(labelPontuacao);

        // Painel central com pergunta e alternativas
        JPanel painelCentral = new JPanel();
        painelCentral.setLayout(new BoxLayout(painelCentral, BoxLayout.Y_AXIS));
        painelCentral.setBackground(Color.WHITE);
        painelCentral.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(new Color(34, 139, 34), 2),
                BorderFactory.createEmptyBorder(20, 20, 20, 20)
        ));

        labelEnunciado = new JLabel();
        labelEnunciado.setFont(new Font("Arial", Font.PLAIN, 18));
        labelEnunciado.setAlignmentX(Component.LEFT_ALIGNMENT);

        radioButtonA = new JRadioButton();
        radioButtonB = new JRadioButton();
        radioButtonC = new JRadioButton();
        radioButtonD = new JRadioButton();

        radioButtonA.setFont(new Font("Arial", Font.PLAIN, 16));
        radioButtonB.setFont(new Font("Arial", Font.PLAIN, 16));
        radioButtonC.setFont(new Font("Arial", Font.PLAIN, 16));
        radioButtonD.setFont(new Font("Arial", Font.PLAIN, 16));

        radioButtonA.setBackground(Color.WHITE);
        radioButtonB.setBackground(Color.WHITE);
        radioButtonC.setBackground(Color.WHITE);
        radioButtonD.setBackground(Color.WHITE);

        grupoAlternativas = new ButtonGroup();
        grupoAlternativas.add(radioButtonA);
        grupoAlternativas.add(radioButtonB);
        grupoAlternativas.add(radioButtonC);
        grupoAlternativas.add(radioButtonD);

        painelCentral.add(labelEnunciado);
        painelCentral.add(Box.createRigidArea(new Dimension(0, 20)));
        painelCentral.add(radioButtonA);
        painelCentral.add(Box.createRigidArea(new Dimension(0, 10)));
        painelCentral.add(radioButtonB);
        painelCentral.add(Box.createRigidArea(new Dimension(0, 10)));
        painelCentral.add(radioButtonC);
        painelCentral.add(Box.createRigidArea(new Dimension(0, 10)));
        painelCentral.add(radioButtonD);

        // Painel inferior com botão
        JPanel painelInferior = new JPanel();
        painelInferior.setLayout(new FlowLayout(FlowLayout.CENTER));
        painelInferior.setBackground(new Color(240, 248, 255));

        botaoConfirmar = new JButton("Confirmar Resposta");
        botaoConfirmar.setFont(new Font("Arial", Font.BOLD, 16));
        botaoConfirmar.setBackground(new Color(34, 139, 34));
        botaoConfirmar.setForeground(Color.WHITE);
        botaoConfirmar.setFocusPainted(false);

        botaoConfirmar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                processarRespostaUsuario();
            }
        });

        painelInferior.add(botaoConfirmar);

        painelPrincipal.add(painelSuperior, BorderLayout.NORTH);
        painelPrincipal.add(painelCentral, BorderLayout.CENTER);
        painelPrincipal.add(painelInferior, BorderLayout.SOUTH);

        atualizarQuestao();

        frame.setContentPane(painelPrincipal);
        frame.revalidate();
        frame.repaint();
    }

    private void atualizarQuestao() {
        Questao questaoAtual = controlador.getQuestaoAtual();

        if (questaoAtual != null) {
            labelNumeroQuestao.setText("Questão " + controlador.getNumeroQuestaoAtual() +
                    " de " + controlador.getTotalQuestoes());
            labelPontuacao.setText("Pontuação: " + controlador.getPontuacao());
            labelEnunciado.setText("<html>" + questaoAtual.getEnunciado() + "</html>");
            radioButtonA.setText(questaoAtual.getAlternativaA());
            radioButtonB.setText(questaoAtual.getAlternativaB());
            radioButtonC.setText(questaoAtual.getAlternativaC());
            radioButtonD.setText(questaoAtual.getAlternativaD());
            grupoAlternativas.clearSelection();
        }
    }

    private void processarRespostaUsuario() {
        String respostaSelecionada = "";

        if (radioButtonA.isSelected()) {
            respostaSelecionada = "A";
        } else if (radioButtonB.isSelected()) {
            respostaSelecionada = "B";
        } else if (radioButtonC.isSelected()) {
            respostaSelecionada = "C";
        } else if (radioButtonD.isSelected()) {
            respostaSelecionada = "D";
        } else {
            JOptionPane.showMessageDialog(frame,
                    "Por favor, selecione uma alternativa!",
                    "Atenção",
                    JOptionPane.WARNING_MESSAGE);
            return;
        }

        boolean acertou = controlador.processarResposta(respostaSelecionada);
        exibirFeedback(acertou);

        controlador.proximaQuestao();

        if (controlador.jogoFinalizado()) {
            exibirTelaResultado();
        } else {
            atualizarQuestao();
        }
    }

    private void exibirFeedback(boolean acertou) {
        if (acertou) {
            JOptionPane.showMessageDialog(frame,
                    "Resposta Correta! +10 pontos",
                    "Parabéns!",
                    JOptionPane.INFORMATION_MESSAGE);
        } else {
            Questao questaoAtual = controlador.getQuestaoAtual();
            JOptionPane.showMessageDialog(frame,
                    "Resposta Incorreta! A resposta correta era: " +
                            questaoAtual.getRespostaCorreta(),
                    "Ops!",
                    JOptionPane.ERROR_MESSAGE);
        }
    }

    private void exibirTelaResultado() {
        painelPrincipal = new JPanel();
        painelPrincipal.setLayout(new BorderLayout());
        painelPrincipal.setBackground(new Color(245, 255, 250));

        JPanel painelCentral = new JPanel();
        painelCentral.setLayout(new BoxLayout(painelCentral, BoxLayout.Y_AXIS));
        painelCentral.setBackground(new Color(245, 255, 250));

        JLabel labelTitulo = new JLabel("Quiz Finalizado!");
        labelTitulo.setFont(new Font("Arial", Font.BOLD, 32));
        labelTitulo.setForeground(new Color(34, 139, 34));
        labelTitulo.setAlignmentX(Component.CENTER_ALIGNMENT);

        JLabel labelPontuacaoFinal = new JLabel("Pontuação Final: " +
                controlador.getPontuacao() + " pontos");
        labelPontuacaoFinal.setFont(new Font("Arial", Font.BOLD, 24));
        labelPontuacaoFinal.setAlignmentX(Component.CENTER_ALIGNMENT);

        JLabel labelDesempenho = new JLabel(String.format("Aproveitamento: %.1f%%",
                controlador.calcularDesempenho()));
        labelDesempenho.setFont(new Font("Arial", Font.PLAIN, 20));
        labelDesempenho.setAlignmentX(Component.CENTER_ALIGNMENT);

        JLabel labelFeedback = new JLabel(controlador.obterMensagemFeedback());
        labelFeedback.setFont(new Font("Arial", Font.ITALIC, 18));
        labelFeedback.setForeground(new Color(0, 100, 0));
        labelFeedback.setAlignmentX(Component.CENTER_ALIGNMENT);

        botaoReiniciar = new JButton("Jogar Novamente");
        botaoReiniciar.setFont(new Font("Arial", Font.BOLD, 18));
        botaoReiniciar.setBackground(new Color(34, 139, 34));
        botaoReiniciar.setForeground(Color.WHITE);
        botaoReiniciar.setAlignmentX(Component.CENTER_ALIGNMENT);
        botaoReiniciar.setFocusPainted(false);

        botaoReiniciar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controlador.reiniciarJogo();
                exibirTelaPergunta();
            }
        });

        painelCentral.add(Box.createVerticalGlue());
        painelCentral.add(labelTitulo);
        painelCentral.add(Box.createRigidArea(new Dimension(0, 30)));
        painelCentral.add(labelPontuacaoFinal);
        painelCentral.add(Box.createRigidArea(new Dimension(0, 15)));
        painelCentral.add(labelDesempenho);
        painelCentral.add(Box.createRigidArea(new Dimension(0, 30)));
        painelCentral.add(labelFeedback);
        painelCentral.add(Box.createRigidArea(new Dimension(0, 40)));
        painelCentral.add(botaoReiniciar);
        painelCentral.add(Box.createVerticalGlue());

        painelPrincipal.add(painelCentral, BorderLayout.CENTER);

        frame.setContentPane(painelPrincipal);
        frame.revalidate();
        frame.repaint();
    }
}
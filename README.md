📋 Sobre o Projeto
O Eco Quiz Metrópole é uma aplicação interativa que testa e aprimora o conhecimento dos usuários sobre práticas sustentáveis em ambientes urbanos. Através de perguntas de múltipla escolha, o jogo aborda temas como reciclagem, economia de água e energia, poluição urbana, mobilidade sustentável e consumo consciente.
✨ Características

🎮 Interface Gráfica Intuitiva: Desenvolvida com Java Swing
📚 Banco de Questões: Sistema com questões sobre diversos temas ambientais
🎲 Questões Aleatórias: Cada partida apresenta 20 questões selecionadas aleatoriamente
📊 Sistema de Pontuação: Feedback em tempo real e avaliação de desempenho
🏆 Níveis de Classificação: De "Iniciante" a "Mestre da Sustentabilidade"
♻️ Reinício Fácil: Possibilidade de jogar novamente sem reiniciar a aplicação

🎯 Categorias de Questões

♻️ Reciclagem e Gestão de Resíduos
💧 Economia de Água
⚡ Eficiência Energética
🌫️ Poluição Urbana
🚴 Mobilidade Sustentável
🛒 Consumo Consciente

🚀 Como Executar
Pré-requisitos

Java Development Kit (JDK) 8 ou superior
IDE Java (IntelliJ IDEA, Eclipse, NetBeans, etc.) ou terminal com javac

Opção 1: Usando IDE (IntelliJ IDEA)

Clone o repositório:

bashgit clone https://github.com/seu-usuario/eco-quiz-metropole.git

Abra o projeto no IntelliJ IDEA:

File → Open → Selecione a pasta do projeto


Execute a classe principal:

Abra JogoQuiz.java
Clique no ícone ▶️ verde ou pressione Shift+F10



Opção 2: Usando Terminal

Clone o repositório:

bashgit clone https://github.com/seu-usuario/eco-quiz-metropole.git
cd eco-quiz-metropole

Compile todos os arquivos:

bashjavac *.java

Execute o programa:

bashjava JogoQuiz
📁 Estrutura do Projeto
eco-quiz-metropole/
│
├── Questao.java              # Classe que representa uma questão
├── BancoQuestoes.java        # Gerenciamento do banco de questões (Singleton)
├── ControladorJogo.java      # Lógica de negócio do jogo
├── InterfaceGrafica.java     # Interface gráfica com Swing
├── JogoQuiz.java            # Classe principal (main)
└── README.md                # Este arquivo
🎓 Conceitos Aplicados
Programação Orientada a Objetos

✅ Encapsulamento: Atributos privados com getters/setters
✅ Abstração: Separação de responsabilidades em classes
✅ Modularização: Código organizado e reutilizável

Padrões de Projeto

🔧 Singleton: Implementado na classe BancoQuestoes
🎨 MVC (Model-View-Controller): Separação entre modelo, visão e controle

Boas Práticas

📝 Nomenclatura clara e descritiva
🔒 Uso de constantes para valores fixos
✔️ Validação de entrada do usuário
🎯 Métodos com responsabilidade única

🎮 Como Jogar

Tela Inicial: Clique em "Iniciar Quiz"
Durante o Jogo:

Leia a pergunta
Selecione uma das 4 alternativas (A, B, C ou D)
Clique em "Confirmar Resposta"
Receba feedback imediato (correto/incorreto)


Ao Final:

Visualize sua pontuação final
Veja seu nível de classificação
Opção de jogar novamente



📊 Sistema de Pontuação

✅ +10 pontos por resposta correta
❌ 0 pontos por resposta incorreta
🏆 Máximo: 200 pontos (20 questões × 10 pontos)

Níveis de Classificação
PontuaçãoNível0-60🌱 Nível Iniciante70-100📚 Nível Aprendiz110-140🌿 Nível Consciente150-180🛡️ Guardião Ambiental190-200🏆 Mestre da Sustentabilidade
🛠️ Tecnologias Utilizadas

Linguagem: Java
Interface Gráfica: Java Swing
Estruturas de Dados: ArrayList
Padrões: Singleton, Event Listeners

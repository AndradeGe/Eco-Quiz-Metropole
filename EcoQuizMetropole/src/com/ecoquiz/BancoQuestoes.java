import java.util.ArrayList;
import java.util.Random;

public class BancoQuestoes {
    private static BancoQuestoes instancia;
    private ArrayList<Questao> questoes;
    private Random random;

    private BancoQuestoes() {
        questoes = new ArrayList<>();
        random = new Random();
        inicializarQuestoes();
    }

    public static BancoQuestoes getInstance() {
        if (instancia == null) {
            instancia = new BancoQuestoes();
        }
        return instancia;
    }

    private void inicializarQuestoes() {
        // Categoria: Reciclagem e Gestão de Resíduos
        questoes.add(new Questao(
                "Qual é o tempo aproximado de decomposição de uma garrafa plástica no meio ambiente?",
                "A) 50 anos",
                "B) 100 anos",
                "C) 450 anos",
                "D) 10 anos",
                "C",
                "Reciclagem"
        ));

        questoes.add(new Questao(
                "Qual cor de lixeira é destinada ao descarte de plásticos segundo a coleta seletiva?",
                "A) Azul",
                "B) Verde",
                "C) Vermelha",
                "D) Amarela",
                "C",
                "Reciclagem"
        ));

        questoes.add(new Questao(
                "Pilhas e baterias devem ser descartadas em locais específicos porque contêm:",
                "A) Materiais biodegradáveis",
                "B) Metais pesados tóxicos",
                "C) Plástico reciclável",
                "D) Compostos orgânicos",
                "B",
                "Reciclagem"
        ));

        // Categoria: Economia de Água
        questoes.add(new Questao(
                "Uma torneira pingando pode desperdiçar aproximadamente quantos litros de água por dia?",
                "A) 5 litros",
                "B) 15 litros",
                "C) 46 litros",
                "D) 100 litros",
                "C",
                "Água"
        ));

        questoes.add(new Questao(
                "Qual é a forma mais eficiente de economizar água ao lavar louça?",
                "A) Deixar a torneira aberta durante toda a lavagem",
                "B) Ensaboar tudo com torneira fechada e enxaguar de uma vez",
                "C) Lavar peça por peça com água corrente",
                "D) Usar água quente constantemente",
                "B",
                "Água"
        ));

        // Categoria: Eficiência Energética
        questoes.add(new Questao(
                "Qual destes hábitos contribui mais para economia de energia elétrica?",
                "A) Deixar aparelhos em modo stand-by",
                "B) Usar lâmpadas incandescentes",
                "C) Desligar aparelhos da tomada quando não estão em uso",
                "D) Manter geladeira com borracha de vedação danificada",
                "C",
                "Energia"
        ));

        questoes.add(new Questao(
                "Qual tipo de lâmpada é mais eficiente e econômica?",
                "A) Incandescente",
                "B) Fluorescente compacta",
                "C) LED",
                "D) Halógena",
                "C",
                "Energia"
        ));

        // Categoria: Poluição Urbana
        questoes.add(new Questao(
                "Qual é o principal gás poluente emitido pelos veículos automotores?",
                "A) Oxigênio",
                "B) Monóxido de carbono",
                "C) Nitrogênio",
                "D) Hélio",
                "B",
                "Poluição"
        ));

        questoes.add(new Questao(
                "A inversão térmica, comum em grandes cidades, agrava a poluição porque:",
                "A) Aumenta a temperatura",
                "B) Impede a dispersão dos poluentes",
                "C) Aumenta as chuvas",
                "D) Reduz a umidade",
                "B",
                "Poluição"
        ));

        // Categoria: Mobilidade Sustentável
        questoes.add(new Questao(
                "Qual meio de transporte é considerado mais sustentável em grandes cidades?",
                "A) Carro individual",
                "B) Motocicleta",
                "C) Transporte público ou bicicleta",
                "D) Táxi",
                "C",
                "Mobilidade"
        ));

        // Categoria: Consumo Consciente
        questoes.add(new Questao(
                "O que significa a política dos 3Rs da sustentabilidade?",
                "A) Reciclar, Reutilizar e Reduzir",
                "B) Renovar, Replantar e Recuperar",
                "C) Reaproveitar, Reformar e Revender",
                "D) Reflorestar, Reconstruir e Reorganizar",
                "A",
                "Consumo"
        ));
    }

    public ArrayList<Questao> obterQuestoesAleatorias(int quantidade) {
        ArrayList<Questao> selecionadas = new ArrayList<>();
        ArrayList<Questao> copiaQuestoes = new ArrayList<>(questoes);

        for (int i = 0; i < quantidade && !copiaQuestoes.isEmpty(); i++) {
            int indiceAleatorio = random.nextInt(copiaQuestoes.size());
            selecionadas.add(copiaQuestoes.remove(indiceAleatorio));
        }

        return selecionadas;
    }

    public int getTotalQuestoes() {
        return questoes.size();
    }
}
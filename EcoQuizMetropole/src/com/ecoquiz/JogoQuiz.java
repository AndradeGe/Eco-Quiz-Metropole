import javax.swing.SwingUtilities;

public class JogoQuiz {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                ControladorJogo controlador = new ControladorJogo("Jogador");
                InterfaceGrafica interface_grafica = new InterfaceGrafica(controlador);
            }
        });
    }
}

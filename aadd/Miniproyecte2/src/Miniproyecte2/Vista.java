package Miniproyecte2;
import javax.swing.*;
import java.awt.*;

public class Vista extends JFrame {
    public JTextArea textOriginal;
    public JTextArea textResultant;
    public JTextField txtBuscar;
    public JTextField txtReemplaçar;
    public JButton btnBuscar;
    public JButton btnReemplaçar;

    public Vista() {
        setTitle("MiniProjecte MVC - Buscar i Reemplaçar");
        setSize(700, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Layout principal
        setLayout(new BorderLayout());

        // Àrea superior: text original
        textOriginal = new JTextArea(10, 50);
        textOriginal.setLineWrap(true);
        textOriginal.setWrapStyleWord(true);
        JScrollPane scrollOriginal = new JScrollPane(textOriginal);

        // Àrea inferior: text resultant
        textResultant = new JTextArea(10, 50);
        textResultant.setLineWrap(true);
        textResultant.setWrapStyleWord(true);
        JScrollPane scrollResultant = new JScrollPane(textResultant);

        // Panell central de text
        JPanel panelText = new JPanel(new GridLayout(2, 1));
        panelText.add(scrollOriginal);
        panelText.add(scrollResultant);

        // Panell de botons i camps
        JPanel panelBotons = new JPanel(new FlowLayout());
        txtBuscar = new JTextField(10);
        txtReemplaçar = new JTextField(10);
        btnBuscar = new JButton("Buscar");
        btnReemplaçar = new JButton("Reemplaçar");
        panelBotons.add(txtBuscar);
        panelBotons.add(btnBuscar);
        panelBotons.add(txtReemplaçar);
        panelBotons.add(btnReemplaçar);

        // Afegim tot al frame
        add(panelText, BorderLayout.CENTER);
        add(panelBotons, BorderLayout.SOUTH);
    }
}

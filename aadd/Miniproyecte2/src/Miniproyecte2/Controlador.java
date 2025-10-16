package Miniproyecte2;
import Miniproyecte2.Model;
import Miniproyecte2.Vista;
import javax.swing.*;
import java.awt.event.*;

public class Controlador implements ActionListener {
    private Model model;
    private Vista vista;
    private String textOriginal;

    public Controlador(Model model, Vista vista) {
        this.model = model;
        this.vista = vista;
        this.textOriginal = model.llegirFitxer();
        vista.textOriginal.setText(textOriginal);

        vista.btnBuscar.addActionListener(this);
        vista.btnReemplaçar.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vista.btnBuscar) {
            String paraula = vista.txtBuscar.getText();
            int comptador = model.comptarParaula(textOriginal, paraula);
            JOptionPane.showMessageDialog(vista, "La paraula '" + paraula + "' apareix " + comptador + " vegades.");
        }

        if (e.getSource() == vista.btnReemplaçar) {
            String buscar = vista.txtBuscar.getText();
            String reemplaçar = vista.txtReemplaçar.getText();
            String textNou = model.reemplaçarParaula(textOriginal, buscar, reemplaçar);
            vista.textResultant.setText(textNou);
            model.guardarFitxer(textNou);
        }
    }
}

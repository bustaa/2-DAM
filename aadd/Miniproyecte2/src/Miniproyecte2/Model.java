package Miniproyecte2;

import java.io.*;
import javax.swing.JOptionPane;

public class Model {
    private File fitxer;

    public Model(String rutaFitxer) {
        this.fitxer = new File(rutaFitxer);
    }

    public String llegirFitxer() {
        StringBuilder contingut = new StringBuilder();
        try (BufferedReader br = new BufferedReader(new FileReader(fitxer))) {
            String linia;
            while ((linia = br.readLine()) != null) {
                contingut.append(linia).append("\n");
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error en llegir el fitxer: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
        return contingut.toString();
    }

    public void guardarFitxer(String text) {
        String nouNom = fitxer.getParent() + File.separator + "reemplaçat_" + fitxer.getName();
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(nouNom))) {
            bw.write(text);
            JOptionPane.showMessageDialog(null, "Fitxer guardat com: " + nouNom);
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error en guardar el fitxer: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public int comptarParaula(String text, String paraula) {
        int comptador = 0;
        int index = text.indexOf(paraula);
        while (index != -1) {
            comptador++;
            index = text.indexOf(paraula, index + paraula.length());
        }
        return comptador;
    }

    public String reemplaçarParaula(String text, String buscar, String reemplaçar) {
        return text.replaceAll("\\b" + buscar + "\\b", reemplaçar);
    }
}

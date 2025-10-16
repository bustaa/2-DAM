package Miniproyecte2;
import Miniproyecte2.Model;
import Miniproyecte2.Vista;
import Miniproyecte2.Controlador;

public class Principal {
    public static void main(String[] args) {
        String ruta = "text.txt";

        Model model = new Model(ruta);
        Vista vista = new Vista();
        new Controlador(model, vista);
        vista.setVisible(true);
    }
}

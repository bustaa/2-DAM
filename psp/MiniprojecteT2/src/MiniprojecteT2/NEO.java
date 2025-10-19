package MiniprojecteT2;

public class NEO {
    private String nombre;
    private double posicio;
    private double velocitat;

    public NEO(String nombre, double posicio, double velocitat) {
        this.nombre = nombre;
        this.posicio = posicio;
        this.velocitat = velocitat;
    }

    public String getNombre() { return nombre; }
    public double getPosicio() { return posicio; }
    public double getVelocitat() { return velocitat; }
}

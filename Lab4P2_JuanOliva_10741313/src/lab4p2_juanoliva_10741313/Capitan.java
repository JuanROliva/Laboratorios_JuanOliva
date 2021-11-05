package lab4p2_juanoliva_10741313;
public class Capitan extends Soldado{
    private Arma arma;

    public Capitan() {
        super();
    }

    public Capitan(String nombre, int edad, int tiempo, String rango, int puntosVida) throws Exception {
        super(nombre, edad, tiempo, rango, puntosVida);
    }

    public Arma getArma() {
        return arma;
    }

    public void setArma(Arma arma) {
        this.arma = arma;
    }
    
    @Override
    public String toString() {
        return "Capitan: " + super.toString() + arma + '}';
    }

    @Override
    public void armas() {
        arma = new LanzaLlamas();
    }

    @Override
    public void ataque(Soldado s) {
    }
}

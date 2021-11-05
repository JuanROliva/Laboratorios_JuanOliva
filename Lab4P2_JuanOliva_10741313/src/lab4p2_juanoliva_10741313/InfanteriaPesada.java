package lab4p2_juanoliva_10741313;

public class InfanteriaPesada extends Soldado{
    private Arma arma;

    public InfanteriaPesada() {
        super();
    }

    public InfanteriaPesada(String nombre, int edad, int tiempo, String rango, int puntosVida) throws Exception {
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
        return "Soldado de Infateria Pesada: " + super.toString()+ arma + '}';
    }

    @Override
    public void armas() {
        arma = new Bomba();
    }
    
    @Override
    public void ataque(Soldado s) {
        
    }
    
}

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
        if (s instanceof Sargento) {
            s.disminuirVida((arma.getDamage()*1.15));
        }else{
            if (s instanceof InfanteriaPesada) {
                s.disminuirVida((arma.getDamage()*1.20));
            }else{
                if (s instanceof InfanteriaLigera) {
                    s.disminuirVida((arma.getDamage()*1.25));
                }else{
                    s.disminuirVida(arma.getDamage());
                }
            }
        }
    }
}

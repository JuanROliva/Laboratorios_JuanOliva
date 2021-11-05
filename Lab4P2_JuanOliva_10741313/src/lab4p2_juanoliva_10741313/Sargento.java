package lab4p2_juanoliva_10741313;

public class Sargento extends Soldado{
    private Arma arma;

    public Sargento() {
    }

    public Sargento(String nombre, int edad, int tiempo, String rango, int puntosVida) throws Exception {
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
        return "Sargento: " + super.toString() + arma + '}';
    }

    @Override
    public void armas() {
        arma = new Escopeta();
    }
    
    @Override
    public void ataque(Soldado s) {
        if (s instanceof InfanteriaLigera) {
            s.disminuirVida((arma.getDamage()*1.15));
        }else{
            if (s instanceof InfanteriaPesada) {
                s.disminuirVida((arma.getDamage()*1.10));
            }else{
                s.disminuirVida(arma.getDamage());
            }
        }
    }
}

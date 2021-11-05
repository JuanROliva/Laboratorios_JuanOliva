package lab4p2_juanoliva_10741313;

import java.util.ArrayList;

public class SuperSoldado extends Soldado{
    private ArrayList<Arma> listaArmas = new ArrayList();

    public SuperSoldado() {
        super();
    }

    public SuperSoldado(String nombre, int edad, int tiempo, String rango, int puntosVida) throws Exception {
        super(nombre, edad, tiempo, rango, puntosVida);
    }

    public ArrayList<Arma> getListaArmas() {
        return listaArmas;
    }

    public void setListaArmas(ArrayList<Arma> listaArmas) {
        this.listaArmas = listaArmas;
    }

    @Override
    public String toString() {
        String arma="";
        for (Arma temp : listaArmas) {
            arma += ((Arma)temp).getNombre()+" ";
        }
        return "Supersoldado: " + super.toString()+ "armas=" + arma + '}';
    }

    @Override
    public void armas() {
        listaArmas.add(new ArmaBlanca());
        listaArmas.add(new Bomba());
        listaArmas.add(new Escopeta());
        listaArmas.add(new LanzaLlamas());
    }

    @Override
    public void ataque(Soldado s) {
        
    }
}

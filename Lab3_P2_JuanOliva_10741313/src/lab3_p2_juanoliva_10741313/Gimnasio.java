package lab3_p2_juanoliva_10741313;

import java.util.ArrayList;

public class Gimnasio {
    String nombre,ciudad;
    int victorias,derrotas,dinero;
    ArrayList<Entrenador> Entrenadores = new ArrayList();
    Entrenador lider = new MaestroPokemon();

    public Gimnasio() {
        this.dinero = 10000;
    }

    public Gimnasio(String nombre, String ciudad, int victorias, int derrotas, int dinero) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.victorias = victorias;
        this.derrotas = derrotas;
        this.setDinero(dinero);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public int getVictorias() {
        return victorias;
    }

    public void setVictorias(int victorias) {
        this.victorias = victorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getDinero() {
        return dinero;
    }

    public void setDinero(int dinero) {
        if ((dinero%10000 == 0 )&& (dinero >= 10000 && dinero <= 100000)) {
            this.dinero = dinero;
        }else{
            if (dinero < 10000) {
                this.dinero = 10000;
            }else{
                if (dinero>100000) {
                    dinero=100000;
                }else{
                    int contador=1;
                    boolean ciclo = true;
                    while (ciclo) {
                        dinero=dinero-10000;
                        if (dinero>0) {
                            contador++;
                        }else{
                            break;
                        }
                    }
                    dinero = contador * 10000;
                }
            }
        }
        
    }

    public ArrayList<Entrenador> getEntrenadores() {
        return Entrenadores;
    }

    public void setEntrenadores(ArrayList<Entrenador> Entrenadores) {
        this.Entrenadores = Entrenadores;
    }

    public Entrenador getLider() {
        return lider;
    }

    public void setLider(Entrenador lider) {
        this.lider = lider;
    }

    @Override
    public String toString() {
        String lista ="Entrenador(es) = ";
        for (int i = 0; i < Entrenadores.size(); i++) {
            if(i<Entrenadores.size()-1){
                lista+=((Entrenador)Entrenadores.get(i)).getNombre()+ " , ";
            }else{
                lista+=((Entrenador)Entrenadores.get(i)).getNombre();
            }
        }
        return "Gimnasio{" + "nombre=" + nombre + ", ciudad=" + ciudad + ", victorias=" 
                + victorias + ", derrotas=" + derrotas + ", dinero=" + dinero + lista + ", lider=" + lider + '}';
    }
}

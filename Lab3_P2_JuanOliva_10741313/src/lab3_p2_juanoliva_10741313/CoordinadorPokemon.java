package lab3_p2_juanoliva_10741313;

import java.util.ArrayList;

public class CoordinadorPokemon extends Entrenador{
    private String tipo;
    ArrayList<Pokemon> listaPokemon = new ArrayList();

    public CoordinadorPokemon() {
        super();
        this.setTipo();
    }

    public CoordinadorPokemon(String nombre, int edad, char sexo) {
        super(nombre, edad, sexo);
        this.setTipo();
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo() {
        this.tipo = "Coordinador Pokemon";
    }

    public ArrayList<Pokemon> getListaPokemon() {
        return listaPokemon;
    }

    public void setListaPokemon(ArrayList<Pokemon> listaPokemon) {
        this.listaPokemon = listaPokemon;
    }
    
    @Override
    public String toString() {
        String lista = "";
        for (int i = 0; i < listaPokemon.size(); i++) {
            if (i<listaPokemon.size()-1) {
                lista += ((Pokemon)listaPokemon.get(i)).getNombre() + " , ";
            }else{
                lista += ((Pokemon)listaPokemon.get(i)).getNombre();
            }
        }
        return super.toString() + " tipo= " + tipo + " Pokemon(s): "+ lista;
    }
    
    public void agregarListaPokemon(Pokemon pokemon){
        listaPokemon.add(pokemon);
    }
}

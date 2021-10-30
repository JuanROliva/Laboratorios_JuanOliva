package lab3_p2_juanoliva_10741313;

import java.util.ArrayList;

public class EntrenadorNovato extends Entrenador{
    private String tipo;
    private ArrayList<Pokemon> listaPokemonDescubiertos = new ArrayList();
    private Pokemon pokemon;

    public EntrenadorNovato() {
        super();
        this.setTipo();
    }

    public EntrenadorNovato(Pokemon pokemon, String nombre, int edad, char sexo) {
        super(nombre, edad, sexo);
        this.setTipo();
        this.pokemon = pokemon;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo() {
        this.tipo = "Novato";
    }

    public ArrayList<Pokemon> getListaPokemonDescubiertos() {
        return listaPokemonDescubiertos;
    }

    public void setListaPokemonDescubiertos(ArrayList<Pokemon> listaPokemonDescubiertos) {
        this.listaPokemonDescubiertos = listaPokemonDescubiertos;
    }

    public Pokemon getPokemon() {
        return pokemon;
    }

    public void setPokemon(Pokemon pokemon) {
        this.pokemon = pokemon;
    }

    @Override
    public String toString() {
        String lista = "Pokemon descubiertos: ";
        for (int i = 0; i < listaPokemonDescubiertos.size(); i++) {
            if (i<listaPokemonDescubiertos.size()-1) {
                lista += ((Pokemon)listaPokemonDescubiertos.get(i)).getNombre() + " , ";
            }else{
                lista += ((Pokemon)listaPokemonDescubiertos.get(i)).getNombre();
            }
        }
        return super.toString() + " tipo=" + tipo + ", pokemon=" + pokemon + lista;
    }
    
    public void agregarPokemonDescubierto(Pokemon pokemon){
        listaPokemonDescubiertos.add(pokemon);
    }
}

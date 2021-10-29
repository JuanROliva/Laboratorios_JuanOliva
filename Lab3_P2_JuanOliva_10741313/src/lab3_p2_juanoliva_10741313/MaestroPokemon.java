package lab3_p2_juanoliva_10741313;

public class MaestroPokemon extends Entrenador {
    private String tipo;
    private int victorias;
    private Pokemon pokemon;

    public MaestroPokemon() {
        super();
        this.setTipo();
    }

    public MaestroPokemon(int victorias, Pokemon pokemon, String nombre, int edad, char sexo) {
        super(nombre, edad, sexo);
        this.setTipo();
        this.victorias = victorias;
        this.pokemon = pokemon;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo() {
        this.tipo = "Maestro Pokemon";
    }

    public int getVictorias() {
        return victorias;
    }

    public void setVictorias(int victorias) {
        this.victorias = victorias;
    }

    public Pokemon getPokemon() {
        return pokemon;
    }

    public void setPokemon(Pokemon pokemon) {
        this.pokemon = pokemon;
    }

    @Override
    public String toString() {
        return super.toString()+ "tipo=" + tipo + ", victorias=" + victorias + ", pokemon=" + pokemon;
    }
    
    
    
}

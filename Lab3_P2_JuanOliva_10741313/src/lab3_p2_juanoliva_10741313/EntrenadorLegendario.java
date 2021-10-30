package lab3_p2_juanoliva_10741313;

public class EntrenadorLegendario extends Entrenador{
    private String tipo;
    private Pokemon pokemon;

    public EntrenadorLegendario() {
        super();
        this.setTipo();
    }

    public EntrenadorLegendario(String nombre, int edad, char sexo) {
        super(nombre, edad, sexo);
        this.setTipo();
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo() {
        this.tipo = "Entrenador Legendario";
    }

    public Pokemon getLegendario() {
        return pokemon;
    }

    public void setLegendario(Pokemon pokemon) {
        this.pokemon = pokemon;
    }

    @Override
    public String toString() {
        return super.toString() + " tipo=" + tipo + ", Pokemon Legendario=" + pokemon + '}';
    }
    
}

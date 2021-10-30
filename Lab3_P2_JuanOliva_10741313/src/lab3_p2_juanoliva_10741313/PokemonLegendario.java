package lab3_p2_juanoliva_10741313;

public class PokemonLegendario extends Pokemon{
    private int cantidaVidas;

    public PokemonLegendario() {
        super();
        cantidaVidas = 2;
    }

    public PokemonLegendario(int cantidaVidas, String nombre, int ataque, int vida, String tipo) {
        super(nombre, ataque, vida, tipo);
        if (cantidaVidas > 2) {
            this.cantidaVidas = cantidaVidas;
        }else{
            this.cantidaVidas = 2;
        }
        
    }

    public int getCantidaVidas() {
        return cantidaVidas;
    }

    public void setCantidaVidas(int cantidaVidas) {
        this.cantidaVidas = cantidaVidas;
    }

    @Override
    public String toString() {
        return  super.toString()+ " " + "cantidaVidas=" + cantidaVidas;
    }
    
    
    
    
    
    
}

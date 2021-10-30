package lab3_p2_juanoliva_10741313;

public class Pokemon {
    private String nombre;
    private int ataque;
    private int vida;
    private String tipo;

    public Pokemon() {
        this.ataque = 100;
        this.vida = 200;
    }

    public Pokemon(String nombre, int ataque, int vida, String tipo) {
        this.nombre = nombre;
        this.setAtaque(ataque);
        this.setVida(vida);
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        if (ataque < 100) {
            this.ataque = 100;
        }else{
            if (ataque >= 100 && ataque <= 200) {
                this.ataque = ataque;
            }else{
                ataque = 200;
            }
        }
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        if (vida < 200) {
            vida = 200;
        }else{
            if (vida >=200 && vida <=500) {
                this.vida = vida;
            }else{
                vida = 500;
            }
        }
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Pokemon: " + "nombre=" + nombre + ", ataque=" + ataque + ", vida=" + vida + ", tipo=" + tipo;
    }
    
    
}

package lab4p2_juanoliva_10741313;
public class Arma {
    private String nombre;
    private int damage;

    public Arma() {
    }

    public Arma(String nombre, int damage) {
        this.nombre = nombre;
        this.damage = damage;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    @Override
    public String toString() {
        return "Arma => " + "nombre=" + nombre + ", damage=" + damage;
    }
    
    
    
}

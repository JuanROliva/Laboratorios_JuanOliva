package lab4p2_juanoliva_10741313;
public abstract class Soldado {
    private String nombre;
    private int edad;
    private int tiempo;
    private String rango;
    private int puntosVida;

    public Soldado() {
    }

    public Soldado(String nombre, int edad, int tiempo, String rango, int puntosVida) throws Exception {
        this.nombre = nombre;
        this.edad = edad;
        this.tiempo = tiempo;
        this.rango = rango;
        this.setPuntosVida(puntosVida);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    public String getRango() {
        return rango;
    }

    public void setRango(String rango) {
        this.rango = rango;
    }

    public int getPuntosVida() {
        return puntosVida;
    }

    public void setPuntosVida(int puntosVida) throws Exception {
        if (puntosVida>=100 && puntosVida<=400) {
            this.puntosVida=puntosVida;
        }else{
            throw new Exception("El valor ingresado no es permitido");
        }
    }

    @Override
    public String toString() {
        return "nombre=" + nombre + ", edad=" + edad + ", tiempo=" + tiempo + ", rango=" + rango + ", puntosVida=" + puntosVida;
    }
    
    public void disminuirVida(int damage){
        puntosVida = puntosVida - damage;
        if (puntosVida<0) {
            puntosVida = 0;
        }
    }
    
    public abstract void armas();
    
    public abstract void ataque(Soldado s);
    
}

package lab3_p2_juanoliva_10741313;
public class Entrenador {
    private String nombre;
    private int edad;
    private char sexo;

    //Contructor
    public Entrenador() {
    }

    public Entrenador(String nombre, int edad, char sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
    }

    //mutadores
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public char getSexo() {
        return sexo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSexo(char sexo) {
        if (sexo == 'F' || sexo == 'M') {
            this.sexo = sexo;
        }else{
            this.sexo = 'F';
        }
    }

    @Override
    public String toString() {
        return "Entrenador:" + "nombre=" + nombre + ", edad=" + edad + ", sexo=" + sexo;
    }
    
    
}

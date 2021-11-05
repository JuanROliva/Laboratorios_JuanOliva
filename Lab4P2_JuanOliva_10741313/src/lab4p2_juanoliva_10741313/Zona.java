package lab4p2_juanoliva_10741313;
public class Zona {
    private String nombre;
    private int size;
    private int cX;
    private int cY;

    public Zona() {
    }

    public Zona(String nombre, int size, int cX, int cY) throws Exception {
        this.nombre = nombre;
        this.setSize(size);
        this.setcX(cX);
        this.setcY(cY);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) throws Exception {
        if (size>=100 && size<=300) {
            this.size = size;
        }else{
            throw new Exception("El valor ingresado no es permitido");
        }
    }

    public int getcX() {
        return cX;
    }

    public void setcX(int cX) throws Exception {
        if (cX>=100 && cX<=300) {
            this.cX = cX;
        }else{
            throw new Exception("El valor ingresado no es permitido");
        }
        
    }

    public int getcY() {
        return cY;
    }

    public void setcY(int cY) throws Exception {
        if (cY>=100 && cY<=300) {
            this.cY = cY;
        }else{
            throw new Exception("El valor ingresado no es permitido");
        }
    }
}

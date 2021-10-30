package lab3_p2_juanoliva_10741313;
import java.util.Scanner;
import java.util.ArrayList;

public class Lab3_P2_JuanOliva_10741313 {

    static Scanner lea = new Scanner(System.in);
    static ArrayList<Gimnasio> ListaGimnasios = new ArrayList<Gimnasio>();
    
    public static void main(String[] args) {
        char ciclo = 's';
        encabezado();
        while (ciclo=='s') {
            char opc = menu();
            switch (opc) {
                case '1':
                    agregarGimnasio();
                    break;
                case '2':
                    ciclo = 'n';
                    break;
                default:
                    ciclo = 'n';
                    break;
            }
        }
    }
    
    public static void encabezado(){
        System.out.println("---------------------------------------------------------");
        System.out.println("  Universidad Tecnologica Centromericana");
        System.out.println("  Laboratorio de Progrmacion 2 - No. 3");
        System.out.println("  Alumno: Juan Rafael Oliva - 10741313");
    }
    
    public static char menu(){
        System.out.println("---------------------------------------------------------");
        System.out.println("  1. Crear un Gimnasio");
        System.out.println("  2. Luchar");
        System.out.println("  3. Agregar entrenadores a un Gimnasio");
        System.out.println("  4. Agregar pokemons");
        System.out.println("  5. Luchas");
        System.out.println("  6. Salir");
        System.out.print("Seleccion la opccion que desea ejecutar: ");
        return lea.next().charAt(0);
    }
    
    public static void agregarGimnasio(){
        Gimnasio nGimnasio = new Gimnasio();
        System.out.print("  Ingrese el nombre del Gimanasio: ");
        nGimnasio.setNombre(lea.next());
        System.out.print("  Ingrese el ciudad del Gimanasio: ");
        nGimnasio.setCiudad(lea.next());
        System.out.print("  Ingrese el nombre del lider del Gimanasio: ");
        nGimnasio.lider.setNombre(lea.next());
        System.out.print("  Ingrese la cantidad de dinero");
        nGimnasio.setDinero(lea.nextInt());
        ListaGimnasios.add(nGimnasio);
    }
}

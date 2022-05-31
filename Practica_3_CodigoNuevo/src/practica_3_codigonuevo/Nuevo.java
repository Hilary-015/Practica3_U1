package practica_3_codigonuevo;

import java.util.Scanner;

/**
 *
 * @author Hilary Madeley Calva Camacho
 */
public class Nuevo {

    private String salida;

    public Nuevo() {
        final int OVERFLOW = 200000000;
        StringBuilder valor = new StringBuilder(OVERFLOW);

        if (valor(OVERFLOW, valor) == true) {
            this.salida = "";
        } else {
            this.salida = valor.toString();
            this.salida="";
        }
    }

    public Boolean valor(int tamanio, StringBuilder valor) {
        Boolean verificar = false;        
        for (int i = 0; i < tamanio; i++) {
            try {
                valor.append("a");
                verificar = true;
            } catch (OutOfMemoryError e) {
                e.printStackTrace();
                break;
            }
        }
        return verificar;
    }

    public String getSalida() {
        return salida;
    }

    public static void main(String[] args) {
        Nuevo javaHeapTest = new Nuevo();
        System.out.println(javaHeapTest.getSalida().length());
        Scanner sc = new Scanner(System.in);
        System.out.println("Presione cualquier numero");
        sc.nextInt();
    }
}

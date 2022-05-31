
package practica_3_nuevoOpcion2;

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
        for (int i = 0; i < OVERFLOW; i++) {
            try {
                valor.append("a");
            } catch (OutOfMemoryError e) {
                e.printStackTrace();
                break;
            }
        }
        this.salida = valor.toString();
        this.salida = "";
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

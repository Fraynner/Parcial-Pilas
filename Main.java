import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        boolean continuar = true;
        Stack<Producto> pila = new Stack<>();
        int opt2 = 0;
        Scanner sc = new Scanner(System.in);
        Metodos m = new Metodos();
        int opt = 0;
        while (continuar) {
            System.out.println(
                    "Ingrese 1 si desea ingresar producto, 2 si desea modificar un producto, 3 si desea comprar un producto");
            opt = sc.nextInt();
            switch (opt) {
                case 1:
                    m.RegistrarProducto(pila);
                    break;

                case 2:
                    m.modificarProductos(pila);
                    break;
                case 3:
                    pila = m.eliminarProducto(pila);
                default:
                    System.out.println("Opcion no valida  ");
                    break;

            }
            System.out.println("Desea continuar otra accion 1: si, 2:no");
            opt2 = sc.nextInt();
            if (opt2 == 2) {
                continuar = false;
            }
        }
    }
}

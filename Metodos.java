import java.util.Scanner;
import java.util.Stack;

import javax.lang.model.element.ModuleElement.ProvidesDirective;

public class Metodos {
    Scanner sc = new Scanner(System.in);

    public Stack<Producto> RegistrarProducto(Stack<Producto> producto) {
        boolean bandera = true;
        boolean existe = false;
        while (bandera) {
            Producto p = new Producto();
            System.out.println("Ingrese el nombre de el producto: ");
            p.setNombre(sc.next());
            System.out.println("Ingrese la referencia de el producto: ");
            p.setReferencia(sc.nextInt());
            System.out.println("Ingrese el precio: ");
            p.setPrecio(sc.nextDouble());
            System.out.println("Ingrese la cantidad: ");
            p.setCantidad(sc.nextInt());
            producto.push(p);
            System.out.println("Desea registrar mas productos 1 Si, 2 No");
            while (!sc.hasNextInt()) {
                System.out.println("Dato numerico por favor: ");
                sc.next();
            }
            int opt = sc.nextInt();
            while (opt < 1 || opt > 2) {
                System.out.println("Opcion no valida intente de nuevo .-.");
                opt = sc.nextInt();
            }
            if (opt == 2) {
                bandera = false;
            }

        }
        return producto;
    }

    public void MostrarProducto(Stack<Producto> pila) {
        for (Producto p : pila) {
            System.out.println(p.getNombre());
            System.out.println(p.getReferencia());
            System.out.println(p.getPrecio());
            System.out.println(p.getCantidad());
        }
    }

    public void modificarProductos(Stack<Producto> pila) {
        int referencia = 0;
        System.out.println("Ingrese la referencia de el producto : ");
        referencia = sc.nextInt();
        for (Producto p : pila) {
            if (p.getReferencia() == (referencia)) {

                System.out.println("Ingrese el nuevo precio: ");
                p.setPrecio(sc.nextDouble());
                System.out.println("Ingrese la nueva cantidad: ");
                p.setCantidad(sc.nextInt());
            }

        }
        MostrarProducto(pila);
    }

    public Stack<Producto> eliminarProducto(Stack<Producto> pila) {
        for (Producto producto : pila) {
            System.out.println("Ingrese la referencia de el producto que desea comprar: ");
            int referencia = sc.nextInt();
            if (referencia == producto.getReferencia()) {
                producto.setCantidad(producto.getCantidad() - 1);
            }
        }
        return pila;
    }

}

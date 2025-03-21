public class Producto{
private int referencia;
private int cantidad;
private double precio;
private String nombre;

public Producto(int referencia, int cantidad, double precio, String nombre) {
    this.referencia = referencia;
    this.cantidad = cantidad;
    this.precio = precio;
    this.nombre = nombre;
}
public Producto() {
}
public int getReferencia() {
    return referencia;
}
public void setReferencia(int referencia) {
    this.referencia = referencia;
}
public int getCantidad() {
    return cantidad;
}
public void setCantidad(int cantidad) {
    this.cantidad = cantidad;
}
public double getPrecio() {
    return precio;
}
public void setPrecio(double precio) {
    this.precio = precio;
}
public String getNombre() {
    return nombre;
}
public void setNombre(String nombre) {
    this.nombre = nombre;
}

}
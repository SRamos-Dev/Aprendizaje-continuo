package Metodos;

public class Producto {
    /*Crea una clase Producto con:
    *Atributos: nombre, precio, cantidad.
    *Métodos: mostrarInfo(), aplicarDescuento(double porcentaje).
    *Prueba la clase en un main.
    */
    
    private String nombre;
    private double precio;
    private int cantidad;

    public Producto(String nombre, double precio, int cantidad){
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public String getNombre(){
        return nombre;
    }
    public double getPrecio(){
        return precio;
    }
    public int getCantidad(){
        return cantidad;
    }
    
    public void setNombre(String nuevoNombre){
        this.nombre = nuevoNombre;
    }
    public void setPrecio(double nuevoPrecio){
        this.precio = nuevoPrecio;
    }
    public void setCantidad(int nuevaCantidad){
        this.cantidad = nuevaCantidad;
    }

    public void mostrarInfo(){
        System.out.println("Nombre: "+nombre);
        System.out.println("Precio: "+precio);
        System.out.println("Cantidad: "+cantidad);
    }

    public void aplicarDescuento(int porcentaje){
        precio = precio - (precio * porcentaje / 100);
    }

    public static void main(String[] args) {
        Producto producto1 = new Producto("Helado", 25, 1);
        Producto producto2 = new Producto("Lavadora", 2000, 1);

        producto1.mostrarInfo();
        producto2.mostrarInfo();
        producto2.aplicarDescuento(10);
        producto2.mostrarInfo();
    }
}
    
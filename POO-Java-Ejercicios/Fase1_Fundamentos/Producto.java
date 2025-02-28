
public class Producto {

    //Ejercicio 2: Clase Producto con sobrecarga de constructores (vacío, con nombre y precio, con todos los atributos).

    // 1. Atributos privados
    private String nombre;
    private double precio;
    private int cantidad;
    
    // 2. Constructor para inicializar el producto vacio
    public Producto(){
        this.nombre = "";
        this.precio = 0.0;
        this.cantidad = 0;
    }

    // 3. Constructor para inicializar el producto con nombre y precio
    public Producto(String nombre, double precio){
        this.nombre = nombre;
        this.precio = precio;
    }

    // 4. Constructor para inicializar el producto con todos los atributos
    public Producto(String nombre, double precio, int cantidad){
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    // 5. Getters
    public String getNombre(){
        return nombre;
    }
    public double getPrecio(){
        return precio;
    }
    public int getCantidad(){
        return cantidad;
    }

    // 6. Setters
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setPrecio(double precio){
        this.precio = precio;
    }
    public void setCantidad(int cantidad){
        this.cantidad = cantidad;
    }

    // 6. Metodo para mostrar la informacion del producto
    public void mostrarInfo(){
        System.out.println("Nombre: "+nombre);
        System.out.println("Precio: "+precio);
        System.out.println("Cantidad: "+cantidad);
    }
}
        

public class CuentaBancaria {
    
    /*Ejercicio 3: Clase CuentaBancaria con atributos privados y getters/setters.*/
    private int numeroCuenta;
    private String nombre;
    private double saldo;

    public CuentaBancaria(int numeroCuenta, String nombre, double saldo){
        this.numeroCuenta = numeroCuenta;
        this.nombre = nombre;
        this.saldo = saldo;
    }

    public int getNumeroCuenta(){
        return numeroCuenta;
    }
    public String getNombre(){
        return nombre;
    }
    public double getSaldo(){
        return saldo;
    }

    public void setNumeroCuenta(int numeroCuenta){
        this.numeroCuenta = numeroCuenta;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setSaldo(double saldo){
        this.saldo = saldo;
    }

    public void mostrarInfo(){
        System.out.println("Numero de cuenta: "+numeroCuenta);
        System.out.println("Nombre del titular: "+nombre);
        System.out.println("Saldo actual: "+saldo);
    }
}
        
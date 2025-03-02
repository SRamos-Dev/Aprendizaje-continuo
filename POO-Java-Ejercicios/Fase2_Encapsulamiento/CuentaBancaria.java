
public class CuentaBancaria {
    
    /*Ejercicio 3: Clase CuentaBancaria con atributos privados y getters/setters.*/
    private String nombre;
    private String iban;
    private int numeroContrato;
    private double saldo;

    public CuentaBancaria(String nombre, String iban, int numeroContrato, double saldo){
        this.nombre = nombre;
        this.iban = iban;
        this.numeroContrato = numeroContrato;
        this.saldo = saldo;
    }

    public String getNombre(){
        return nombre;
    }
    public String getIban(){
        return iban;
    }
    public int getNumeroContrato(){
        return numeroContrato;
    }
    public double getSaldo(){
        return saldo;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setIban(String iban){
        this.iban = iban;
    }
    public void setNumeroContrato(int numeroContrato){
        this.numeroContrato = numeroContrato;
    }
    public void setSaldo(double saldo){
        this.saldo = saldo;
    }
    
    public void mostrarInfo(){
        System.out.println("Nombre: "+nombre);
        System.out.println("IBAN: "+iban);
        System.out.println("Contrato: "+numeroContrato);
        System.out.println("Saldo: "+saldo);
    }

}
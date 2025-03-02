public class Coche implements OperacionesVehiculo{
/* Clase Coche que implementa la interfaz. */

    // Atributos
    private String marca;
    private String modelo;
    private int velocidad;

    // Constructor
    public Coche(String marca, String modelo, int velocidad){
        this.marca = marca;
        this.modelo = modelo;
        this.velocidad = 0; // Por defecto el vehiculo inicia detenido
    }

    // Implementación de los métodos de la interfaz
    @Override
    public void acelerar(){
        velocidad += 10;
        System.out.println("El coche ha acelerado. Velocidad actual: "+velocidad+" km/h");
    }
    @Override
    public void frenar(){
        if(velocidad >=10){
            velocidad -=10;
        }else{
            velocidad = 0;
        }
        System.out.println("El coche ha frenado. Velocidad actual: "+velocidad+" km/h");
    }
    @Override
    public void girar(){
        System.out.println("El coche ha girado.");
    }
    
    public String getMarca(){
        return marca;
    }
    public String getModelo(){
        return modelo;
    }
    public int getVelocidad(){
        return velocidad;
    }

    public void setMarca(String marca){
        this.marca = marca;
    }
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    public void setVelocidad(int velocidad){
        this.velocidad = velocidad;
    }

    public void mostrarInfo(){
        System.out.println("Marca: "+marca);
        System.out.println("Modelo: "+modelo);
        System.out.println("Velocidad"+velocidad);
    }

}

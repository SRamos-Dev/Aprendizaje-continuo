package Interfaces;

public class Moto implements Vehiculo{

    private String marca;
    private String modelo;
    private int velocidad;

    public Moto(String marca, String modelo, int velocidad){
        this.marca = marca;
        this.modelo = modelo;
        this.velocidad = 0;
    }

    @Override
    public void acelerar(){
        velocidad += 10;
        System.out.println("La moto ha acelerado. Su velocidad actual es de: "+velocidad+" km/h");
    }
    @Override
    public void frenar(){
        if(velocidad > 0){
            velocidad -= 10;
            System.out.println("La moto ha frenado. Su velocidad actual es de: "+velocidad+" km/h");
        }else{
            System.out.println("La moto está detenida");
        }
    }
    @Override
    public void mostrarInfo(){
        System.out.println("Marca: "+marca);
        System.out.println("Modelo: "+modelo);
        System.out.println("Velocidad: "+velocidad);
    }

    public static void main(String[] args) {
        Moto moto = new Moto("Yamaha", "FZ", 0);
        moto.mostrarInfo();
        moto.acelerar();
        moto.mostrarInfo();
        moto.frenar();
        moto.frenar();
    }
}
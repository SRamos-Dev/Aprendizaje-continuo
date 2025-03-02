public class Rectangulo extends Figura{

    private double largo;
    private double ancho;

    public Rectangulo(double largo, double ancho){
        this.largo = largo;
        this.ancho = ancho;
    }
    @Override
    public double calcularArea(){
        return largo * ancho;
    }

}

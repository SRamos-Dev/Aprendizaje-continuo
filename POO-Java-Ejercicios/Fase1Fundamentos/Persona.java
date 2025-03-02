package Fase1Fundamentos;

public class Persona {
    
    //Ejercicio 1: Clase Persona con nombre, edad, correo y métodos para mostrar y actualizar el correo.

    // 1. Atributos privados (buenas prácticas: encapsulación)
    private String nombre;
    private int edad;
    private String correo;

    // 2. Constructor para inicializar la persona
    public Persona(String nombre, int edad, String correo){
        this.nombre = nombre;
        this.edad = edad;
        this.correo = correo;
    }

    // 3. Método para mostrar los datos de la persona
    public void mostrarInfo(){
        System.out.println("Nombre: "+nombre);
        System.out.println("Edad: "+edad);
        System.out.println("Correo: "+correo);
    }

    // 4. Método para actualizar el correo
    public void actualizarCorreo(String nuevoCorreo){
        this.correo = nuevoCorreo;
        System.out.println("Correo actualizado correctamente.");
    }

    // 5. Getters (opcionales, si los quieres para otros fines)
    public String getNombre(){
        return nombre;
    }
    public int getEdad(){
        return edad;
    }
    public String getCorreo(){
        return correo;
    }

    // 6. Setter de correo (otra forma de actualizarlo si prefieres)
    public void correo(String correo){
        this.correo = correo;
    }

    // Método main de prueba
    public static void main(String[] args) {
        
    // Crear un objeto de tipo Persona
        Persona persona = new Persona("Sergio Ramos", 28, "sergioramos@gmail.com");

    // Mostrar datos iniciales
        persona.mostrarInfo();

    // Actualizar el correo
        persona.actualizarCorreo("sergio.ramos@gmail.com");

    // Mostrar datos actualizados
        persona.mostrarInfo();
    }
}
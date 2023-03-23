package patronesdisenotercerparcial.ejercicios.bridge;

public class Paquete {
    private String nombre;
    private double peso;
    private double precio;
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public Paquete(String nombre, double peso, double precio) {
        this.nombre = nombre;
        this.peso = peso;
        this.precio = precio;
    }

    public void show(){
        System.out.println("--------------PAQUETE----------");
        System.out.println("NOMBRE: "+nombre);
        System.out.println("PESO: "+peso);
        System.out.println("PRECIO: "+precio);
    }
    
}

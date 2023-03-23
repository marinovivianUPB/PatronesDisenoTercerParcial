package patronesdisenotercerparcial.ejercicios.bridge;

public class Mar implements MetodoEnvio{

    private double incremento = 25;

    @Override
    public double getIncremento() {
        return incremento;
    }

    @Override
    public void show() {
        System.out.println("ENVIO POR MAR");
        System.out.println("EL INCREMENTO ES DEL: "+incremento+"%");
        
    }
    
}

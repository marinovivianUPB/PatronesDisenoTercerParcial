package patronesdisenotercerparcial.ejercicios.bridge;

public class Tierra implements MetodoEnvio{

    private double incremento = 5;

    @Override
    public double getIncremento() {
        return incremento;
    }

    @Override
    public void show() {
        System.out.println("ENVIO POR TIERRA");
        System.out.println("EL INCREMENTO ES DEL: "+incremento+"%");
        
    }
    
}

package patronesdisenotercerparcial.ejercicios.bridge;

public class Aire implements MetodoEnvio{

    private double incremento = 10;

    @Override
    public double getIncremento() {
        
        return incremento;
    }

    @Override
    public void show() {
        System.out.println("ENVIO POR AIRE");
        System.out.println("EL INCREMENTO ES DEL: "+incremento+"%");
        
    }

    
    
}

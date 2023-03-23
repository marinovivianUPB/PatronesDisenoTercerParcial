package patronesdisenotercerparcial.ejercicios.bridge;

public class EmpresaSRL implements Empresa {

    private Paquete paquete;
    private MetodoEnvio metodoEnvio;


    
    public EmpresaSRL(Paquete paquete, MetodoEnvio metodoEnvio) {
        this.paquete = paquete;
        this.metodoEnvio = metodoEnvio;
    }

    @Override
    public void envioPaquete() {
        System.out.println("---------------------------------------------");
        System.out.println("EMPRESA SRL ENVIANDO PAQUETE.....");
        metodoEnvio.show();
        double aux = metodoEnvio.getIncremento();
        paquete.setPrecio(paquete.getPrecio()+(paquete.getPrecio()*aux/100));
        paquete.show();
    }

    @Override
    public void setPaquete(Paquete paquete) {
        this.paquete = paquete;
    }

    public Paquete getPaquete() {
        return paquete;
    }

    
    
}

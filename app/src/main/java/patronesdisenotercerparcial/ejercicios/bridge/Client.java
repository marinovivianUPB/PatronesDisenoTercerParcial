package patronesdisenotercerparcial.ejercicios.bridge;

public class Client {
    public static void main(String[] args) {

        EmpresaSA sa = new EmpresaSA(new Paquete("Mundito", 60, 100), new Aire());
        EmpresaSRL srl = new EmpresaSRL(new Paquete("HolaMundo", 40, 100), new Mar());

        
        sa.envioPaquete();
 //////////
        srl.envioPaquete();
    }
}

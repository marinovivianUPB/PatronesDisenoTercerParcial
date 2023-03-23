package patronesdisenotercerparcial.ejercicios.proxy;

public class Proxy implements IServidor {

    private Servidor primo = new Servidor(1);
    private Servidor noPrimo = new Servidor(2);

    @Override
    public void login(Usuario usuario) {
        System.out.println("---------------------------------------");
        if(isPrime(usuario.getId())){
            System.out.println("TRANSFIRIENDO A SERVIDOR DE PRIMOS...");
            primo.login(usuario);
        } else{
            System.out.println("TRANSFIRIENDO A SERVIDOR DE NO PRIMOS...");
            noPrimo.login(usuario);
        }
    }

    private boolean isPrime(int n){

        if(n==1){
            return false;
        }

        boolean prime = true;
        for(int i=2; i<= n/2; i++){
            if(n%i==0){
                prime = false;
                break;
            }
        }
        return prime;
    }
    
}

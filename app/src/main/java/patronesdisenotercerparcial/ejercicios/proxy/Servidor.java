package patronesdisenotercerparcial.ejercicios.proxy;

import java.util.HashMap;
import java.util.Map;

public class Servidor implements IServidor  {

    private Map<Integer, Usuario> usuarios = new HashMap<>();
    private int numero;

    

    public Servidor(int numero) {
        this.numero = numero;
    }


    @Override
    public void login(Usuario usuario) {
        usuarios.put(usuario.getId(), usuario);
        System.out.println("------------------------------------------------------");
        System.out.println("EL SERVIDOR "+numero+" GUARDO AL SIGUIENTE USUARIO: ");
        usuario.show();
    }
    
}

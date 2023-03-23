package patronesdisenotercerparcial.ejercicios.proxy;

public class Client {
    public static void main(String[] args) {
        Proxy proxy = new Proxy();
        proxy.login(new Usuario("Juan Mandela", "js123", 12));
        proxy.login(new Usuario("Alan Orozco", "adkjhasdj2", 13));
        proxy.login(new Usuario("Alejandro Torrico", "adhdgyy2143", 11));
        proxy.login(new Usuario("Javier Orinoca", "adkjhasdj2", 53));
    }
}

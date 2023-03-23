package patronesdisenotercerparcial.ejercicios.proxy;

public class Usuario {
    private String nombre;
    private String password;
    private int id;

    

    public Usuario(String nombre, String password, int id) {
        this.nombre = nombre;
        this.password = password;
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public void show(){
        System.out.println("-----------------------------------");
        System.out.println("ID: "+id);
        System.out.println("NOMBRE: "+nombre);
    }

    
}

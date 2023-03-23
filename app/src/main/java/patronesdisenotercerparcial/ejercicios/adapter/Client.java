package patronesdisenotercerparcial.ejercicios.adapter;

public class Client {
    public static void main(String[] args) {
        AutoGasolina a = new AutoGasolina("AK46", "Patito");
        a.llenarGasolina(101);
        a.llenarGasolina(100);
        a.show();
        a.show(); //para comprobar que estado de gasolina es randomico

        AdaptadorElectrico b = new AdaptadorElectrico(new AutoElectrico("AK7", "Patito"));
        b.llenarGasolina(99);
        b.llenarGasolina(98);
        b.show();
        b.show();
    }
}

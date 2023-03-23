package patronesdisenotercerparcial.ejercicios.adapter;

import java.util.Random;

public abstract class AutomovilElectrico {
    private double bateria;
    private String marca;
    private String modelo;
    private String tipo;

    

    public AutomovilElectrico( String marca, String modelo, String tipo) {
        this.marca = marca;
        this.modelo = modelo;
        this.tipo = tipo;
    }
    public double getBateria() {
        return bateria;
    }
    public void setBateria(double bateria) {
        this.bateria = bateria;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void cargarBateria(){
        this.setBateria((new Random().nextInt(51))*2);
    }

    public int estadoDeElectricidad(){
        return (new Random().nextInt(11)+1);
    }

    public void show(){
        System.out.println("-------------"+tipo+"---------------");
        System.out.println("MARCA: "+marca+" MODELO: "+modelo);
        System.out.println("BATERIA: "+bateria);
        System.out.println("ESTADO DE ELECTRICIDAD: "+this.estadoDeElectricidad());
    }
    
}

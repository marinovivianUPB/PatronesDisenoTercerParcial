package patronesdisenotercerparcial.ejercicios.adapter;

import java.util.Random;

public abstract class Automovil implements IAdapter{
    private double capacidad;
    private String modelo;
    private String marca;
    private String tipo; 
    
    public double getCapacidad() {
        return capacidad;
    }
    public void setCapacidad(double capacidad) {
        this.capacidad = capacidad;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public Automovil(String modelo, String marca, String tipo) {
        this.modelo = modelo;
        this.marca = marca;
        this.tipo = tipo;
    }
    @Override
    public int estadoDelCombustible() {
        return (new Random().nextInt(101)+1);
    }
    @Override
    public void llenarGasolina(int capacidad) {
        if(capacidad >= 0 && capacidad <=100 ){
            this.setCapacidad(capacidad);
        } else{
            System.out.println("------------------------");
            System.out.println("EL TANQUE NO PERMITE ESA CAPACIDAD");
        }
        
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void show(){
        System.out.println("-----------------"+tipo+"-------------------");
        System.out.println("MODELO: "+modelo);
        System.out.println("MARCA: "+marca);
        System.out.println("CAPACIDAD: "+this.getCapacidad());
        System.out.println("ESTADO DEL COMBUSTIBLE: "+this.estadoDelCombustible());
    }

    
}

package patronesdisenotercerparcial.ejercicios.adapter;

public class AdaptadorElectrico implements IAdapter {

    private AutomovilElectrico automovilElectrico;

    

    public AdaptadorElectrico(AutomovilElectrico automovilElectrico) {
        this.automovilElectrico = automovilElectrico;
    }

    @Override
    public int estadoDelCombustible() {
        return automovilElectrico.estadoDeElectricidad();
    }

    @Override
    public void llenarGasolina() {
        automovilElectrico.cargarBateria();
    }

    @Override
    public void show() {
        automovilElectrico.show();
    }
    
}

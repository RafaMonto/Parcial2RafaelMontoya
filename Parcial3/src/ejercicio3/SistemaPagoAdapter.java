package ejercicio3;

public class SistemaPagoAdapter extends NuevoSistemaPagoOperacion {
    private AntiguoSistemaPago antiguoSistemaPago;

    public SistemaPagoAdapter(AntiguoSistemaPago antiguoSistemaPago) {
        this.antiguoSistemaPago = antiguoSistemaPago;
    }

    @Override
    public void crearSesion(NuevoSistemaPago nuevoSistemaPago) {
        antiguoSistemaPago.iniciarSesion(nuevoSistemaPago.getNombre());
    }

    @Override
    public void validarCorreo(NuevoSistemaPago nuevoSistemaPago) {
        antiguoSistemaPago.comprobarCorreo(nuevoSistemaPago.getCorreo());
    }

    @Override
    public void validarAutorizacion() {
        antiguoSistemaPago.autorizarPago();
    }

    @Override
    public void realizarPago() {
        antiguoSistemaPago.procesarPago();
    }
}


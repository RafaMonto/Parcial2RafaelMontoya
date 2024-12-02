package ejercicio3;

public class Main {
    public static void main(String[] args) {
        NuevoSistemaPago nuevoSistema = new NuevoSistemaPago();
        nuevoSistema.setNombre("Rafael Montoya");
        nuevoSistema.setCorreo("rafa@gmail.com");
        nuevoSistema.setIdentificacion("hola123");

        AntiguoSistemaPago antiguoSistema = new AntiguoSistemaPago();

        SistemaPagoAdapter adapter = new SistemaPagoAdapter(antiguoSistema);

        adapter.crearSesion(nuevoSistema);
        adapter.validarCorreo(nuevoSistema);
        adapter.validarAutorizacion();
        adapter.realizarPago();
    }
}


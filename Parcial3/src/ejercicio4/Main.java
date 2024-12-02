package ejercicio4;

public class Main {
    public static void main(String[] args) {
        Configuracion configuracion = Configuracion.getInstancia();

        System.out.println("URL: " + configuracion.getUrl());
        System.out.println("Usuario: " + configuracion.getUsuario());
        System.out.println("Password: " + configuracion.getPassword());

        configuracion.setUrl("nueva base de datos");
        configuracion.setUsuario("nuevo administrador");
        configuracion.setPassword("hola1234567");

        Configuracion nuevaConfiguracion = Configuracion.getInstancia();
        System.out.println("");
        System.out.println("Configuración actualizada:");
        System.out.println("URL: " + nuevaConfiguracion.getUrl());
        System.out.println("Usuario: " + nuevaConfiguracion.getUsuario());
        System.out.println("Password: " + nuevaConfiguracion.getPassword());
    }
}


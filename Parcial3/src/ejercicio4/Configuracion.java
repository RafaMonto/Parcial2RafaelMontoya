package ejercicio4;

public class Configuracion {
    private static Configuracion instancia;
    private String url;
    private String usuario;
    private String password;

    private Configuracion() {
        this.url = "base de datos";
        this.usuario = "administrador";
        this.password = "hola123";
    }

    public static Configuracion getInstancia() {
        if (instancia == null) {
            instancia = new Configuracion();
        }
        return instancia;
    }

    public String getUrl() {
        return url;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}


package ejercicio1;

public class FabricaExpress implements InterfazFabrica{
    @Override
    public Envio crearEnvio(){
        return new EnvioExpress();
    }
}

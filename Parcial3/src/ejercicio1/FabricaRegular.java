package ejercicio1;

public class FabricaRegular implements InterfazFabrica{
    @Override
    public Envio crearEnvio(){
        return new EnvioRegular();
    }
}

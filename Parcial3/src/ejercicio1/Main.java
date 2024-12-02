package ejercicio1;

public class Main {
    public static void main(String[] args) {
        InterfazFabrica fabrica = new FabricaExpress();
        Envio envio = fabrica.crearEnvio();
        envio.enviar();

        System.out.println("");

        fabrica = new FabricaRegular();
        envio = fabrica.crearEnvio();
        envio.enviar();

    }
}
package ejercicio5;

public class EncenderComputador implements Comando {
    private Computador computador;

    public EncenderComputador(Computador computador) {
        this.computador = computador;
    }

    @Override
    public void ejecutar() {
        computador.encender();
    }
}
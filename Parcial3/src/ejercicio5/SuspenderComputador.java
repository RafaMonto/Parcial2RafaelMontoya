package ejercicio5;

public class SuspenderComputador implements Comando {
    private Computador computador;

    public SuspenderComputador(Computador computador) {
        this.computador = computador;
    }

    @Override
    public void ejecutar() {
        computador.suspender();
    }
}
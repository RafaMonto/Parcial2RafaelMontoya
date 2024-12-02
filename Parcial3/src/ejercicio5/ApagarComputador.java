package ejercicio5;

public class ApagarComputador implements Comando {
    private Computador computador;

    public ApagarComputador(Computador computador) {
        this.computador = computador;
    }

    @Override
    public void ejecutar() {
        computador.apagar();
    }
}

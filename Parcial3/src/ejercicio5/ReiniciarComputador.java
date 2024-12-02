package ejercicio5;

public class ReiniciarComputador implements Comando {
    private Computador computador;

    public ReiniciarComputador(Computador computador) {
        this.computador = computador;
    }

    @Override
    public void ejecutar() {
        computador.reiniciar();
    }
}
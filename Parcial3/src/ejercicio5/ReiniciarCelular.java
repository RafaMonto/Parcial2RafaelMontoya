package ejercicio5;

public class ReiniciarCelular implements Comando {
    private Celular celular;

    public ReiniciarCelular(Celular celular) {
        this.celular = celular;
    }

    @Override
    public void ejecutar() {
        celular.reiniciar();
    }
}

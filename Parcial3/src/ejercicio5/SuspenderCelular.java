package ejercicio5;

public class SuspenderCelular implements Comando {
    private Celular celular;

    public SuspenderCelular(Celular celular) {
        this.celular = celular;
    }

    @Override
    public void ejecutar() {
        celular.suspender();
    }
}

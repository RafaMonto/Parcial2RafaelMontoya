package ejercicio5;

public class ApagarCelular implements Comando {
    private Celular celular;

    public ApagarCelular(Celular celular) {
        this.celular = celular;
    }

    @Override
    public void ejecutar() {
        celular.apagar();
    }
}

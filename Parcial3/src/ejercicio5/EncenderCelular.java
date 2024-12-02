package ejercicio5;

public class EncenderCelular implements Comando {
    private Celular celular;

    public EncenderCelular(Celular celular) {
        this.celular = celular;
    }

    @Override
    public void ejecutar() {
        celular.encender();
    }
}
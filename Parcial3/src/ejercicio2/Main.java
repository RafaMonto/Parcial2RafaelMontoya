package ejercicio2;

public class Main {
    public static void main(String[] args) {
        Hamburguesa hamburguesa = new Hamburguesa.Builder()
                .setTipoTomate("Aliño")
                .setTipoCarne("Res")
                .setTipoQueso("Cheddar")
                .setTipoPan("Blanco")
                .build();

        System.out.println(hamburguesa);
    }
}

package ejercicio5;

public class Main {
    public static void main(String[] args) {
        Computador computador = new Computador();
        Celular celular = new Celular();

        ControlRemoto control = new ControlRemoto();

        Comando encenderComputador = new EncenderComputador(computador);
        Comando apagarComputador = new ApagarComputador(computador);

        Comando encenderCelular = new EncenderCelular(celular);
        Comando reiniciarCelular = new ReiniciarCelular(celular);

        System.out.println("Controlando el Computador:");
        control.setComando(encenderComputador);
        control.presionarBoton();

        control.setComando(apagarComputador);
        control.presionarBoton();

        System.out.println("");
        System.out.println("Controlando el Celular:");
        control.setComando(encenderCelular);
        control.presionarBoton();

        control.setComando(reiniciarCelular);
        control.presionarBoton();
    }
}


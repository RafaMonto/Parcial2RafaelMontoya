package testEjercicio5;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.List;

import ejercicio5.Banco;
import ejercicio5.Cuenta;

public class Tests {
	
	static Banco banco;
	
	@BeforeAll
    public static void listarCuentasTest() {
        List<Cuenta> cuentas = new ArrayList<>();
        cuentas.add(new Cuenta("Rafa", "23456789", 50000));
        cuentas.add(new Cuenta("Isa", "3456789", 50000));
        cuentas.add(new Cuenta("Juan", "2345678", 50000));
        banco = new Banco(cuentas);
    }

    @Test
    public void existeCuentaTest() {
        assertTrue(banco.existeCuenta("Rafa"));
    }

    @Test
    public void existeCuentaFallidoTest() {
        assertFalse(banco.existeCuenta("pablo"));
    }

    @Test
    public void depositarTest() {
        banco.depositar("23456789", 40000);
        assertEquals(90000.0, banco.getCuentas().get(0).getSaldo());
    }


    @Test
    public void depositarTestFallido() {
        assertThrows(IllegalArgumentException.class, () -> {
            banco.depositar("23456789", -100);
        });
    }

 
}

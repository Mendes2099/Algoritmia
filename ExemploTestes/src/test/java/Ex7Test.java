import Ex7.Conta;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Ex7Test {

    // * Necesidade de criação de uma instância para iniciar os testes?
    @BeforeEach
    public void setUp() {
        Conta conta = new Conta("12345", "Tassio", 1000);
    }

    // Teste de transferencia (geral)
    @Test
    public void transferencia() {
        Conta conta = new Conta("12345", "Tassio", 1000); // Conta 1
        Conta contaDestino = new Conta("54321", "Manolo", 500.0); // Conta 2

        assertTrue(conta.transferencia(100, contaDestino)); // ? Como realizar esta condição

        assertEquals(900,conta.getSaldo(),"A conta remetente deve decrementar 100 euros, passa a 900");
        assertEquals(600,contaDestino.getSaldo(),"A conta destino deve incrementar 100 euros, passa a 600");
    }

    @Test
    public void transferenciaRemetenteComSaldoInsuficiente() {
        Conta conta = new Conta("12345", "Tassio", 1000); // Conta 1
        Conta contaDestino = new Conta("54321", "Manolo", 500.0); // Conta 2

        assertFalse(conta.transferencia(10000, contaDestino));

        assertEquals(1000,conta.getSaldo());
        assertEquals(500,contaDestino.getSaldo());
    }



    // Teste de transferencia (Caso a cota do Rementente não possua saldo suficiente na sua conta)
    @Test
    public void transferenciaRemetenteSemSaldoSuficiente() {
        Conta conta = new Conta("12345", "Tassio", 1000); // Conta 1
        Conta contaDestino = new Conta("54321", "Manolo", 500.0); // Conta 2

    }


}

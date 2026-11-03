package padroescomportamentais.integracao;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RegraCobrancaTest {

    @Test
    void deveAdicionarTaxaEntrega() {
        RegraCobranca regra = CobrancaTaxaEntrega.getInstance();
        assertEquals(58.0f, regra.calcular(50.0f, 8.0f), 0.01f);
    }

    @Test
    void deveAdicionarGorjeta() {
        RegraCobranca regra = CobrancaGorjeta.getInstance();
        assertEquals(55.0f, regra.calcular(50.0f, 10.0f), 0.01f);
    }

    @Test
    void deveAplicarCupomPercentual() {
        RegraCobranca regra = CobrancaCupomPercentual.getInstance();
        assertEquals(45.0f, regra.calcular(50.0f, 10.0f), 0.01f);
    }

}

package padroescomportamentais.integracao;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FabricaRegrasTest {

    @Test
    void deveRetornarRegraTaxaEntrega() {
        RegraCobranca regra = FabricaRegras.obterRegra("TaxaEntrega");
        assertEquals(CobrancaTaxaEntrega.getInstance(), regra);
    }

    @Test
    void deveRetornarRegraGorjeta() {
        RegraCobranca regra = FabricaRegras.obterRegra("Gorjeta");
        assertEquals(CobrancaGorjeta.getInstance(), regra);
    }

    @Test
    void deveRetornarRegraCupomPercentual() {
        RegraCobranca regra = FabricaRegras.obterRegra("CupomPercentual");
        assertEquals(CobrancaCupomPercentual.getInstance(), regra);
    }

    @Test
    void deveRetornarSempreAMesmaRegra() {
        RegraCobranca regra1 = FabricaRegras.obterRegra("Gorjeta");
        RegraCobranca regra2 = FabricaRegras.obterRegra("Gorjeta");
        assertEquals(regra1, regra2);
    }

    @Test
    void deveRetornarExcecaoParaRegraInexistente() {
        try {
            RegraCobranca regra = FabricaRegras.obterRegra("Fiado");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Regra inexistente", e.getMessage());
        }
    }

}

package padroescomportamentais.integracao;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PedidoFidelidadeTest {

    @Test
    void deveCalcularValorFinalComCupomPercentual() {
        PedidoFidelidade pedido = new PedidoFidelidade();
        pedido.setValorLanche(35.0f);
        pedido.setValorBebida(15.0f);
        assertEquals(45.0f, pedido.calcularValorFinal(), 0.01f);
    }

    @Test
    void deveRetornarInformacoes() {
        PedidoFidelidade pedido = new PedidoFidelidade();
        pedido.setValorLanche(35.0f);
        pedido.setValorBebida(15.0f);
        pedido.setCliente("Ana");
        pedido.setNumero(3);
        assertEquals("Pedido{numero=3, cliente='Ana', valorFinal=45.0}", pedido.getInfo());
    }
}

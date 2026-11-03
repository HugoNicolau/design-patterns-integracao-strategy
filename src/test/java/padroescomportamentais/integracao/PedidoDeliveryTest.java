package padroescomportamentais.integracao;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PedidoDeliveryTest {

    @Test
    void deveCalcularValorFinalComTaxaEntrega() {
        PedidoDelivery pedido = new PedidoDelivery();
        pedido.setValorLanche(35.0f);
        pedido.setValorBebida(15.0f);
        assertEquals(58.0f, pedido.calcularValorFinal(), 0.01f);
    }

    @Test
    void deveRetornarInformacoes() {
        PedidoDelivery pedido = new PedidoDelivery();
        pedido.setValorLanche(35.0f);
        pedido.setValorBebida(15.0f);
        pedido.setCliente("Maria");
        pedido.setNumero(1);
        assertEquals("PedidoDelivery{numero=1, cliente='Maria', valorFinal=58.0}", pedido.getInfo());
    }
}

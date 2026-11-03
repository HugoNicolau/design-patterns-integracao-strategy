package padroescomportamentais.integracao;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PedidoMesaTest {

    @Test
    void deveCalcularValorFinalComGorjeta() {
        PedidoMesa pedido = new PedidoMesa();
        pedido.setValorLanche(35.0f);
        pedido.setValorBebida(15.0f);
        assertEquals(55.0f, pedido.calcularValorFinal(), 0.01f);
    }

    @Test
    void deveRetornarInformacoes() {
        PedidoMesa pedido = new PedidoMesa();
        pedido.setValorLanche(35.0f);
        pedido.setValorBebida(15.0f);
        pedido.setCliente("João");
        pedido.setNumero(2);
        assertEquals("Pedido{numero=2, cliente='João', valorFinal=55.0}", pedido.getInfo());
    }
}

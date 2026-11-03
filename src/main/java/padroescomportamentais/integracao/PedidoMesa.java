package padroescomportamentais.integracao;

public class PedidoMesa extends Pedido {

    public String getRegraCobranca() {
        return "Gorjeta";
    }

    public float getValorRegra() {
        return 10.0f;
    }
}

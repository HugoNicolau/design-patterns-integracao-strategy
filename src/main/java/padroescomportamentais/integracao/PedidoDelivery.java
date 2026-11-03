package padroescomportamentais.integracao;

public class PedidoDelivery extends Pedido {

    public String getRegraCobranca() {
        return "TaxaEntrega";
    }

    public float getValorRegra() {
        return 8.0f;
    }

    @Override
    public String getTipo() {
        return "PedidoDelivery";
    }
}

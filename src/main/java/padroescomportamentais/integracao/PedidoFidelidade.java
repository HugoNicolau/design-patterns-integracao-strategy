package padroescomportamentais.integracao;

public class PedidoFidelidade extends Pedido {

    public String getRegraCobranca() {
        return "CupomPercentual";
    }

    public float getValorRegra() {
        return 10.0f;
    }
}

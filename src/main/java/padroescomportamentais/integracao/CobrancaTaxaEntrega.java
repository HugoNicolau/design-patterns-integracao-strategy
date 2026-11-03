package padroescomportamentais.integracao;

public class CobrancaTaxaEntrega implements RegraCobranca {

    private CobrancaTaxaEntrega() {};
    private static CobrancaTaxaEntrega instance = new CobrancaTaxaEntrega();
    public static CobrancaTaxaEntrega getInstance() {
        return instance;
    }

    public float calcular(float valorPedido, float valor) {
        return valorPedido + valor;
    }
}

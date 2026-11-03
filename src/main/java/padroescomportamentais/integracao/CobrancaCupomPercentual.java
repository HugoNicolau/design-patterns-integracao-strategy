package padroescomportamentais.integracao;

public class CobrancaCupomPercentual implements RegraCobranca {

    private CobrancaCupomPercentual() {};
    private static CobrancaCupomPercentual instance = new CobrancaCupomPercentual();
    public static CobrancaCupomPercentual getInstance() {
        return instance;
    }

    public float calcular(float valorPedido, float valor) {
        return valorPedido - (valorPedido * valor / 100);
    }
}

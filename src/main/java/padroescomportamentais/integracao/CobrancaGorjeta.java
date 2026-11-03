package padroescomportamentais.integracao;

public class CobrancaGorjeta implements RegraCobranca {

    private CobrancaGorjeta() {};
    private static CobrancaGorjeta instance = new CobrancaGorjeta();
    public static CobrancaGorjeta getInstance() {
        return instance;
    }

    public float calcular(float valorPedido, float valor) {
        return valorPedido + (valorPedido * valor / 100);
    }
}

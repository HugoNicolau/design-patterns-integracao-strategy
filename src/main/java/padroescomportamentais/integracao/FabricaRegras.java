package padroescomportamentais.integracao;

public class FabricaRegras {

    public static RegraCobranca obterRegra(String regra) {
        if ("TaxaEntrega".equals(regra)) {
            return CobrancaTaxaEntrega.getInstance();
        }
        if ("Gorjeta".equals(regra)) {
            return CobrancaGorjeta.getInstance();
        }
        if ("CupomPercentual".equals(regra)) {
            return CobrancaCupomPercentual.getInstance();
        }
        throw new IllegalArgumentException("Regra inexistente");
    }
}

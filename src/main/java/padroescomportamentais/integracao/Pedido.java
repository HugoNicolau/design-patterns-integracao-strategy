package padroescomportamentais.integracao;

public abstract class Pedido {

    private int numero;
    protected String cliente;
    private float valorLanche;
    private float valorBebida;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public float getValorLanche() {
        return valorLanche;
    }

    public void setValorLanche(float valorLanche) {
        this.valorLanche = valorLanche;
    }

    public float getValorBebida() {
        return valorBebida;
    }

    public void setValorBebida(float valorBebida) {
        this.valorBebida = valorBebida;
    }

    public float calcularTotal() {
        return this.valorLanche + this.valorBebida;
    }

    public abstract String getRegraCobranca();

    public abstract float getValorRegra();

    public float calcularValorFinal() {
        RegraCobranca regra = FabricaRegras.obterRegra(this.getRegraCobranca());
        return regra.calcular(this.calcularTotal(), this.getValorRegra());
    }

    public String getTipo() {
        return "Pedido";
    }

    public String getInfo() {
        return getTipo() + "{" +
                "numero=" + this.numero +
                ", cliente='" + this.cliente + '\'' +
                ", valorFinal=" + this.calcularValorFinal() +
                '}';
    }
}

package chainOfResponsability;

public class PagamentoDinheiroHandler extends BasePagamentoHandler{
    private double saldo;

    public PagamentoDinheiroHandler(double saldo) {
        this.saldo = saldo;
    }

    @Override
    protected boolean podeProcessarPagamento(double valor) {
        return valor <= saldo;
    }

    @Override
    protected void realizarPagamento(double valor) {
        saldo -= valor;
        System.out.println("Valor pago: R$" + valor + "\nPagamento realizado em dinheiro");
    }
}

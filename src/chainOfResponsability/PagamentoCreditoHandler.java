package chainOfResponsability;

public class PagamentoCreditoHandler extends BasePagamentoHandler{
    private double limiteCredito;

    public PagamentoCreditoHandler(double limiteCredito) {
        this.limiteCredito = limiteCredito;
    }

    @Override
    protected boolean podeProcessarPagamento(double valor) {
        return valor <= limiteCredito;
    }

    @Override
    protected void realizarPagamento(double valor) {
        limiteCredito -= valor;
        System.out.println("Valor pago: R$" + valor + "\nPagamento realizado com cartão de crédito");
    }
}

package chainOfResponsability;

public class PagamentoTransferenciaHandler extends BasePagamentoHandler{
    private String transferencia;

    public PagamentoTransferenciaHandler(String transferencia) {
        this.transferencia = transferencia;
    }

    @Override
    protected boolean podeProcessarPagamento(double valor) {
        return true;
    }

    @Override
    protected void realizarPagamento(double valor) {
        System.out.println("Valor pago: R$" + valor + "\nPagamento realizado por transferência bancária");
    }
}

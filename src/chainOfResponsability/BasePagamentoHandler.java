package chainOfResponsability;

public abstract class BasePagamentoHandler implements PagamentoHandler{
    private PagamentoHandler proximo;

    @Override
    public void definirProximo(PagamentoHandler proximo){
        if (this.proximo == null) {
            this.proximo = proximo;
        } else {
            this.proximo.definirProximo(proximo);
        }
    }

    @Override
    public void processarPagamento(double valor){
        if(podeProcessarPagamento(valor)){
            realizarPagamento(valor);
        } else if (proximo != null) {
            proximo.processarPagamento(valor);
        } else{
            System.out.println("Nenhum metodo de pagamento disponivel");
        }
    }

    protected abstract boolean podeProcessarPagamento(double valor);
    protected abstract void realizarPagamento(double valor);
}

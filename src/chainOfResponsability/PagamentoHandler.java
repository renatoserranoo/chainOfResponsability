package chainOfResponsability;

public interface PagamentoHandler {
    void definirProximo(PagamentoHandler proximo);
    void processarPagamento(double valor);
}

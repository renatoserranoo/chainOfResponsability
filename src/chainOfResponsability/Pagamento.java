package chainOfResponsability;

import java.util.Scanner;

public class Pagamento {
    public static void main(String[] args) {
        PagamentoHandler handler = new PagamentoDinheiroHandler(300);
        handler.definirProximo(new PagamentoCreditoHandler(1000));
        handler.definirProximo(new PagamentoTransferenciaHandler("123456789"));

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor do pagamento:");
        double valor = sc.nextDouble();
        handler.processarPagamento(valor);
    }
}

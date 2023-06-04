package Ex2;

// Classe que utiliza o padrão Strategy
public class PaymentProcessor {
    private DiscountStrategy discountStrategy; // Estratégia de desconto

    public PaymentProcessor(DiscountStrategy discountStrategy) {
        this.discountStrategy = discountStrategy;
        // Construtor que recebe a estratégia de desconto a ser utilizada.
    }

    public double calculateTotal(double totalAmount) {
        double discountedAmount = discountStrategy.applyDiscount(totalAmount);
        // Aplica a estratégia de desconto ao valor total, chamando o método applyDiscount da estratégia selecionada.

        return discountedAmount;
        // Retorna o valor total com o desconto aplicado.
    }
}

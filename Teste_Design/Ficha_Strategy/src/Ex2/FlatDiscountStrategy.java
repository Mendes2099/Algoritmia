package Ex2;

// Estratégia de desconto fixo
public class FlatDiscountStrategy implements DiscountStrategy {
    private double discountAmount; // Valor fixo do desconto necessário para as operações da classe

    // Construtor
    public FlatDiscountStrategy(double discountAmount) {
        this.discountAmount = discountAmount;
    }

    @Override
    public double applyDiscount(double totalAmount) {

        return totalAmount - discountAmount; // Subtrai o valor do desconto fixo do total, retornando o valor com o desconto já aplicado.

    }
}

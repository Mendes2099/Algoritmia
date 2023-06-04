package Ex2;

// Estratégia de desconto percentual
public class PercentageDiscountStrategy implements DiscountStrategy {
    private double discountPercentage; // Percentual de desconto

    public PercentageDiscountStrategy(double discountPercentage) {
        this.discountPercentage = discountPercentage;
    }

    @Override
    public double applyDiscount(double totalAmount) {
        double discount = totalAmount * (discountPercentage / 100.0);
        // Calcula o valor do desconto percentual multiplicando o valor total pelo percentual de desconto e dividindo por 100.

        return totalAmount - discount;
        // Subtrai o valor do desconto percentual do valor total, retornando o valor com o desconto aplicado.
    }
}

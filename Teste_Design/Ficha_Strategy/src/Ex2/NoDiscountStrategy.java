package Ex2;

// // Implementações concretas de Strategy - Estratégia sem desconto
public class NoDiscountStrategy implements DiscountStrategy {
    @Override
    public double applyDiscount(double totalAmount) {
        return totalAmount; // Retorna o valor total original, sem desconto.

    }
}
package Ex2;

// Interface Strategy que define o contrato para as estratégias de desconto

public interface DiscountStrategy {
    double applyDiscount(double totalAmount); // As estratégias de desconto devem implementar esse método para calcular o desconto a ser aplicado ao total.


}

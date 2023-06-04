package Ex2;

import java.util.Scanner;

// Exemplo de uso
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Qual o valor total a pagar?: ");
        double totalAmount = scanner.nextDouble();

        // Criação de instâncias de PaymentProcessor com diferentes estratégias de desconto
        PaymentProcessor noDiscountProcessor = new PaymentProcessor(new NoDiscountStrategy());
        PaymentProcessor flatDiscountProcessor = new PaymentProcessor(new FlatDiscountStrategy(10.0));
        PaymentProcessor percentageDiscountProcessor = new PaymentProcessor(new PercentageDiscountStrategy(20.0));

        // Cálculo do valor total aplicando a estratégia de desconto
        double totalWithNoDiscount = noDiscountProcessor.calculateTotal(totalAmount);
        double totalWithFlatDiscount = flatDiscountProcessor.calculateTotal(totalAmount);
        double totalWithPercentageDiscount = percentageDiscountProcessor.calculateTotal(totalAmount);

        // Impressão dos resultados
        System.out.println("Valor total sem desconto: " + totalWithNoDiscount);
        System.out.println("Valor total com desconto fixo: " + totalWithFlatDiscount);
        System.out.println("Valor total com desconto percentual: " + totalWithPercentageDiscount);
    }
}

package Ex1;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Calculator calculator = new Calculator();
        int num1, num2;
        System.out.print("Primeiro número: ");
        num1= input.nextInt();
        System.out.print("Segundo número: ");
        num2= input.nextInt();

        System.out.println("Divisão: "+ calculator.divide(num1, num2));

    }

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Impossível dividir por 0");
        }
        return a / b;
    }
}
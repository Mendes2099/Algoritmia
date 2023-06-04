import Ex3.Document;
import Ex3.DocumentFactory;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Declarar Variáveis
        String option1;
        String option2;
        String option3;
        String option4;

        // Preenchimento das variáveis pelo usuário
        System.out.print("Escolha o tipo de documento (Calculo / Apresentacao / Texto): ");
        option1 = scanner.next();
        System.out.print("Escolha o nome do documento: ");
        option2 = scanner.next();
        System.out.print("Escolha o nome do autor: ");
        option3 = scanner.next();

        // Criar o documento com base nas opções fornecidas pelo usuário
        Document document = DocumentFactory.createDocument(option1.toUpperCase(), option2, option3);

        System.out.print("O que deseja fazer?: (Abrir / Gravar / Fechar)");
        option4 = scanner.next().toUpperCase();

        switch (option4) {
            case "ABRIR":
                document.open();
                break;
            case "GRAVAR":
                document.save();
                break;
            case "FECHAR":
                document.close();
                break;
            default:
                System.out.println("Opção Inválida");
        }
    }
}

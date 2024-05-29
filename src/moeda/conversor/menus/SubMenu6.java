package moeda.conversor.menus;

import moeda.conversor.classes.Conversao;
import moeda.conversor.consultaApi.ConsultaConversao;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SubMenu6 {
    public void ConversaoARS_BRL() {
        Scanner scan = new Scanner(System.in);

        try {
            System.out.println("Peso Argentino para Real");
            System.out.print("Entre com o valor para conversão: ");
            String valor;
            do {
                valor = scan.next();
                if (!valor.matches("[0-9.,]+")) {
                    System.out.println("\nPor favor, insira um número válido.");
                    System.out.print("Entre com o valor para conversão: ");
                }
            } while (!valor.matches("[0-9.,]+"));
            ConsultaConversao consulConver = new ConsultaConversao();
            Conversao conversao = consulConver.buscaConversao("ARS", "BRL", valor.replace(",", "."));
            System.out.println("\n" + conversao.toString());
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }

        int opcao;

        while (true) {
            System.out.println("\n-----------------------------------------------------");
            System.out.println("1 - Voltar");
            System.out.println("2 - sair");
            System.out.println("-----------------------------------------------------");
            System.out.print("Opção: ");

            try {
                opcao = scan.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("\nPor favor, insira um número válido");
                scan.next();
                continue;
            }

            if(opcao == 1) {
                MenuPrincipal.menuPrincipal();
            } else if (opcao == 2) {
                System.out.println("\nFinalizando a aplicação");
                System.exit(0);
            } else {
                System.out.println("\nInsira uma opção válida!");
            }
        }
    }
}

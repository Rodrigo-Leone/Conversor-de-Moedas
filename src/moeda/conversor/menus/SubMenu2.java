package moeda.conversor.menus;

import moeda.conversor.classes.Conversao;
import moeda.conversor.consultaApi.ConsultaConversao;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SubMenu2 {
    public void ConversaoUSD_BRL() {
        Scanner scan = new Scanner(System.in);

        int opcao;

        try {
            ConsultaConversao teste = new ConsultaConversao();
            System.out.println("Dollar para Real");
            System.out.println("Entre com o valor para conversão: ");
            String valor = scan.nextLine();
            Conversao teste1 = teste.buscaConversao("USD", "BRL", valor.replace(",", "."));
            System.out.println(teste1.toString());
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }

        while (true) {
            System.out.println("\n-------------------------------------------------------");
            System.out.println("1 - Voltar");
            System.out.println("2 - sair");
            System.out.println("-------------------------------------------------------");

            try {
                opcao = scan.nextInt();
            } catch (InputMismatchException e) {
                System.out.printf("Por favor, insira um número válido%n%n");
                System.out.println("\n-------------------------------------------------------");
                System.out.println("1 - Voltar");
                System.out.println("2 - sair");
                System.out.println("-------------------------------------------------------");
                scan.next();
                continue;
            }

            if(opcao == 1) {
                MenuPrincipal menu = new MenuPrincipal();
                menu.menuPrincipal();
            } else if (opcao == 2) {
                System.out.println("Finalizando a aplicação");
                System.exit(0);
            } else {
                System.out.println("Insira uma opção válida!");
            }
        }
    }
}

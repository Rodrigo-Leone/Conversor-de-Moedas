package moeda.conversor.menus;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MenuPrincipal {
    public static void menuPrincipal() {
        Scanner leitor = new Scanner(System.in);
        System.out.println("\n");
        Menu opcoes = new Menu();

        int select;

        while (true) {

            opcoes.showMenu();

            try {
                select = leitor.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("\nPor favor, insira um número válido\n");
                leitor.next();
                continue;
            }

            if(select == 1){
                SubMenu1 menu = new SubMenu1();
                menu.ConversaoBRL_USD();
            } else if (select == 2) {
                SubMenu2 menu = new SubMenu2();
                menu.ConversaoUSD_BRL();
            } else if (select == 3) {
                SubMenu3 menu = new SubMenu3();
                menu.ConversaoBRL_EUR();
            } else if (select == 4) {
                SubMenu4 menu = new SubMenu4();
                menu.ConversaoEUR_BRL();
            } else if (select == 5) {
                SubMenu5 menu = new SubMenu5();
                menu.ConversaoBRL_ARS();
            } else if (select == 6) {
                SubMenu6 menu = new SubMenu6();
                menu.ConversaoARS_BRL();
            } else if (select == 0) {
                System.out.println("\nFinalizando a aplicação");
                System.exit(0);
            } else {
                System.out.println("\nInsira uma opção válida!\n");
            }
        }
    }
}

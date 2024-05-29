package moeda.conversor.menus;

import java.util.Scanner;

public class MenuPrincipal {
    public void menuPrincipal() {
        Scanner leitor = new Scanner(System.in);
        Menu opcoes = new Menu();

        int select;

        opcoes.showMenu();

        while (true) {

            select = leitor.nextInt();

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
            } else if (select == 7) {
                System.out.println("Finalizando a aplicação");
                System.exit(0);
            } else {
                System.out.println("Insira uma opção válida!");
            }
        }
    }
//    public void exibir() {
//        SubMenu2 menu = new SubMenu2();
//        menu.ConversaoUSD_BRL();
//    }
}

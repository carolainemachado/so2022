import java.util.Scanner;
public class Menu {
        public static void main (String[] args){

            Scanner menu = new Scanner (System.in);
            int opcao=0;
            do {
                System.out.println("\n======== MENU =========");
                System.out.println("|  1- Atribuição Automática|");
                System.out.println("|  2- Atribuição Manual    |");
                System.out.print("Digite uma opção: ");

                opcao = menu.nextInt();
                switch (opcao) {
                    case 1:
                        break;
                    case 2:
                        // fazer uma função aqui
                        System.out.println("Digite o tempo de execução do processo ( p1 )");
                        System.out.println("Digite o tempo de execução do processo ( p2 )");
                        System.out.println("Digite o tempo de execução do processo ( p3 )");
                        break;
                    case 0:
                        break;
                    default:
                        System.out.println("Opção Inválida!");
                        break;
                }
            } while (opcao != 0);
        }
    }


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Baralho baralho = new Baralho();
        Scanner scan = new Scanner(System.in);

        while (true){
            System.out.println("========== ♠♣ BARALHO ♥♦ ==========");
            System.out.println("1. Embaralhar");
            System.out.println("2. Distribuir Carta");
            System.out.println("3. Verificar Carta no Baralho");
            System.out.println("4. Ver Todas as Cartas");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");

            int option = scan.nextInt();
            scan.nextLine();

            switch (option){

                case 1:
                    baralho.embaralhar();
                    System.out.println("Embaralhado!");
                    break;

                case 2:
                    Carta cartaDistribuida = baralho.distribuirCarta();
                    if(cartaDistribuida != null){
                        System.out.println("Carta Distribuida: " + cartaDistribuida);
                    }else{
                        System.out.println("Não há cartas no baralho");
                    }
                    break;

                case 3:
                    System.out.println("Digite o Naipe da carta (ex: Ouros): ");
                    String naipe = scan.nextLine();
                    System.out.println("Digite a imagem da carta (ex: Valete, 5, 7)): ");
                    String imagem = scan.nextLine();

                    if(baralho.hasCarta(imagem, naipe)){
                    System.out.println("A carta " + imagem + " de " + naipe + " está no baralho.");
                    }else{
                        System.out.println("A carta não esta no baralho");
                    }
                    break;

                case 4:
                    System.out.println("Cartas no baralho: ");
                    baralho.imprimirBaralho();
                    break;

                case 5:
                    System.out.println("Encerrando...");
                    scan.close();
                    return;

                default:
                    System.out.println("Opção inválida, tente novamente");
            }

            System.out.println("\nPressione Enter para continuar...");
            scan.nextLine();
        }
    }
}

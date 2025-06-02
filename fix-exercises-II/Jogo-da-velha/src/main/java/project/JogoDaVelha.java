package project;

import java.util.Scanner;

public class JogoDaVelha {
    enum estado {
        jogador1, jogador2, vazio
    }

    private estado[][] tabuleiro;

    Scanner scanner = new Scanner(System.in);

    public JogoDaVelha() {
        tabuleiro = new estado[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tabuleiro[i][j] = estado.vazio;
            }
        }
    }

    public void printTabuleiro() {
        System.out.println("   0   1   2");
        for (int i = 0; i < 3; i++) {
            System.out.print(i + " ");
            for (int j = 0; j < 3; j++) {
                if (tabuleiro[i][j] == estado.vazio) {
                    System.out.print(" . ");
                } else if (tabuleiro[i][j] == estado.jogador1) {
                    System.out.print(" X ");
                } else {
                    System.out.print(" O ");
                }
                if (j < 2) System.out.print("|");
            }
            System.out.println();
            if (i < 2) System.out.println("  ---+---+---"); //
        }
    }


    public boolean verificarVitoria(estado jogador) {
        for (int i = 0; i < 3; i++) {
            if ((tabuleiro[i][0] == jogador && tabuleiro[i][1] == jogador && tabuleiro[i][2] == jogador) ||
                    (tabuleiro[0][i] == jogador && tabuleiro[1][i] == jogador && tabuleiro[2][i] == jogador)) {
                return true;
            }
    }
        return ((tabuleiro[0][0] == jogador && tabuleiro[1][1] == jogador && tabuleiro[2][2] == jogador) ||
                (tabuleiro[0][2] == jogador && tabuleiro[1][1] == jogador && tabuleiro[2][0] == jogador));
    }

    public boolean verificarEmpate() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (tabuleiro[i][j] == estado.vazio) {
                    return false;
                }
            }
        }
        return true;
    }


    public void jogar(){
        estado jogadorAtual = estado.jogador1;

        while(true){
            printTabuleiro();
            System.out.println("Jogador" + (jogadorAtual == estado.jogador1 ? "1 - X" : "2 - O") + " Selecione a linha e a coluna que deseja jogar:");
            System.out.println("linha: ");
            int linha = scanner.nextInt();
            System.out.println("coluna: ");
            int coluna = scanner.nextInt();

            if (linha < 0 || linha > 2 || coluna < 0 || coluna > 2 || tabuleiro [linha][coluna] != estado.vazio){
                System.out.println("Movimento inválido, tente novamente!");
                continue;
            }

            tabuleiro [linha][coluna] = jogadorAtual;

            if (verificarVitoria(jogadorAtual)){
                printTabuleiro();
                System.out.println(jogadorAtual + " é o vencedor!");
                break;
            }

            if (verificarEmpate()){
                printTabuleiro();
                System.out.println("Empate!");
                break;
            }

            jogadorAtual = (jogadorAtual == estado.jogador1) ? jogadorAtual = estado.jogador2 : estado.jogador1;
        }
    }

        public static void main(String[] args){
        JogoDaVelha jogodavelha = new JogoDaVelha();
        jogodavelha.jogar();
        }
}



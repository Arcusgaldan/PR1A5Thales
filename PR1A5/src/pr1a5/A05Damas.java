/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pr1a5;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Thales
 */
class Posicao {

    int linha;
    int coluna;
    char tipo;

    public Posicao(int linha, int coluna, char tipo) {
        this.linha = linha;
        this.coluna = coluna;
        this.tipo = tipo;
    }
}

public class A05Damas {

    public static void MostraTabuleiro(char[][] tabuleiro) { //Mostra o tabuleiro preenchido na tela.
        System.out.println("   --- --- --- --- --- --- --- ---");
        System.out.printf("1 | %c | %c | %c | %c | %c | %c | %c | %c |\n", tabuleiro[0][0], tabuleiro[0][1], tabuleiro[0][2], tabuleiro[0][3], tabuleiro[0][4], tabuleiro[0][5], tabuleiro[0][6], tabuleiro[0][7]);
        System.out.println("   --- --- --- --- --- --- --- ---");
        System.out.printf("2 | %c | %c | %c | %c | %c | %c | %c | %c |\n", tabuleiro[1][0], tabuleiro[1][1], tabuleiro[1][2], tabuleiro[1][3], tabuleiro[1][4], tabuleiro[1][5], tabuleiro[1][6], tabuleiro[1][7]);
        System.out.println("   --- --- --- --- --- --- --- ---");
        System.out.printf("3 | %c | %c | %c | %c | %c | %c | %c | %c |\n", tabuleiro[2][0], tabuleiro[2][1], tabuleiro[2][2], tabuleiro[2][3], tabuleiro[2][4], tabuleiro[2][5], tabuleiro[2][6], tabuleiro[2][7]);
        System.out.println("   --- --- --- --- --- --- --- ---");
        System.out.printf("4 | %c | %c | %c | %c | %c | %c | %c | %c |\n", tabuleiro[3][0], tabuleiro[3][1], tabuleiro[3][2], tabuleiro[3][3], tabuleiro[3][4], tabuleiro[3][5], tabuleiro[3][6], tabuleiro[3][7]);
        System.out.println("   --- --- --- --- --- --- --- ---");
        System.out.printf("5 | %c | %c | %c | %c | %c | %c | %c | %c |\n", tabuleiro[4][0], tabuleiro[4][1], tabuleiro[4][2], tabuleiro[4][3], tabuleiro[4][4], tabuleiro[4][5], tabuleiro[4][6], tabuleiro[4][7]);
        System.out.println("   --- --- --- --- --- --- --- ---");
        System.out.printf("6 | %c | %c | %c | %c | %c | %c | %c | %c |\n", tabuleiro[5][0], tabuleiro[5][1], tabuleiro[5][2], tabuleiro[5][3], tabuleiro[5][4], tabuleiro[5][5], tabuleiro[5][6], tabuleiro[5][7]);
        System.out.println("   --- --- --- --- --- --- --- ---");
        System.out.printf("7 | %c | %c | %c | %c | %c | %c | %c | %c |\n", tabuleiro[6][0], tabuleiro[6][1], tabuleiro[6][2], tabuleiro[6][3], tabuleiro[6][4], tabuleiro[6][5], tabuleiro[6][6], tabuleiro[6][7]);
        System.out.println("   --- --- --- --- --- --- --- ---");
        System.out.printf("8 | %c | %c | %c | %c | %c | %c | %c | %c |\n", tabuleiro[7][0], tabuleiro[7][1], tabuleiro[7][2], tabuleiro[7][3], tabuleiro[7][4], tabuleiro[7][5], tabuleiro[7][6], tabuleiro[7][7]);
        System.out.println("   --- --- --- --- --- --- --- ---");
        System.out.println("    1   2   3   4   5   6   7   8");
    }

    public static char[][] InicializaTabuleiro() { //Preenche o tabuleiro com as posições iniciais.
        char[][] tabuleiro = new char[8][8];

        for (int linha = 0; linha < 8; linha++) {
            for (int coluna = 0; coluna < 8; coluna++) {
                switch (linha) {
                    case 0:
                        if (coluna % 2 == 1) {
                            tabuleiro[linha][coluna] = 'b';
                        } else {
                            tabuleiro[linha][coluna] = ' ';
                        }
                        break;
                    case 1:
                        if (coluna % 2 == 0) {
                            tabuleiro[linha][coluna] = 'b';
                        } else {
                            tabuleiro[linha][coluna] = ' ';
                        }
                        break;
                    case 2:
                        if (coluna % 2 == 1) {
                            tabuleiro[linha][coluna] = 'b';
                        } else {
                            tabuleiro[linha][coluna] = ' ';
                        }
                        break;
                    case 3:
                        tabuleiro[linha][coluna] = ' ';
                        break;
                    case 4:
                        tabuleiro[linha][coluna] = ' ';
                        break;
                    case 5:
                        if (coluna % 2 == 0) {
                            tabuleiro[linha][coluna] = 'w';
                        } else {
                            tabuleiro[linha][coluna] = ' ';
                        }
                        break;
                    case 6:
                        if (coluna % 2 == 1) {
                            tabuleiro[linha][coluna] = 'w';
                        } else {
                            tabuleiro[linha][coluna] = ' ';
                        }
                        break;
                    case 7:
                        if (coluna % 2 == 0) {
                            tabuleiro[linha][coluna] = 'w';
                        } else {
                            tabuleiro[linha][coluna] = ' ';
                        }
                        break;
                }
            }
        }
        return tabuleiro;
    }

    public static int Vitoria() { //Indica se houve a vitória de algum dos dois lados.
        return 0;
    }

    public static void ImprimeRegras() {
        System.out.println("Olá, bem vindo ao jogo de Damas!");
        System.out.println("Este jogo foi desenvolvido como matéria do curso");
        System.out.println("superior de Tecnologia em Análise e Desenvolvimento");
        System.out.println("de Sistemas do Instituto Federal de São Paulo");
        System.out.println("Campus Barretos.");
        System.out.println("\n---------------------------------------------------");
        System.out.println("\nEstas são as regras: As peças demarcadas 'w' são");
        System.out.println("peças brancas regulares. As peças demarcadas 'W'");
        System.out.println("são damas brancas. As peças demarcadas 'b' são");
        System.out.println("peças pretas regulares. As peças demarcadas 'B' são");
        System.out.println("damas pretas.");
        System.out.println("\nTodas peças podem mover-se apenas na diagonal.");
        System.out.println("Peças regulares só podem se mover uma casa, podendo");
        System.out.println("pular por cima de uma peça adversária, eliminando-a");
        System.out.println("Peças regulares também só podem se mover na direção");
        System.out.println("do campo adversário. Já as damas podem se mover");
        System.out.println("quantas casas quiserem e em qualquer diagonal.");
        System.out.println("Para requisitar um empate entre jogadores, um");
        System.out.println("jogador deve digitar o número 0 (zero) na linha");
        System.out.println("e na coluna da peça que deseja mover. Ao fazer isso,");
        System.out.println("o outro jogador será prontificado. Caso aceite o");
        System.out.println("empate, o jogo termina em empate. Caso contrário, o");
        System.out.println("jogo continua normalmente.");
        System.out.println("\n---------------------------------------------------");
        System.out.println("Bom jogo e divirtam-se!");
        System.out.println("Pressione Enter para iniciar o jogo!");
        try {
            System.in.read();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        System.out.println("\n\n\n\n\n\n\n\n\n\n");
    }

    public static int ChecaCaminho(char[][] tabuleiro, Posicao peca, Posicao alvo){//Verifica o caminho entre a peça e o alvo para ver se há peças e se sim, se são elimináveis
        int fatorLinha;
        int fatorColuna;       
        
        if(alvo.linha - peca.linha > 0)//Define se a linha irá aumentar ou diminuir
            fatorLinha = 1;            
        else
            fatorLinha = -1;
        
        if(alvo.coluna - peca.coluna > 0)//Define se a coluna irá aumentar ou diminuir
            fatorColuna = 1;
        else
            fatorColuna = -1;
                
        int linhaAux = peca.linha + fatorLinha;//Auxiliares para iteração
        int colunaAux = peca.coluna + fatorColuna;
        int qtdPecasEliminadas = 0;//Variável de apoio para retornar a quantidade de peças eliminadas pelo movimento
        
        boolean haviaPeca = false;
        
        while(linhaAux != alvo.linha && colunaAux != alvo.coluna){//Laço que passa por cada casa no caminho determinado pelas posições
            if(peca.tipo == 'w' || peca.tipo == 'W'){
                if(tabuleiro[linhaAux][colunaAux] == 'b' || tabuleiro[linhaAux][colunaAux] == 'B' && !haviaPeca)//Se nesta casa há uma peça adversária e não havia uma peça na casa anterior, grava que havia uma peça nesta casa
                    haviaPeca = true;
                else if(tabuleiro[linhaAux][colunaAux] == 'b' || tabuleiro[linhaAux][colunaAux] == 'B' && haviaPeca)//Se nesta casa há uma peça adversária e havia uma peça na casa anterior, jogada inválida
                    return -1;
                else if(tabuleiro[linhaAux][colunaAux] == 'w' || tabuleiro[linhaAux][colunaAux] == 'W')//Se nesta casa há uma peça aliada, jogada inválida
                    return -1;
                else if(haviaPeca){//Se a casa está vazia e havia uma peça na casa anterior, reseta a variável de controle e adiciona ao contador de peças eliminadas
                    haviaPeca = false;
                    qtdPecasEliminadas++;
                }
            }else{
                if(tabuleiro[linhaAux][colunaAux] == 'w' || tabuleiro[linhaAux][colunaAux] == 'W' && !haviaPeca)
                    haviaPeca = true;
                else if(tabuleiro[linhaAux][colunaAux] == 'w' || tabuleiro[linhaAux][colunaAux] == 'W' && haviaPeca)
                    return -1;
                else if(tabuleiro[linhaAux][colunaAux] == 'b' || tabuleiro[linhaAux][colunaAux] == 'B')
                    return -1;
                else if(haviaPeca){
                    haviaPeca = false;                    
                    qtdPecasEliminadas++;
                }
            }
            linhaAux += fatorLinha;//Atualização de variáveis de iteração
            colunaAux += fatorColuna;
        }
        return qtdPecasEliminadas;
    }
    
    public static int ValidaJogada(char[][] tabuleiro, Posicao peca, Posicao alvo) { //Valida uma jogada, retornando 0 caso seja inválida, 1 caso seja válida sem eliminação e 2 caso seja válida com eliminações
        //Falta adicionar eliminações para trás
        if(alvo.tipo != ' ')//Se a casa-alvo não estiver vazia, jogada inválida
            return 0;
        
        if(peca.linha - alvo.linha == 0 || peca.coluna - alvo.coluna == 0)
            return 0;
        
        if(peca.tipo == 'w' && peca.linha - alvo.linha == 1){//Verifica se a peça branca se locomoveu apenas uma linha em direção ao campo adversário
            if(peca.coluna - alvo.coluna != 1 && peca.coluna - alvo.coluna != -1) //Se a peça se locomoveu apenas uma linha e mais de uma coluna, jogada inválida
                return 0;            
            else
                return 1;
        }else if(peca.tipo == 'w' && peca.linha - alvo.linha == 2){//Verifica se a peça branca se locomoveu duas linhas em direção ao campo adversário
            if(peca.coluna - alvo.coluna != 2 && peca.coluna - alvo.coluna != -2)//Se a peça se locomoveu duas linhas e mais de duas colunas, jogada inválida
                return 0;
            else{
                if(peca.coluna - alvo.coluna == 2){ //Se a peça se locomoveu duas linhas e duas colunas, verifica se ela fez uma eliminação, se não jogada inválida
                    if(tabuleiro[peca.linha - 1][peca.coluna - 1] == 'b' || tabuleiro[peca.linha - 1][peca.coluna - 1] == 'B')
                        return 2;
                    else
                        return 0;                
                }else{ //Se a peça se locomoveu duas linhas e duas colunas, verifica se ela fez uma eliminação, se não jogada inválida
                    if(tabuleiro[peca.linha - 1][peca.coluna + 1] == 'b' || tabuleiro[peca.linha - 1][peca.coluna + 1] == 'B')
                        return 2;
                    else
                        return 0;
                }
            }
        }else if(peca.tipo == 'w' && peca.linha - alvo.linha == -2){//Verifica se a peça branca se locomoveu duas linhas em direção ao próprio campo.
            if(peca.coluna - alvo.coluna != 2 && peca.coluna - alvo.coluna != -2)//Se a peça se locomoveu duas linhas e mais de duas colunas, jogada inválida
                return 0;
            else{
                if(peca.coluna - alvo.coluna == 2){
                    if(tabuleiro[peca.linha + 1][peca.coluna - 1] == 'b' || tabuleiro[peca.linha + 1][peca.coluna - 1] == 'B')
                        return 2;
                    else
                        return 0;
                }else{
                    if(tabuleiro[peca.linha + 1][peca.coluna + 1] == 'b' || tabuleiro[peca.linha + 1][peca.coluna + 1] == 'b')
                        return 2;
                    else
                        return 0;
                }                    
            }           
        }else if(peca.tipo == 'b' && alvo.linha - peca.linha == 1){//Verifica se a peça preta se locomoveu apenas uma linha
            if(peca.coluna - alvo.coluna != 1 && peca.coluna - alvo.coluna != -1) //Se a peça se locomoveu apenas uma linha e mais de uma coluna, jogada inválida
                return 0;            
            else
                return 1;
        }else if(peca.tipo == 'b' && alvo.linha - peca.linha == 2){//Verifica se a peça preta se locomoveu duas linhas
            if(peca.coluna - alvo.coluna != 2 && peca.coluna - alvo.coluna != -2)//Se a peça se locomoveu duas linhas e mais de duas colunas, jogada inválida
                return 0;
            else{
                if(peca.coluna - alvo.coluna == 2){//Se a peça se locomoveu duas linhas e duas colunas, verifica se ela fez uma eliminação, se não jogada inválida
                    if(tabuleiro[peca.linha + 1][peca.coluna - 1] == 'w' || tabuleiro[peca.linha + 1][peca.coluna - 1] == 'W')
                        return 2;
                    else
                        return 0;
                }else{
                    if(tabuleiro[peca.linha + 1][peca.coluna + 1] == 'w' || tabuleiro[peca.linha + 1][peca.coluna + 1] == 'W')
                        return 2;
                    else
                        return 0;
                }
            }
        }else if(peca.tipo == 'b' && alvo.linha - peca.linha == -2){//Verifica se a peça branca se locomoveu duas linhas em direção ao próprio campo.
            if(peca.coluna - alvo.coluna != 2 && peca.coluna - alvo.coluna != -2)//Se a peça se locomoveu duas linhas e mais de duas colunas, jogada inválida
                return 0;
            else{
                if(peca.coluna - alvo.coluna == 2){
                    if(tabuleiro[peca.linha - 1][peca.coluna - 1] == 'w' || tabuleiro[peca.linha + 1][peca.coluna - 1] == 'W')
                        return 2;
                    else
                        return 0;
                }else{
                    if(tabuleiro[peca.linha - 1][peca.coluna + 1] == 'w' || tabuleiro[peca.linha + 1][peca.coluna + 1] == 'W')
                        return 2;
                    else
                        return 0;
                }                    
            }           
        }else if(peca.tipo == 'W' || peca.tipo == 'B'){//Se a peça for uma dama, simplesmente checa se manteve a diagonalidade e se as peças que passou por cima são válidas
            if((peca.coluna - alvo.coluna) == (peca.linha - alvo.linha) || (peca.coluna - alvo.coluna) == ((peca.linha - alvo.linha) * -1)){
                int aux = ChecaCaminho(tabuleiro, peca, alvo);
                if(aux == 0)
                    return 1;
                else if(aux > 0)
                    return 2;
                else
                    return 0;
            }else
                return 0;
        }        
        return 0;    
    }

    public static void main(String[] args) {
        //TODO: Imprimir Regras, Validar Jogadas, Realizar Jogadas, Alternar Vez, Definir Vitória, Permitir Empate, Garantir Máxima Eliminação (?) (Usando recursão), Consertar ValidaJogada
        ImprimeRegras();
        boolean vezBranco = true; //Variável de controle de vez
        int linhaPeca, colunaPeca; //Variáveis de entrada de seleção de peça para a jogada
        int linhaAlvo, colunaAlvo; //Variáveis de entrada de seleção de espaço a ser ocupado pela peça selecionada
        Scanner scan = new Scanner(System.in); //Scanner para leitura de input
        char[][] tabuleiro = InicializaTabuleiro(); //Preenche o tabuleiro com as posições iniciais
        while (Vitoria() == 0) { //Mantém o laço até que um jogar seja vitorioso
            MostraTabuleiro(tabuleiro); //Função que imprime o tabuleiro atual na tela
            System.out.println("\n\n");
            if (vezBranco) //Verifica e imprime de quem é a vez
            {
                System.out.println("Vez das peças brancas!");
            } else {
                System.out.println("Vez das peças pretas!");
            }
            do { //Laço de pós-teste para validação de escolha de peça              
                System.out.print("Insira a linha da peça que deseja mover: ");
                linhaPeca = scan.nextInt();
                linhaPeca--;
                System.out.print("Insira a coluna da peça que deseja mover: ");
                colunaPeca = scan.nextInt();
                colunaPeca--;
                //Adicionar IF para, caso seja 0 e 0, pergunte sobre empate
                if (linhaPeca < 0 || colunaPeca < 0 || linhaPeca > 7 || colunaPeca > 7) {
                    System.out.println("Jogada inválida! Por favor jogue novamente.\n\n\n");
                    continue;
                }
                if ((vezBranco && tabuleiro[linhaPeca][colunaPeca] != 'W' && tabuleiro[linhaPeca][colunaPeca] != 'w') || (!vezBranco && tabuleiro[linhaPeca][colunaPeca] != 'B' && tabuleiro[linhaPeca][colunaPeca] != 'b')) //Verifica se a peça selecionada é válida para o jogador da vez
                {
                    System.out.println("Essa posição na corresponde a uma peça sua. Por favor jogue novamente.\n\n\n");
                }
            } while ((vezBranco && tabuleiro[linhaPeca][colunaPeca] != 'W' && tabuleiro[linhaPeca][colunaPeca] != 'w') || (!vezBranco && tabuleiro[linhaPeca][colunaPeca] != 'B' && tabuleiro[linhaPeca][colunaPeca] != 'b'));
            Posicao peca = new Posicao(linhaPeca, colunaPeca, tabuleiro[linhaPeca][colunaPeca]);
            do {
                System.out.print("Insira a linha da casa que deseja ocupar: ");
                linhaAlvo = scan.nextInt();
                linhaAlvo--;
                System.out.print("Insira a coluna da casa que deseja ocupar: ");
                colunaAlvo = scan.nextInt();
                colunaAlvo--;
                if(linhaAlvo < 0 || colunaAlvo < 0 || linhaAlvo > 7 || colunaAlvo > 7){
                    System.out.println("Jogada inválida! Por favor jogue novamente.\n\n\n");
                    continue;
                }                    
                Posicao alvo = new Posicao(linhaAlvo, colunaAlvo, tabuleiro[linhaAlvo][colunaAlvo]);
                int jogadaValida = ValidaJogada(tabuleiro, peca, alvo);
                if (jogadaValida == 1) {
                    //Realizar jogada e alternar vez
                    break;
                }else if(jogadaValida == 2){
                    //Realizar jogada, executar eliminações e alternar vez
                    break;
                }else {
                    System.out.println("Jogada inválida. Por favor jogue novamente.\n\n\n");
                    continue;
                }
            } while (true);
        }
    }
}

package com.mycompany.felipe.higa.ac1;

import java.util.Scanner;

/**
 *
 * @author fehig
 */
public class ShowDoMilhao {

    /*
* Show do Milhão foi um programa de televisão brasileiro de perguntas e respostas,
* que concedia prêmios de até um milhão de reias. 

* Será elaborado uma versão simplificada do programa que seguirá as seguintes regras:
* - Serão feitas 7 perguntas ao jogador N (perguntar e armazenar o NOME).
* - Cada pergunta deverá valer uma quantidade X de dinheiro, aumentando a cada pergunta.
* - Cada pergunta deverá possuir quatro alternativas, sendo apenas uma delas a resposta correta.
* - Em caso de resposta correta, a quantidade X passa a ser o valor de sua "carteira".
* - Em caso de resposta incorreta, o jogador perde 20%, 50% e 100% de sua carteira a cada erro.
* - Se o jogador errar 3 vezes, ele perde o jogo e programa encerra.
* - Ao final de cada pergunta ou erro deverá ser perguntado se o jogador deseja continuar o jogo
*   ou sair com a quantidade de dinheiro em sua carteira. 
     */
    public static Scanner scan = new Scanner(System.in);

    // wallet recebe a quantidade de dinheiro possuida pelo jogador
    public static Double wallet;

    // lifes informa quantos erros o jogador ainda pode cometer
    // correctAnswer recebe qual o valor esperado como resposta
    public static Integer lifes, correctAnswer;

    // awnserIsCorret verifica se a resposta digitada pelo usuário é a correta
    // continueGame verifica se o jogo deverá prosseguir ou encerrar
    public static Boolean anwserIsCorrect, continueGame;

    public static void main(String[] args) {
        // questionNumber informa o número da pergunta que deverá ser exibida
        Integer questionNumber = 1;

        System.out.println("-------------------------------\n"
                + " Bem vindo ao Show do milhão! \n"
                + "-------------------------------");

        newGame();

        // enquanto o usurio desejar e possuir vidas, perguntas serão feitas a ele
        do {
            
            
            if (questionNumber > 1) {
                askIfContinue();
                if (!continueGame) {
                    gameOver();
                    break;
                }
            }

            newQuestion(questionNumber);
            questionNumber++;

            //encerra o jogo após 7 perguntas
            if (questionNumber == 8 && continueGame) {
                gameOver();
                break;
            }

        } while (continueGame && lifes > 0);

    }

    // configura um novo jogo
    public static void newGame() {
        // Recebe o nome do jogador
        String name;

        wallet = 0.0;
        lifes = 3;
        continueGame = true;

        System.out.println("Insira seu nome:");
        name = scan.nextLine();

        System.out.printf("Muito bem, %s, vamos a primeira pergunta!\n\n", name);
    }

    public static void newQuestion(Integer number) {
        // Quando inputAnswer for implementado como tipo Char os números nas alternativas devem ser
        // substituidos por A, B, C e D.  
        // reward recebe o valor em reais de cada pergunta        
        Double reward;

        switch (number) {
            case 1:
                reward = 500.00;
                correctAnswer = 1;

                System.out.printf("Valendo R$%.2f!\n\n"
                        + "Pergunta %d: \n"
                        + "Qual é o coletivo de cães?\n"
                        + "1)Matilha\t"
                        + "2)Rebanho\t"
                        + "3)Alcateia\t"
                        + "4)Manada\n", reward, number);

                readAnswer(reward);

                break;

            case 2:
                reward = 1000.00;
                correctAnswer = 2;
                System.out.printf("Valendo R$%.2f!\n\n"
                        + "Pergunta %d: \n"
                        + "Qual inseto transmite a doença de Chagas?\n"
                        + "1)Abelha\t"
                        + "2)Barbeiro\t"
                        + "3)Pulga\t"
                        + "4)Barata\n", reward, number);
                readAnswer(reward);
                break;

            case 3:
                reward = 1500.00;
                correctAnswer = 4;
                System.out.printf("Valendo R$%.2f!\n\n"
                        + "Pergunta %d: \n"
                        + "O adjetivo 'venoso' está relacionado a:\n"
                        + "1)Vela\t"
                        + "2)Vento\t"
                        + "3)Vênia\t"
                        + "4)Veia\n", reward, number);
                readAnswer(reward);
                break;

            case 4:
                reward = 50000.00;
                correctAnswer = 3;
                System.out.printf("Valendo R$%.2f!\n\n"
                        + "Pergunta %d: \n"
                        + "Qual é triângulo que tem todos os lados diferentes?\n"
                        + "1)Equilátero\t"
                        + "2)Isóceles\t"
                        + "3)Escaleno\t"
                        + "4)Trapézio\n", reward, number);
                readAnswer(reward);
                break;

            case 5:
                reward = 250000.00;
                correctAnswer = 2;
                System.out.printf("Valendo R$%.2f!\n\n"
                        + "Pergunta %d: \n"
                        + "Quem foi o último presidente do período da ditadura mílitar no Brasil?\n"
                        + "1)Costa e Silva\t"
                        + "2)João figueredo\t"
                        + "3)Ernesto Geisel\t"
                        + "4)Emílio Médici\n", reward, number);
                readAnswer(reward);
                break;

            case 6:
                reward = 500000.00;
                correctAnswer = 4;
                System.out.printf("Valendo R$%.2f!!\n\n"
                        + "Pergunta %d: \n"
                        + "Qual nome se dá à purificação por meio da água?\n"
                        + "1)Abolição\t"
                        + "2)Abnegação\t"
                        + "3)Abrupção\t"
                        + "4)Ablução\n", reward, number);
                readAnswer(reward);
                break;

            case 7:
                reward = 1000000.00;
                correctAnswer = 1;
                System.out.printf("Finalmente a pergunta de R$%.2f!!\n\n"
                        + "Pergunta %d: \n"
                        + "Qual é o antônimo de 'malograr'?\n"
                        + "1)Superar\t"
                        + "2)Desprezar\t"
                        + "3)Perder\t"
                        + "4)Elogiar\n", reward, number);
                readAnswer(reward);
                break;

        }
    }

    //Método para leitura da resposta do usário
    public static void readAnswer(Double questionReward) {
        Boolean invalidAnswer;
        // inputAnswer é a resposta digitada pelo úsuario para cada pergunta
        // obs: inputAnswer é uma var do tipo inteiro, mas futuramente deverá ser implementada como tipo Char     
        // A mudança deverá ser feita quando ensinado transformação de texto para upperCase e o tipo Char.
        Integer inputAnswer;
        do {
            System.out.println("\nDigite sua resposta:");
            inputAnswer = scan.nextInt();

            invalidAnswer = (inputAnswer > 4) || (inputAnswer < 1);

            if (invalidAnswer) {
                System.out.println("Resposta inválida\n");
            }

        } while (invalidAnswer);

        validateAnswer(inputAnswer, questionReward);

    }

    //Valida a resposta e altera o valor da carteira do usuario
    public static void validateAnswer(Integer userAnswer, Double questionPrize) {
        anwserIsCorrect = userAnswer == correctAnswer;

        if (anwserIsCorrect) {
            System.out.println("Resposta correta!");

            wallet = questionPrize;

            showInfo();

        } else {
            lifes--;
            System.out.printf("Resposta errada! %d tentativas restantes \n", lifes);

            //Penalizar erro
            switch (lifes) {
                case 2:
                    System.out.println("Você perdeu R$" + (0.20 * wallet));

                    wallet -= (0.2 * wallet);

                    //o jogador não pode ter uma "carteira" negativa
                    if (wallet < 0) {
                        wallet = 0.0;
                    }
                    showInfo();
                    break;

                case 1:
                    System.out.println("Você perdeu R$" + (0.50 * wallet));

                    wallet -= (0.5 * wallet);

                    if (wallet < 0) {
                        wallet = 0.;
                    }
                    showInfo();
                    break;

                case 0:
                    wallet = 0.;
                    gameOver();
                    break;

                default:
                    break;
            }

            if (lifes > 0) {
                //Perguntar se deseja sair
                askIfContinue();

                if (continueGame == false) {
                    gameOver();
                } else {
                    readAnswer(questionPrize);
                }
            }
        }

    }

    //Exibe mensagem de final de jogo
    public static void gameOver() {
        System.out.println("-------------------------------\n"
                + "          Fim de jogo!         \n"
                + "-------------------------------");
        if (wallet > 0) {
            System.out.printf("Parabéns, você ganhou R$%.2f!", wallet);
        } else {
            System.out.println("Que pena, você não ganhou nada.");
        }
    }

    // Verifica se o jogador deseja continuar jogando 
    public static void askIfContinue() {
        String userInput;
        Boolean invalidInput;
        Scanner scanAux = new Scanner(System.in);

        do {
            System.out.println("Deseja continuar? (sim/nao)");
            userInput = scanAux.next();

            invalidInput = (!"sim".equals(userInput)) && (!"nao".equals(userInput));

            if (invalidInput) {
                System.out.println("Resposta inválida");
            }

        } while (invalidInput);

        if ("nao".equals(userInput)) {
            continueGame = false;
        }
    }

    // Exibe a carteira autal do jogador
    public static void showInfo() {

        System.out.printf("No momento você possui R$%.2f\n\n", wallet);

    }

}

import java.util.Scanner;

public class App {
  // * Variáveis do Switch.*//
  static String dinheiro, resultado, hora, lanche, outrolanche, refri, outrorefri;
  static double valortempo, valorcomida, outracomida, valorbebida, outrabebida;

  public static void main(String[] args) {
    // * Variáveis do programa.*//
    int opcao, tempo, opcaocomida, opcaobebida, comida, maiscomida, bebida, maisbebida, pagamento,
        escolhafim;
    double total;
    Scanner dados = new Scanner(System.in);

    // * Parte introdutória do programa.*//
    do {
      System.out.println("                              ");
      System.out.println("Seja Bem-Vindo ao Geek Club!");
      System.out.println("                              ");
      System.out.println(
          "Somos um novo conceito de Park Tech, líder na América Latina com vários ambientes temáticos do mundo Nerd!");
      System.out.println("------------------------------");
      System.out.println("Vamos juntos embarcar nessa aventura cheia de diversões? VEM COMIGO!");
      System.out.println(
          "Nesse mês de Dezembro estamos trazendo muito entretenimento, com valores promocionais, especialmente para vocês.");
      System.out.println("                              ");
      System.out.println(
          "Para adquirir sua passagem para o mundo da diversão, você terá que escolher um entretenimento, o tempo que deseja se divertir, e poderá também escolher o que deseja comer e beber.");
      System.out.println("------------------------------");
      System.out.println("APROVEITE SUA EXPERIÊNCIA!");
      System.out.println("                               ");

      // *1ª entrada do usuário, escolha de entretenimento.*//
      do {
        System.out.print(
            "Comece escolhendo para qual diversão você deseja se aventurar hoje: \n 1: Salão de Games. \n 2: Boliche. \n 3: Pista de Patinação. \n 4: Sair do Menu. \n Opção escolhida: ");
        opcao = dados.nextInt();
        // * 1º switch para escolha de entretenimento.*//
        switch (opcao) {

          case 1:
            resultado = ("Salão de Games");
            break;
          case 2:
            resultado = ("Boliche");
            break;
          case 3:
            resultado = ("Pista de Patinação");
            break;
          case 4:
            resultado = ("Sair do Menu.");
            System.out.print("Você escolheu a opção Sair do Menu. Obrigado pela visita e volte sempre!");
            System.exit(4);
            break;
        }
        System.out.println("                               ");
        if (opcao > 4 || opcao == 0) {
          System.out.println("Você escolheu uma opção inválida!");
          System.out.println("                               ");
        }
      } while (opcao > 4 || opcao == 0);

      // *Print da 1ª escolha do usuário.*//
      System.out.print("Que legal! A sua escolha de hoje para se divertir foi " + resultado);

      // *2ª entrada do usuário, escolha do tempo de entretenimento.*//
      do {
        System.out.println("                               ");
        System.out.print(
            "Agora escolha qual o tempo que você deseja se divertir conosco hoje:\n 1: 2 horas. \n 2: 5 horas. \n 3: Diária. \n 4: Sair do Menu. \n Opção escolhida: ");
        tempo = dados.nextInt();
        // * 2º switch para escolha do tempo de entretenimento.*//
        switch (tempo) {

          case 1:
            hora = ("2 horas");
            valortempo = 35.0;
            break;
          case 2:
            hora = ("5 horas");
            valortempo = 75.0;
            break;
          case 3:
            hora = ("Diária");
            valortempo = 100.0;
            break;
          case 4:
            hora = ("Sair do Menu.");
            System.out.print("Você escolheu a opção Sair do Menu. Obrigado pela visita e volte sempre!");
            System.exit(4);
            break;
        }
        if (tempo > 4 || tempo == 0) {
          System.out.println("                               ");
          System.out.println("Você escolheu uma opção inválida!");
        }
      } while (tempo > 4 || tempo == 0);

      // *Print da 2ª escolha do usuário.*//
      System.out.println("                               ");
      System.out.print("Que Massa! A sua opção de tempo escolhida foi " + resultado);
      System.out.print(" por " + hora);

      // *3ª entrada do usuário, escolha de comida.*//
      do {
        System.out.println("                               ");
        System.out.print(
            "Agora escolha qual comida você quer pedir hoje:\n 1: Batata Frita. \n 2: Hambuguer. \n 3: Hot-Dog. \n 4: Nenhuma das opções acima. \n 5: Sair do Menu. \n Opção escolhida: ");
        comida = dados.nextInt();
        // * 3º switch para escolha de comida.*//
        switch (comida) {

          case 1:
            lanche = ("Batata Frita");
            valorcomida = 20.0;
            break;
          case 2:
            lanche = ("Hambuguer");
            valorcomida = 25.0;
            break;
          case 3:
            lanche = ("Hot-Dog");
            valorcomida = 15.0;
            break;
          case 4:
            lanche = ("Nenhuma das opções.");
            System.out.println("Você escolheu a opção Nenhuma das opções. Anotado, vamos seguir!");
            break;
          case 5:
            lanche = ("Sair do Menu.");
            System.out.print("Você escolheu a opção Sair do Menu. Obrigado pela visita e volte sempre!");
            System.exit(5);
            break;
        }
        if (comida > 5 || comida == 0) {
          System.out.println("                               ");
          System.out.println("Você escolheu uma opção inválida!");
        }
      } while (comida > 5 || comida == 0);

      // *1º Print de retorno para adicionar mais comida.*//
      do {
        System.out.println("                               ");
        System.out.print(
            "Você deseja incluir mais algum item na opção de comida? Responda abaixo:\n 1: Sim. \n 2: Não \n Opção escolhida: ");
        opcaocomida = dados.nextInt();
        if (opcaocomida > 2 || opcaocomida == 0) {
          System.out.println("                               ");
          System.out.println("Você escolheu uma opção inválida!");
        }
      } while (opcaocomida > 2 || opcaocomida == 0);

      if (opcaocomida == 1) {
        do {
          System.out.println("                               ");
          System.out.print(
              "Escolha outra opção de comida que você deseja pedir hoje:\n 1: Batata Frita. \n 2: Hambuguer. \n 3: Hot-Dog. \n 4: Nenhuma das opções acima. \n Opção escolhida: ");
          maiscomida = dados.nextInt();
          switch (maiscomida) {

            case 1:
              outrolanche = ("Batata Frita");
              outracomida = 20.0;
              break;
            case 2:
              outrolanche = ("Hambuguer");
              outracomida = 25.0;
              break;
            case 3:
              outrolanche = ("Hot-Dog");
              outracomida = 15.0;
              break;
            case 4:
              outrolanche = ("Nenhuma das opções.");
              System.out.println("Você escolheu a opção Nenhuma das opções. Anotado, vamos seguir!");
              break;
          }
          if (maiscomida > 4 || maiscomida == 0) {
            System.out.println("                               ");
            System.out.println("Você escolheu uma opção inválida!");
          }
        } while (maiscomida > 4 || maiscomida == 0);
      }

      System.out.println("                               ");
      System.out.print("Que delícia, excelente escolha! A sua comida escolhida para hoje foi " + lanche);
      System.out.println(" e " + outrolanche);

      // *Quarta entrada do usuário, escolher a bebida.*//
      do {
        System.out.println("                               ");
        System.out.print(
            "Por fim, escolha qual bebida você quer pedir hoje:\n 1: Coca-cola. \n 2: Suco. \n 3: Água. \n 4: Nenhuma das opções acima. \n 5: Sair do Menu. \n Opção escolhida: ");
        bebida = dados.nextInt();
        // * Quarto switch para escolha de bebida.*//
        switch (bebida) {

          case 1:
            refri = ("Coca-Cola");
            valorbebida = 10.0;
            break;
          case 2:
            refri = ("Suco");
            valorbebida = 8.0;
            break;
          case 3:
            refri = ("Água");
            valorbebida = 5.0;
            break;
          case 4:
            refri = ("Nenhuma das opções.");
            System.out.println("Você escolheu a opção Nenhuma das opções. Anotado, vamos seguir!");
            break;
          case 5:
            refri = ("Sair do Menu.");
            System.out.println("Você escolheu a opção Sair do Menu. Obrigado pela visita e volte sempre!");
            System.exit(5);
            break;
        }
        if (bebida > 5 || bebida == 0) {
          System.out.println("                               ");
          System.out.println("Você escolheu uma opção inválida!");
        }
      } while (bebida > 5 || bebida == 0);

      // *2º Print de retorno para adicionar mais bebida.*//
      do {
        System.out.println("                               ");
        System.out.print(
            "Você deseja incluir mais algum item na opção de bebida? Responda abaixo:\n 1: Sim. \n 2: Não \n Opção escolhida: ");
        opcaobebida = dados.nextInt();

        if (opcaobebida > 2 || opcaobebida == 0) {
          System.out.println("                               ");
          System.out.println("Você escolheu uma opção inválida!");
        }
      } while (opcaobebida > 2 || opcaobebida == 0);

      if (opcaobebida == 1) {
        do {
          System.out.println("                               ");
          System.out.print(
              "Escolha outra opção de bebida que você deseja pedir hoje:\n 1: Coca-cola. \n 2: Suco. \n 3: Água. \n 4: Nenhuma das opções acima. \n Opção escolhida: ");
          maisbebida = dados.nextInt();
          switch (maisbebida) {
            case 1:
              outrorefri = ("Coca-Cola");
              outrabebida = 10.0;
              break;
            case 2:
              outrorefri = ("Suco");
              outrabebida = 8.0;
              break;
            case 3:
              outrorefri = ("Água");
              outrabebida = 5.0;
              break;
            case 4:
              outrorefri = ("Nenhuma das opções.");
              System.out.println("Você escolheu a opção Nenhuma das opções. Anotado, vamos seguir!");
              break;
          }
          if (maisbebida > 4 || maisbebida == 0) {
            System.out.println("                               ");
            System.out.println("Você escolheu uma opção inválida!");
          }
        } while (maisbebida > 4 || maisbebida == 0);
      }

      // *Print da 4ª entrada escolhida pelo usuário.*//
      System.out.println("                               ");
      System.out.print("Excelentes escolhas! Sua bebida escolhida para hoje foi " + refri);
      System.out.println(" e " + outrorefri);

      // *Parte final do programa.*//
      System.out.println("                                ");
      System.out.println("------------------------------");
      System.out.println("                                ");
      // * Relação dos itens escolhidos.*//
      System.out.println("Fica ligado! Segue os seus itens escolhidos para a sua aventura de hoje: ");
      System.out.println("Para entretenimento: " + resultado);
      System.out.print("Para tempo: " + hora);
      System.out.println(" | R$ " + valortempo);
      System.out.print("Sua comida: " + lanche);
      System.out.print(" e " + outrolanche);
      System.out.print(" | R$ " + valorcomida);
      System.out.println(" | R$ " + outracomida);
      System.out.print("Sua bebida: " + refri);
      System.out.print(" e " + outrorefri);
      System.out.print(" | R$ " + valorbebida);
      System.out.print(" | R$ " + outrabebida);
      System.out.println("                                ");
      System.out.println("------------------------------");
      System.out.println("                                ");

      // * Print do valor total da conta.*//
      total = valortempo + valorcomida + valorbebida + outracomida + outrabebida;
      System.out.print("O valor total dos itens escolhidos foram R$ " + total);
      System.out.println("                                ");

      // *Quinta entrada do usuário, escolher a forma de pagamento.*//
      System.out.print(
          "Então, qual a sua forma de pagamento dos itens escolhidos? \n 1: Dinheiro. \n 2: Pix. \n 3: Débito. \n 4: Crédito. \n 5: Sair do Menu. \n Opção escolhida:");
      pagamento = dados.nextInt();

      // * Quinto switch para escolha da forma de pagamento.*//
      switch (pagamento) {

        case 1:
          dinheiro = ("Dinheiro.");
          break;
        case 2:
          dinheiro = ("PIX");
          break;
        case 3:
          dinheiro = ("Débito.");
          break;
        case 4:
          dinheiro = ("Crédito.");
          break;
        case 5:
          dinheiro = ("Sair do Menu.");
        default:
          System.out.println("Você escolheu a opção Sair do Menu. Obrigado pela visita e volte sempre!");
          System.exit(5);
          break;
      }
      // *Print da quinta entrada escolhida pelo usuário.*//
      System.out.println("Sua forma de pagmento escolhida foi " + dinheiro);
      System.out.println("                                ");
      System.out.println("------------------------------");
      System.out.println("                                ");
      System.out.println("Muito bom! Obrigada por nos escolher, tenha um excelente dia e experiência no Geek Club!  ");
      System.out.println("                                ");

      do {
        System.out.println("------------------------------");
        System.out.println("                                ");
        System.out
            .print("Você deseja incluir mais alguma coisa? Responda abaixo:\n 1: Sim. \n 2: Não \n Opção escolhida: ");
        escolhafim = dados.nextInt();

        if (escolhafim > 2 || escolhafim == 0) {
          System.out.println("                                ");
          System.out.println("Você escolheu uma opção inválida!");
          System.out.println("                                ");
        }
      } while (escolhafim > 2 || escolhafim == 0);

      if (escolhafim == 2) {
        System.out.println("Você escolheu a opção Não, você deseja sair do menu. Obrigado pela visita e volte sempre!");
        System.out.println("                                ");
        System.out.println("------------------------------");
        System.exit(2);
      }
      if (escolhafim == 1) {
        System.out.println("                                ");
        System.out.println("------------------------------");
        System.out.println("                                ");
        System.out.println("Vamos voltar ao menu inicial!");
        System.out.println("                                ");
      }
    } while (escolhafim == 1);
  }
}
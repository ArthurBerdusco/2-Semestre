
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class MenuDaConta2 {

    static int numeroConta = 0, opcao, posicaoLista;
    static double saldo;
    static Conta conta = new Conta();
    static ArrayList<Conta> listaDeContas = new ArrayList<>();

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        opcao = 1;
        do {
            System.out.println("\n+-----------------+");
            System.out.println("|  Menu Da Conta  |");
            System.out.println("+-----------------+");
            System.out.println("| 1 - Nova Conta  |");
            System.out.println("| 2 - Depositar   |");
            System.out.println("| 3 - Sacar       |");
            System.out.println("| 4 - Ver Saldo   |");
            System.out.println("| 5 - Listar      |");
            System.out.println("| 6 - Sair        |");
            System.out.println("+-----------------+");
            System.out.println("Sua opcao:");
            opcao = entrada.nextInt();
            switch (opcao) {
                case 1: {
                    novaConta(listaDeContas);
                    break;
                }
                case 2: {
                    depositar(listaDeContas);
                    break;
                }
                case 3: {
                    sacar(listaDeContas);
                    break;
                }
                case 4: {
                    verSaldo(listaDeContas);
                    break;
                }
                case 5: {
                    listar(listaDeContas);
                    break;
                }
                default:
                    System.out.println("Opcao Invalida");
            }
        } while (opcao != 6);
    }

    public static void novaConta(ArrayList<Conta> listaDeContas) {

        Scanner entrada = new Scanner(System.in);

        String nomeTitular = "";
        do {

            System.out.println("\n+--------------+");
            System.out.println("|  Nova Conta  |");
            System.out.println("+--------------+");
            System.out.println("Informe nome do titular [Enter=Retornar]: ");
            nomeTitular = entrada.nextLine();

            if (nomeTitular.length() > 0) {
                numeroConta++;

                Conta conta = new Conta();
                conta.setNumero(numeroConta);
                conta.setNomeTitular(nomeTitular);
                conta.setSaldo(0);
                listaDeContas.add(conta);
            }
            //
        } while (nomeTitular.length() > 0);
    }

    public static void verSaldo(ArrayList<Conta> listaDeContas) {
        System.out.println("\n+--------------+");
        System.out.println("|  Ver Saldo   |");
        System.out.println("+--------------+");
        pesquisar(listaDeContas);
        if (posicaoLista != -1) {
            System.out.println("Nome do titular: " + listaDeContas.get(posicaoLista).getNomeTitular());
            System.out.println("Saldo atual: " + listaDeContas.get(posicaoLista).getSaldo() + "\n\n");
        }
        tecleParaContinuar();
    }

    public static void depositar(ArrayList<Conta> listaDeContas) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("\n+--------------+");
        System.out.println("|  Depositar   |");
        System.out.println("+--------------+");
        pesquisar(listaDeContas);
        if (posicaoLista != -1) {
            Conta conta = new Conta();
            conta = listaDeContas.get(posicaoLista);
            System.out.println("Nome do titular: " + conta.getNomeTitular());
            System.out.println("Saldo atual: " + conta.getSaldo() + "\n");
            System.out.print("Informe valor do deposito: ");
            conta.depositar(entrada.nextDouble());
            listaDeContas.get(posicaoLista).setSaldo(conta.getSaldo());
        }
    }

    public static void sacar(ArrayList<Conta> listaDeContas) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("\n+--------------+");
        System.out.println("|  Sacar       |");
        System.out.println("+--------------+");
        pesquisar(listaDeContas);
        if (posicaoLista != -1) {
            Conta conta = new Conta();
            System.out.println("Nome do titular: " + listaDeContas.get(posicaoLista).getNomeTitular());
            System.out.println("Saldo atual: " + listaDeContas.get(posicaoLista).getSaldo() + "\n");
            System.out.print("Informe valor do saque: ");
            double valorSaque = entrada.nextDouble();
            conta = listaDeContas.get(posicaoLista);
            if (conta.sacar(valorSaque)) {
                System.out.println("Saque realizado com sucesso ");
                System.out.println("Saldo atual: "
                        + listaDeContas.get(posicaoLista).getSaldo() + "\n");
                listaDeContas.get(posicaoLista).setSaldo(conta.getSaldo());
            } else {
                System.out.println("Saldo insuficiente");
            }
        }
    }

    public static void listar(ArrayList<Conta> listaDeContas) {
        int qtde = listaDeContas.size();
        System.out.println("\n+----------------+");
        System.out.println("|  Listar        |");
        System.out.println("+----------------+");
        for (int i = 0; i < qtde; i++) {
            String dadosConta = "Nr: " + listaDeContas.get(i).getNumero() + " Titular: "
                    + listaDeContas.get(i).getNomeTitular() + "  Saldo Atual: "
                    + listaDeContas.get(i).getSaldo();
            System.out.println(dadosConta);
        }
        tecleParaContinuar();
    }

    public static void pesquisar(ArrayList<Conta> listaDeContas) {

        Scanner entrada = new Scanner(System.in);
        Conta conta = new Conta();
        String nomeTitular = "";

        System.out.print("Informe numero da Conta: ");
        int numeroConta = entrada.nextInt();
        pesquisarConta(listaDeContas, numeroConta);

    }

    public static void pesquisarConta(ArrayList<Conta> listaDeContas, int numeroPesq) {

        int qtde = listaDeContas.size();
        posicaoLista = -1;
        for (int i = 0; i < qtde; i++) {
            if (listaDeContas.get(i).getNumero() == numeroPesq) {
                posicaoLista = i;
                break;
            }
        }
        if (posicaoLista == -1) {
            System.out.println("---------------------------");
            System.out.println("Conta nÃ£o localizada!!! ");
            System.out.println("---------------------------");
        }
    }

    public static void clearScreen() {
        try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (Exception E) {
            System.out.println(E);
        }
    }

    public static void tecleParaContinuar() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("============================");
        System.out.println("Tecle algo para continuar...");
        System.out.println("============================");
        try {
            System.in.read();
            entrada.nextLine();
        } catch (Exception e) {
        }
    }

}

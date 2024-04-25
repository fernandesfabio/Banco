import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        String nome = "Fabio Fernandes";
        String tipoConta = "Corrente";
        double saldo = 2500.00;
        int opcao =0;

        System.out.println("**********************************");
        System.out.println("\nNome do Cliente: "+ nome);
        System.out.println("Tipo de conta: "+ tipoConta);
        System.out.println("Saldo Atual: "+ saldo);
        System.out.println("\n**********************************");

        String menu = """
                ** Digite sua opção **
                1 - Consultar saldo
                2 - Transferir valor
                3 - receber valor
                4 - sair
                """;
        Scanner leitura = new Scanner(System.in);
        while(opcao != 4){
            System.out.println(menu);
            opcao = leitura.nextInt();
            if(opcao == 1) {
                System.out.println("Saldo Atual R$ : " + saldo);
            } if(opcao == 2) {
                System.out.println("Qual o valor que deseja transferir:");
                double valor = leitura.nextDouble();
                if(valor > saldo) {
                    System.out.println("Saldo insuficiete");
                }else {
                    saldo -= valor;
                }
            } else if (opcao == 3) {
                System.out.println("Valor a receber:");
                 double valor = leitura.nextDouble();
                 saldo += valor;

            } else if(opcao > 4) {
                System.out.println("Número Invalido");
            }
        }

    }

    }

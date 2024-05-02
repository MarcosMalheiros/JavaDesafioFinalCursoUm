import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String name = "Jacqueline Oliveira";
        String typeAccount = "Corrente";
        double balance = 1599.99;
        int option = 0;

        System.out.println("***************");
        System.out.println("\nNome do cliente: " + name);
        System.out.println("Tipo conta: " + typeAccount);
        System.out.println("Saldo atual: R$ " + balance);
        System.out.println("\n***************");

        String menu = """ 
                         Operações
                         1 - Consultar saldos
                         2 - Transferir valor
                         3 - Receber valor
                         4 - Sair
                         
                         
                         """;

        Scanner reading = new Scanner(System.in);

        while (option != 4) {
            System.out.println(menu);
            option = reading.nextInt();

            if (option == 1){
                System.out.println("O saldo atualizado é: " + balance);
            } else if (option == 2) {
                System.out.println("Qual o valor que deseja tranferir");
                double value = reading.nextDouble();
                if (value > balance) {
                    System.out.println("Não há saldo para realizar a transferência");
                } else {
                    balance -= value;
                    System.out.println("Saldo atual é: " + balance);
                }
            } else if (option == 3) {
                System.out.println("Valor recebido: " );
                double value = reading.nextDouble();
                balance += value;
            } else if (option != 4) {
                System.out.println("Opcão invalida");
            }
        }
    }
}
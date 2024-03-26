import java.util.Scanner;

public class desafio {
    public static void main(String[] args) {
        String nome = "Marcos Paulo Machado";
        String conta = "Corrente";
        double saldo = 2500.00;
        int opcao = 0;


        System.out.println("**************************");
        System.out.println("\nNome do cliente: " + nome);
        System.out.println("Conta: " +conta);
        System.out.println("Saldo atual: " + saldo);
        System.out.println("\n**************************");

        String menu = """
                ** Digite sua opção **
                 1- Consultar saldo.
                 2- Tranferir valor.
                 3- Receber valor.
                 4- Sair.
                """;
        Scanner ler = new Scanner(System.in);
        while (opcao != 4){
            System.out.println(menu);
            opcao = ler.nextInt();

            if (opcao == 1) {
                System.out.println("Saldo disponivel: " + saldo);
            } else if (opcao == 2) {
                System.out.println("Informe quanto deseja tranferir: ");
                double tranferir = ler.nextDouble();
                if (tranferir > saldo){
                    System.out.println("Saldo insuficiente!");
                }else {
                    saldo -= tranferir;
                    System.out.println("Saldo disponivel: " + saldo);
                }
            } else if (opcao == 3) {
                System.out.println("Informe quanto quer depositar: ");
                double recebe = ler.nextDouble();
                saldo += recebe;
                System.out.println("Saldo disponivel: " + saldo);
            } else if (opcao > 4) {
                System.out.println("Por favor escolha uma opção valida!");
            }

        }

    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Hotel hotel = new Hotel();
        int opcao;

        do {
            System.out.println("\n--- Sistema de Reserva de Hotel ---");
            System.out.println("1. Fazer Reserva");
            System.out.println("2. Consultar Reservas");
            System.out.println("3. Cancelar Reserva");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();  // Limpar o buffer de entrada

            switch (opcao) {
                case 1:
                    // Fazer Reserva
                    System.out.print("Digite seu nome: ");
                    String nomeCliente = scanner.nextLine();
                    System.out.print("Digite o tipo de quarto (Ex: Simples, Duplo, Suite): ");
                    String tipoQuarto = scanner.nextLine();
                    System.out.print("Digite a quantidade de dias: ");
                    int dias = scanner.nextInt();
                    scanner.nextLine();  // Limpar o buffer de entrada
                    hotel.fazerReserva(nomeCliente, tipoQuarto, dias);
                    break;

                case 2:
                    // Consultar Reservas
                    System.out.println("\n--- Reservas Atuais ---");
                    hotel.consultarReservas();
                    break;

                case 3:
                    // Cancelar Reserva
                    System.out.print("Digite o ID da reserva a ser cancelada: ");
                    int idReserva = scanner.nextInt();
                    scanner.nextLine();  // Limpar o buffer de entrada
                    hotel.cancelarReserva(idReserva);
                    break;

                case 4:
                    // Sair
                    System.out.println("Saindo do sistema...");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }

        } while (opcao != 4);

        scanner.close();
    }
}

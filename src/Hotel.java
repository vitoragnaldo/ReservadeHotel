import java.util.ArrayList;
import java.util.List;

public class Hotel {
    private List<Reserva> reservas;

    // Construtor
    public Hotel() {
        this.reservas = new ArrayList<>();
    }

    // Método para fazer uma reserva
    public void fazerReserva(String nomeCliente, String tipoQuarto, int dias) {
        Reserva reserva = new Reserva(nomeCliente, tipoQuarto, dias);
        reservas.add(reserva);
        System.out.println("Reserva realizada com sucesso! ID da reserva: " + reserva.getId());
    }

    // Método para consultar todas as reservas
    public void consultarReservas() {
        if (reservas.isEmpty()) {
            System.out.println("Não há reservas no momento.");
        } else {
            for (Reserva reserva : reservas) {
                System.out.println(reserva.exibirDetalhes());
            }
        }
    }

    // Método para cancelar uma reserva
    public boolean cancelarReserva(int idReserva) {
        for (Reserva reserva : reservas) {
            if (reserva.getId() == idReserva) {
                reservas.remove(reserva);
                System.out.println("Reserva com ID " + idReserva + " cancelada com sucesso.");
                return true;
            }
        }
        System.out.println("Reserva com ID " + idReserva + " não encontrada.");
        return false;
    }
}

import java.util.Date;

public class Reserva {
    private static int contador = 1; // Para gerar um ID único para cada reserva
    private int id;
    private String nomeCliente;
    private String tipoQuarto;
    private int dias;
    private Date dataReserva;

    // Construtor
    public Reserva(String nomeCliente, String tipoQuarto, int dias) {
        this.id = contador++;
        this.nomeCliente = nomeCliente;
        this.tipoQuarto = tipoQuarto;
        this.dias = dias;
        this.dataReserva = new Date(); // Data e hora atuais
    }

    // Getters e Setters
    public int getId() {
        return id;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public String getTipoQuarto() {
        return tipoQuarto;
    }

    public int getDias() {
        return dias;
    }

    public Date getDataReserva() {
        return dataReserva;
    }

    // Método para exibir os detalhes da reserva
    public String exibirDetalhes() {
        return "ID Reserva: " + id + " | Nome Cliente: " + nomeCliente + " | Tipo de Quarto: " + tipoQuarto +
                " | Dias: " + dias + " | Data Reserva: " + dataReserva;
    }
}
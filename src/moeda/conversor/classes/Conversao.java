package moeda.conversor.classes;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Conversao {
    private String base_code;
    private String target_code;
    private double amount;
    private double conversion_rate;
    private double conversion_result;
    private String time_last_update_utc;

    public Conversao(String base_code, String target_code, double amount, double conversion_rate, double conversion_result, String time_last_update_utc) {
        this.base_code = base_code;
        this.target_code = target_code;
        this.amount = amount;
        this.conversion_rate = conversion_rate;
        this.conversion_result = conversion_result;
        this.time_last_update_utc = time_last_update_utc;
    }

    public String getTime_last_update_utc() {
        ZonedDateTime agora = ZonedDateTime.now(ZoneId.of("America/Sao_Paulo"));
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        String dataHoraFormatada = agora.format(formatter);
        return dataHoraFormatada;
    }

    @Override
    public String toString() {
        return String.format("%nData da Conversão = %s " +
                "%nValor do câmbio, 1 %s para %.4f %s" +
                "%nValor convertido = %.2f %s" +
                "%n------------------------------------------------------", getTime_last_update_utc(), base_code, conversion_rate, target_code, conversion_result, target_code);
    }

}
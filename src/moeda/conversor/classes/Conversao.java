package moeda.conversor.classes;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Conversao {
    private final String base_code;
    private final String target_code;
    private final double conversion_rate;
    private final double conversion_result;

    public Conversao(String base_code, String target_code, double amount, double conversion_rate, double conversion_result, String time_last_update_utc) {
        this.base_code = base_code;
        this.target_code = target_code;
        this.conversion_rate = conversion_rate;
        this.conversion_result = conversion_result;
    }

    public String getTime_last_update_utc() {
        ZonedDateTime agora = ZonedDateTime.now(ZoneId.of("America/Sao_Paulo"));
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        return agora.format(formatter);
    }

    @Override
    public String toString() {
        return String.format("%nData da Conversão = %s " +
                "%nValor do câmbio, 1 %s para %.4f %s" +
                "%nValor convertido = %.2f %s" +
                "%n------------------------------------------------------", getTime_last_update_utc(), base_code, conversion_rate, target_code, conversion_result, target_code);
    }

}
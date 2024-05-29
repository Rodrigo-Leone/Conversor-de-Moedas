package moeda.conversor.consultaApi;

import com.google.gson.Gson;
import moeda.conversor.classes.Conversao;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaConversao {

    public Conversao buscaConversao(String base_code, String target_code, String amount) {

        String key = "ab54ff237b443bc50c8c85bc";
        URI api = URI.create("https://v6.exchangerate-api.com/v6/" + key + "/pair/" + base_code + "/" + target_code + "/" + amount);

            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(api)
                    .build();
        try {
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            System.out.println("------------------------------------------------------");
            System.out.println("Resultado da conversão de " + base_code + " para " + target_code);
            System.out.printf("Valor em %s para conversão = %s", base_code, amount.replace(".", ","));
            return new Gson().fromJson(response.body(), Conversao.class);

        } catch (Exception e) {
            System.out.println("Algo deu errado!");
            throw new RuntimeException("Algo deu errado com a requisição!");
        }
    }
}

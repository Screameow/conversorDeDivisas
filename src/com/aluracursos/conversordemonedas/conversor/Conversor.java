package com.aluracursos.conversordemonedas.conversor;

import com.aluracursos.conversordemonedas.modelos.Moneda;
import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;


public class Conversor {

public void imprimeMensaje() {

        System.out.println("********************************************");
        System.out.println("| Escoje las monedas que deseas convertir  |");
        System.out.println("| 1- Peso Mexicano a Dolar                 |");
        System.out.println("| 2- Peso Argentino a Dolar                |");
        System.out.println("| 3- Peso Colombiano a Dolar               |");
        System.out.println("| 4- Peso Mexicano a Euro                  |");
        System.out.println("| 5- Euro a Dolar                          |");
        System.out.println("| 6- Yen a Dolar                           |");
        System.out.println("| 7- Salir                                 |");
        System.out.println("********************************************");
    };

public double llamarAPI(String direccion, double cantidadDeMoneda, String monedaAConvertir) throws IOException, InterruptedException {

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(direccion))
                .build();
        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        String json = response.body();

        Gson gson = new Gson();

        Moneda monedaApi = gson.fromJson(json, Moneda.class);
        double monedaConversora = monedaApi.getValorDeMoneda().get(monedaAConvertir);

        double resultado = cantidadDeMoneda * monedaConversora;
        return resultado;
        }
}

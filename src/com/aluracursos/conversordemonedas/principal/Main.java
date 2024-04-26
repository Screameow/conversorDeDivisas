package com.aluracursos.conversordemonedas.principal;


import com.aluracursos.conversordemonedas.conversor.Conversor;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {

        int respuesta = 0;

        Conversor conversor = new Conversor();
        Scanner teclado = new Scanner(System.in);

try {
    while (respuesta != 7) {
        conversor.imprimeMensaje();
        respuesta = teclado.nextInt();
        switch (respuesta) {
            case 1: {
                System.out.println("Cantidad de pesos a convertir: ");
                double cantidadDeMoneda = teclado.nextDouble();
                String outputRespuesta = String.valueOf(respuesta).replaceAll("1", "MXN");
                String monedaAConvertir = "USD";

                String direccion = "https://v6.exchangerate-api.com/v6/9b59d85b1711ba43a923571d/latest/" + outputRespuesta;
                Conversor conversorApi = new Conversor();
                double resultado = conversorApi.llamarAPI(direccion, cantidadDeMoneda, monedaAConvertir);

                String interpretacionPeso = (cantidadDeMoneda > 1) ? "pesos" : "peso";
                String interpretacionDolar = (resultado > 1) ? " dolares" : (resultado < 1 ? " de dolar" : (resultado == 1 ? " dolar" : ""));

                System.out.println(cantidadDeMoneda + " " + interpretacionPeso + " " + "equivalen a " + resultado + interpretacionDolar);
                break;
            }
            case 2: {
                System.out.println("Cantidad de pesos a convertir");
                double cantidadDeMoneda = teclado.nextDouble();
                String outputRespuesta = String.valueOf(respuesta).replaceAll("2", "ARS");
                String monedaAConvertir = "USD";

                String direccion = "https://v6.exchangerate-api.com/v6/9b59d85b1711ba43a923571d/latest/" + outputRespuesta;
                Conversor conversorApi = new Conversor();
                double resultado = conversorApi.llamarAPI(direccion, cantidadDeMoneda, monedaAConvertir);

                String interpretacionPeso = (cantidadDeMoneda > 1) ? "pesos" : "peso";
                String interpretacionDolar = (resultado > 1) ? " dolares" : (resultado < 1 ? " de dolar" : (resultado == 1 ? " dolar" : ""));

                System.out.println(cantidadDeMoneda + " " + interpretacionPeso + " " + "equivalen a " + resultado + interpretacionDolar);
                break;
            }
            case 3: {
                System.out.println("Cantidad de pesos a convertir");
                double cantidadDeMoneda = teclado.nextDouble();
                String outputRespuesta = String.valueOf(respuesta).replaceAll("3", "COP");
                String monedaAConvertir = "USD";

                String direccion = "https://v6.exchangerate-api.com/v6/9b59d85b1711ba43a923571d/latest/" + outputRespuesta;
                Conversor conversorApi = new Conversor();
                double resultado = conversorApi.llamarAPI(direccion, cantidadDeMoneda, monedaAConvertir);

                String interpretacionPeso = (cantidadDeMoneda > 1) ? "pesos" : "peso";
                String interpretacionDolar = (resultado > 1) ? " dolares" : (resultado < 1 ? " de dolar" : (resultado == 1 ? " dolar" : ""));

                System.out.println(cantidadDeMoneda + " " + interpretacionPeso + " " + "equivalen a " + resultado + interpretacionDolar);
                break;
            }
            case 4: {
                System.out.println("Cantidad de pesos a convertir");
                double cantidadDeMoneda = teclado.nextDouble();
                String outputRespuesta = String.valueOf(respuesta).replaceAll("4", "MXN");
                String monedaAConvertir = "EUR";

                String direccion = "https://v6.exchangerate-api.com/v6/9b59d85b1711ba43a923571d/latest/" + outputRespuesta;
                Conversor conversorApi = new Conversor();
                double resultado = conversorApi.llamarAPI(direccion, cantidadDeMoneda, monedaAConvertir);

                String interpretacionPeso = (cantidadDeMoneda > 1) ? "pesos" : "peso";
                String interpretacionDolar = (resultado > 1) ? " euros" : (resultado < 1 ? " de euro" : (resultado == 1 ? " euro" : ""));

                System.out.println(cantidadDeMoneda + " " + interpretacionPeso + " " + "equivalen a " + resultado + interpretacionDolar);
                break;
            }
            case 5: {
                System.out.println("Cantidad de euros a convertir");
                double cantidadDeMoneda = teclado.nextDouble();
                String outputRespuesta = String.valueOf(respuesta).replaceAll("5", "EUR");
                String monedaAConvertir = "USD";

                String direccion = "https://v6.exchangerate-api.com/v6/9b59d85b1711ba43a923571d/latest/" + outputRespuesta;
                Conversor conversorApi = new Conversor();
                double resultado = conversorApi.llamarAPI(direccion, cantidadDeMoneda, monedaAConvertir);

                String interpretacionPeso = (cantidadDeMoneda > 1) ? "dolares" : "dolar";
                String interpretacionDolar = (resultado > 1) ? " euros" : (resultado < 1 ? " de euro" : (resultado == 1 ? " euro" : ""));

                System.out.println(cantidadDeMoneda + " " + interpretacionPeso + " " + "equivalen a " + resultado + interpretacionDolar);
                break;
            }
            case 6: {
                System.out.println("Cantidad de yenes a convertir");
                double cantidadDeMoneda = teclado.nextDouble();
                String outputRespuesta = String.valueOf(respuesta).replaceAll("6", "JPY");
                String monedaAConvertir = "USD";

                String direccion = "https://v6.exchangerate-api.com/v6/9b59d85b1711ba43a923571d/latest/" + outputRespuesta;
                Conversor conversorApi = new Conversor();
                double resultado = conversorApi.llamarAPI(direccion, cantidadDeMoneda, monedaAConvertir);

                String interpretacionPeso = (cantidadDeMoneda > 1) ? "yenes" : "yen";
                String interpretacionDolar = (resultado > 1) ? " dolares" : (resultado < 1 ? " de dolar" : (resultado == 1 ? " dolar" : ""));

                System.out.println(cantidadDeMoneda + " " + interpretacionPeso + " " + "equivalen a " + resultado + interpretacionDolar);
                break;
            }
        }
    }
} catch (InputMismatchException e) {
    System.out.println("Valor incorrecto, vuelva a intentar");
}






    }
}
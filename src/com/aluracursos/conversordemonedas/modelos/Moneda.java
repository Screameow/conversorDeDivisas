package com.aluracursos.conversordemonedas.modelos;

import com.google.gson.annotations.SerializedName;
import java.util.Map;

public class Moneda {

    private String nombreDeMoneda;
    private double cantidadDeMoneda;

    @SerializedName("conversion_rates")
    private Map<String, Double> valorDeMoneda;


    @Override
    public String toString() {
        return "Lista de conversion: " + getValorDeMoneda();
    }

    public String getNombreDeMoneda() {
        return nombreDeMoneda;
    }

    public void setNombreDeMoneda(String nombreDeMoneda) {
        this.nombreDeMoneda = nombreDeMoneda;
    }

    public Map<String, Double> getValorDeMoneda() {
        return valorDeMoneda;
    }

    public void setValorDeMoneda(Map<String, Double> valorDeMoneda) {
        this.valorDeMoneda = valorDeMoneda;
    }

    public double getCantidadDeMoneda() {
        return cantidadDeMoneda;
    }
}

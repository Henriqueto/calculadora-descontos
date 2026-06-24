package com.loja.calculadora_descontos.model;

public class Pedido {
    private String tipoCliente; // "COMUM", "VIP" ou "ANIVERSARIO"
    private double valorTotal;

    public String getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(String tipoCliente) {
        this.tipoCliente = tipoCliente;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }
}

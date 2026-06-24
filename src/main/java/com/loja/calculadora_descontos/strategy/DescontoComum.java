package com.loja.calculadora_descontos.strategy;

public class DescontoComum implements DescontoStrategy {
    @Override
    public double calcular(double valorTotal) {
        return valorTotal; // Sem desconto
    }
}

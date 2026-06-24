package com.loja.calculadora_descontos.strategy;

public class DescontoVIP implements DescontoStrategy {
    @Override
    public double calcular(double valorTotal) {
        return valorTotal * 0.85; // 15% de desconto
    }
}

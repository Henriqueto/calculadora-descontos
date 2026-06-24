package com.loja.calculadora_descontos.strategy;

public class DescontoAniversario implements DescontoStrategy {
    @Override
    public double calcular(double valorTotal) {
        return valorTotal * 0.70; // 30% de desconto
    }
}

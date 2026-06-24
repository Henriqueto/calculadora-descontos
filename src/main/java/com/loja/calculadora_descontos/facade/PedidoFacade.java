package com.loja.calculadora_descontos.facade;

import com.loja.calculadora_descontos.model.Pedido;
import com.loja.calculadora_descontos.strategy.*;
import org.springframework.stereotype.Service;

@Service
public class PedidoFacade {

    public double processarPedido(Pedido pedido) {
        DescontoStrategy strategy;

        // Escolhe a estratégia certa baseada no texto que vier da API
        switch (pedido.getTipoCliente().toUpperCase()) {
            case "VIP":
                strategy = new DescontoVIP();
                break;
            case "ANIVERSARIO":
                strategy = new DescontoAniversario();
                break;
            default:
                strategy = new DescontoComum();
                break;
        }

        // Executa a estratégia escolhida e retorna o valor final
        return strategy.calcular(pedido.getValorTotal());
    }
}
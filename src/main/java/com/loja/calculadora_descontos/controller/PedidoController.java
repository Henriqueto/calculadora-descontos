package com.loja.calculadora_descontos.controller;

import com.loja.calculadora_descontos.facade.PedidoFacade;
import com.loja.calculadora_descontos.model.Pedido;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/pedidos")
public class PedidoController {

    @Autowired
    private PedidoFacade pedidoFacade; // O Spring injeta automaticamente o Singleton da Facade aqui

    @PostMapping("/calcular")
    public double calcularValorFinal(@RequestBody Pedido pedido) {
        return pedidoFacade.processarPedido(pedido);
    }
}
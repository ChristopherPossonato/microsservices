package com.ms.pedido.service;

import com.ms.pedido.model.DadosCliente;
import com.ms.pedido.model.Pedido;
import com.ms.pedido.repository.PedidoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class PedidoService {
  private final FazerPedidoService fazerPedidoService;
  private final PedidoRepository pedidoRepository;

  public Pedido realizarPedido(DadosCliente dadosCliente) {
    var evento = fazerPedidoService.pegarEvento(dadosCliente.getId());
    Pedido pedido = new Pedido();
    pedido.setEvento(evento);
    pedido.setDadosCliente(dadosCliente);
    return pedidoRepository.save(pedido);
  }
}

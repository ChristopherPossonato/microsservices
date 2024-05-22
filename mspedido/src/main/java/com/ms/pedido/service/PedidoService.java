package com.ms.pedido.service;

import com.ms.pedido.model.Pedido;
import com.ms.pedido.repository.PedidoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class PedidoService {
  private final FazerPedidoService fazerPedidoService;
  private final PedidoRepository pedidoRepository;

  public Pedido realizarPedido(Pedido pedido) {

    var evento = fazerPedidoService.pegarEvento(pedido.getIdEvento());

    pedido.setEvento(evento);
    pedido.setDadosCliente(pedido.getDadosCliente());
    return pedidoRepository.save(pedido);
  }
}

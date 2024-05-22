package com.ms.pedido.controller;

import com.ms.pedido.model.Pedido;
import com.ms.pedido.service.PedidoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pedidos")
@RequiredArgsConstructor
public class PedidoController {

  private final PedidoService pedidoService;


  @PostMapping
  public ResponseEntity realizarPedido(@RequestBody Pedido pedido) {

    return ResponseEntity.ok(pedidoService.realizarPedido(pedido));
  }


}

package com.ms.pedido.service;

import com.ms.pedido.model.Evento;
import java.util.List;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "evento", url = "http://localhost:8585/eventos")
public interface FazerPedidoService {

  @GetMapping("/{id}")
  Evento pegarEvento(@PathVariable("id") Long id);

}

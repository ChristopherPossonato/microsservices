package com.ms.evento.aplication.core.service;

import com.ms.evento.adapters.inbound.entity.EventoEntity;
import com.ms.evento.aplication.core.domain.Evento;
import com.ms.evento.aplication.ports.in.ExibirEventoServicePort;
import com.ms.evento.aplication.ports.out.ExibirEventosPort;
import java.util.ArrayList;
import java.util.List;

public class ExibirEventosService implements ExibirEventoServicePort {
  private final ExibirEventosPort exibirEventosPort;

  public ExibirEventosService(ExibirEventosPort exibirEventosPort) {
    this.exibirEventosPort = exibirEventosPort;
  }

  @Override
  public List<Evento> exibirEventos() {

    return exibirEventosPort.exibir();
  }
}

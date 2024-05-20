package com.ms.evento.aplication.core.service;

import com.ms.evento.aplication.core.domain.Evento;
import com.ms.evento.aplication.ports.in.BuscarEventoIdServicePort;
import com.ms.evento.aplication.ports.out.BuscarEventoIdport;

public class BuscarEventoService implements BuscarEventoIdServicePort {

  private final BuscarEventoIdport buscarEventoIdport;

  public BuscarEventoService(BuscarEventoIdport buscarEventoIdport) {
    this.buscarEventoIdport = buscarEventoIdport;
  }

  @Override
  public Evento buscarEventoId(Long id) {
    return buscarEventoIdport.buscarId(id);
  }
}

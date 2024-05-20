package com.ms.evento.aplication.ports.in;

import com.ms.evento.aplication.core.domain.Evento;

public interface BuscarEventoIdServicePort {
  Evento buscarEventoId(Long id);
}

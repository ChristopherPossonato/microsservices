package com.ms.evento.aplication.ports.out;

import com.ms.evento.aplication.core.domain.Evento;

public interface BuscarEventoIdport {
  Evento buscarId(Long id);
}

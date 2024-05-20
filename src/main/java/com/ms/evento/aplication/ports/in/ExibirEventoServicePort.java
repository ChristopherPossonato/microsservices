package com.ms.evento.aplication.ports.in;

import com.ms.evento.aplication.core.domain.Evento;
import java.util.List;

public interface ExibirEventoServicePort {
  List<Evento> exibirEventos();
}

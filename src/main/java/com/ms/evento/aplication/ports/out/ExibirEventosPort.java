package com.ms.evento.aplication.ports.out;

import com.ms.evento.aplication.core.domain.Evento;
import java.util.List;

public interface ExibirEventosPort {
  List<Evento> exibir();
}

package com.ms.evento.adapters.outbound;

import com.ms.evento.adapters.outbound.repository.EventoRepository;
import com.ms.evento.aplication.core.domain.Evento;
import com.ms.evento.aplication.ports.out.BuscarEventoIdport;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class BuscarEventoIdAdapter implements BuscarEventoIdport {
  private final EventoRepository eventoRepository;
  private final ModelMapper modelMapper;
  @Override
  public Evento buscarId(Long id) {
    var eventoEntity = eventoRepository.getReferenceById(id);

    return modelMapper.map(eventoEntity, Evento.class);
  }
}

package com.ms.evento.adapters.outbound;

import com.ms.evento.adapters.inbound.entity.EventoEntity;
import com.ms.evento.adapters.outbound.repository.EventoRepository;
import com.ms.evento.aplication.core.domain.Evento;
import com.ms.evento.aplication.ports.out.ExibirEventosPort;
import java.util.List;
import java.util.stream.Collectors;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class ExibirEventosAdapter implements ExibirEventosPort {
  private final EventoRepository eventoRepository;
  private final ModelMapper modelMapper;
  @Override
  public List<Evento> exibir() {
    List<EventoEntity> listaEventosEntity = eventoRepository.findAll();



    return listaEventosEntity.stream().filter(event -> event.getEventoRealizado() != true)
        .map(e -> modelMapper
            .map(e, Evento.class))
        .collect(Collectors.toList());
  }
}

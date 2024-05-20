package com.ms.evento.adapters.outbound;

import com.ms.evento.adapters.inbound.entity.EventoEntity;
import com.ms.evento.adapters.outbound.repository.EventoRepository;
import com.ms.evento.aplication.core.domain.Evento;
import com.ms.evento.aplication.ports.out.SalvarEventoPort;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class SalvarEventoAdapter implements SalvarEventoPort {

    private final EventoRepository eventoRepository;
    private final ModelMapper modelMapper;


    @Override
    public Evento salvar(Evento evento) {
        var eventoEntity = modelMapper.map(evento, EventoEntity.class);
        eventoRepository.save(eventoEntity);

        return modelMapper.map(eventoEntity, Evento.class);
    }
}

package com.ms.evento.adapters.inbound;

import com.ms.evento.adapters.inbound.request.EventoRequest;
import com.ms.evento.adapters.outbound.response.EventoResponse;
import com.ms.evento.aplication.core.domain.Evento;
import com.ms.evento.aplication.ports.in.BuscarEventoIdServicePort;
import com.ms.evento.aplication.ports.in.ExibirEventoServicePort;
import com.ms.evento.aplication.ports.in.SalvarEventoServicePort;
import jakarta.validation.Valid;
import java.util.List;
import java.util.stream.Collectors;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/eventos")
@RequiredArgsConstructor
@Validated
public class EventoController {

    private final SalvarEventoServicePort salvarEventoServicePort;
    private final ExibirEventoServicePort exibirEventoServicePort;
    private final BuscarEventoIdServicePort buscarEventoIdServicePort;

    private final ModelMapper modelMapper;

    @PostMapping
    public ResponseEntity salvarEvento(@RequestBody @Valid EventoRequest eventoRequest){
        var evento = modelMapper.map(eventoRequest, Evento.class);
        salvarEventoServicePort.salvarEvento(evento);
        return ResponseEntity.ok(evento);
    }

    @GetMapping
    public ResponseEntity exibirEventos(){
        List<Evento> eventos = exibirEventoServicePort.exibirEventos();


        return ResponseEntity.ok(eventos.stream()
            .map(e -> modelMapper
                .map(e, EventoResponse.class))
            .collect(Collectors.toList()));
    }

    @GetMapping("/{id}")
    public ResponseEntity buscarEventoId(@PathVariable("id") Long id) {
        var eventoEntity = buscarEventoIdServicePort.buscarEventoId(id);

        return ResponseEntity.ok(modelMapper.map(eventoEntity, EventoResponse.class));
    }

}

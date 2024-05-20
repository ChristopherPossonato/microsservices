package com.ms.evento.aplication.core.service;

import com.ms.evento.aplication.core.domain.Evento;
import com.ms.evento.aplication.ports.in.SalvarEventoServicePort;
import com.ms.evento.aplication.ports.out.SalvarEventoPort;

public class SalvarEventoService implements SalvarEventoServicePort {
    private final SalvarEventoPort salvarEventoPort;

    public SalvarEventoService(SalvarEventoPort salvarEventoPort) {
        this.salvarEventoPort = salvarEventoPort;
    }

    @Override
    public Evento salvarEvento(Evento evento) {
        evento.setEventoRealizado(false);
        return salvarEventoPort.salvar(evento);
    }
}
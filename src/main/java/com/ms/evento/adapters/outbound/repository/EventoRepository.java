package com.ms.evento.adapters.outbound.repository;

import com.ms.evento.adapters.inbound.entity.EventoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventoRepository extends JpaRepository<EventoEntity, Long> {

}

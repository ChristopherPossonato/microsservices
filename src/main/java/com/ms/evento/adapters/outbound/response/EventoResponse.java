package com.ms.evento.adapters.outbound.response;

import java.time.LocalDate;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EventoResponse {
  private Long id;
  private String nomeEvento;
  private String atracao;
  private String local;
  private LocalDate dataEvento;
  private String descricao;

}
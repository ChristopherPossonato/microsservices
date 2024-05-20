package com.ms.evento.adapters.inbound.request;

import java.time.LocalDate;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EventoRequest {
  private String nomeEvento;
  private String atracao;
  private String local;
  private LocalDate dataEvento;
  private Integer quantidadeIngresso;
  private String descricao;

}

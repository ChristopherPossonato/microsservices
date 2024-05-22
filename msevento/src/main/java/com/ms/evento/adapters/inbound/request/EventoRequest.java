package com.ms.evento.adapters.inbound.request;

import com.ms.evento.aplication.core.exception.validacao.NotPastDate;
import java.math.BigDecimal;
import java.time.LocalDate;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EventoRequest {
  private String nomeEvento;
  private String atracao;
  private String local;
  @NotPastDate(message = "A data do evento não deve estar no passado")
  private LocalDate dataEvento;
  private Integer quantidadeIngresso;
  private String descricao;
  private BigDecimal valorIngresso;
}

package com.ms.evento.adapters.inbound.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import java.time.LocalDate;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "eventos")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class EventoEntity {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String nomeEvento;
  private String atracao;
  private String local;
  private LocalDate dataEvento;
  private Integer quantidadeIngresso;
  private String descricao;
  private Boolean eventoRealizado;

}

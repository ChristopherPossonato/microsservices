package com.ms.evento.aplication.core.domain;

import java.time.LocalDate;

public class Evento {
  private Long id;
  private String nomeEvento;
  private String atracao;
  private String local;
  private LocalDate dataEvento;
  private Integer quantidadeIngresso;
  private String descricao;
  private Boolean eventoRealizado;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Boolean getEventoRealizado() {
    return eventoRealizado;
  }

  public void setEventoRealizado(Boolean eventoRealizado) {
    this.eventoRealizado = eventoRealizado;
  }

  public String getNomeEvento() {
    return nomeEvento;
  }

  public void setNomeEvento(String nomeEvento) {
    this.nomeEvento = nomeEvento;
  }

  public String getAtracao() {
    return atracao;
  }

  public void setAtracao(String atracao) {
    this.atracao = atracao;
  }

  public String getLocal() {
    return local;
  }

  public void setLocal(String local) {
    this.local = local;
  }

  public LocalDate getDataEvento() {
    return dataEvento;
  }

  public void setDataEvento(LocalDate dataEvento) {
    this.dataEvento = dataEvento;
  }

  public Integer getQuantidadeIngresso() {
    return quantidadeIngresso;
  }

  public void setQuantidadeIngresso(Integer quantidadeIngresso) {
    this.quantidadeIngresso = quantidadeIngresso;
  }

  public String getDescricao() {
    return descricao;
  }

  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }
}

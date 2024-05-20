package com.ms.pedido.model;

import jakarta.persistence.Embeddable;

@Embeddable
public record Evento(
    String nomeEvento,
    String atracao,
    String local,
    String dataEvento,
    String descricao
) {

}

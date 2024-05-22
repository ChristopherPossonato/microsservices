package com.ms.pedido.model;

import jakarta.persistence.Embeddable;
import java.math.BigDecimal;

@Embeddable
public record Evento(
    String nomeEvento,
    String atracao,
    String local,
    String dataEvento,
    String descricao,
    BigDecimal valorIngresso
) {

}

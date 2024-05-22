package com.ms.evento.aplication.core.exception.validacao;

public class EventNotFoundException extends RuntimeException {
    public EventNotFoundException(String message) {
        super(message);
    }
}

package com.ms.evento.aplication.core.exception;

import java.util.List;

public class ErrorResponse {

    private String mensagem;
    private List<ValidacaoErros> erros;

    public ErrorResponse(String mensagem, List<ValidacaoErros> erros) {
        this.mensagem = mensagem;
        this.erros = erros;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public List<ValidacaoErros> getErros() {
        return erros;
    }

    public void setErros(List<ValidacaoErros> erros) {
        this.erros = erros;
    }

    public static class ValidacaoErros {
        private String campo;
        private String message;

        public ValidacaoErros(String campo, String message) {
            this.campo = campo;
            this.message = message;
        }

        public String getCampo() {
            return campo;
        }

        public void setCampo(String campo) {
            this.campo = campo;
        }

        public String getMessage() {
            return message;
        }

        public void setMessage(String message) {
            this.message = message;
        }
    }
}

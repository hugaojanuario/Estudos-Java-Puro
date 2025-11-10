package br.com.hugoflix.exception;

public class ErroCompilacaoAnoException extends RuntimeException {
    private String mensage;

    public ErroCompilacaoAnoException(String mensage) {
        this.mensage = mensage;
    }

    public String getMensage() {
        return mensage;
    }
}

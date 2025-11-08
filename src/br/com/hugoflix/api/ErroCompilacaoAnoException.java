package br.com.hugoflix.api;

public class ErroCompilacaoAnoException extends RuntimeException {
    private String mensage;

    public ErroCompilacaoAnoException(String mensage) {
        this.mensage = mensage;
    }

    public String getMensage() {
        return mensage;
    }
}

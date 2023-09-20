package br.com.brenonoccioli.casadocodigo.Exception;

public class ErrorResponse {

    private String campo;
    private String erro;

    public ErrorResponse(String campo, String erro) {
        this.campo = campo;
        this.erro = erro;
    }

    public String getCampo() {
        return campo;
    }

    public String getErro() {
        return erro;
    }
}

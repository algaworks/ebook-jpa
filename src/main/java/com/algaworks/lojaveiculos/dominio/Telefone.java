package com.algaworks.lojaveiculos.dominio;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Telefone {

    @Column(length = 3, nullable = false)
    private String prefixo;

    @Column(length = 20, nullable = false)
    private String numero;

    @Column(length = 5)
    private String ramal;

    public Telefone() {
    }

    public Telefone(String prefixo, String numero, String ramal) {
        this.prefixo = prefixo;
        this.numero = numero;
        this.ramal = ramal;
    }

    public String getPrefixo() {
        return prefixo;
    }

    public void setPrefixo(String prefixo) {
        this.prefixo = prefixo;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getRamal() {
        return ramal;
    }

    public void setRamal(String ramal) {
        this.ramal = ramal;
    }
}

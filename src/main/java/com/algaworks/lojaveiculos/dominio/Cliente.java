package com.algaworks.lojaveiculos.dominio;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "cliente")
public class Cliente extends Pessoa {

    @Column(name = "limite_credito", nullable = true)
    private BigDecimal limiteCredito;

    @Column(name = "renda_mensal", nullable = true)
    private BigDecimal rendaMensal;

    @Column(nullable = true)
    private boolean bloqueado;

    public BigDecimal getLimiteCredito() {
        return limiteCredito;
    }

    public void setLimiteCredito(BigDecimal limiteCredito) {
        this.limiteCredito = limiteCredito;
    }

    public BigDecimal getRendaMensal() {
        return rendaMensal;
    }

    public void setRendaMensal(BigDecimal rendaMensal) {
        this.rendaMensal = rendaMensal;
    }

    public boolean isBloqueado() {
        return bloqueado;
    }

    public void setBloqueado(boolean bloqueado) {
        this.bloqueado = bloqueado;
    }
}

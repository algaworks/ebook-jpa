package com.algaworks.lojaveiculos.dto;

public class TotalCarroPorAno {

    private Integer anoFabricacao;
    private Double mediaPreco;
    private Long quantidadeCarros;

    public TotalCarroPorAno(Integer anoFabricacao, Double mediaPreco,
                            Long quantidadeCarros) {
        super();
        this.anoFabricacao = anoFabricacao;
        this.mediaPreco = mediaPreco;
        this.quantidadeCarros = quantidadeCarros;
    }

    public Integer getAnoFabricacao() {
        return anoFabricacao;
    }

    public Double getMediaPreco() {
        return mediaPreco;
    }

    public Long getQuantidadeCarros() {
        return quantidadeCarros;
    }
}

package com.algaworks.lojaveiculos.dominio;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "tab_veiculo")
@NamedQueries({
        @NamedQuery(name = "Veiculo.comProprietarioPorValor",
                query = "select v from Veiculo v "
                        + "inner join fetch v.proprietario where v.valor > :valor"),
        @NamedQuery(name = "Veiculo.porModelo",
                query = "select v from Veiculo v where modelo like :modelo")
})
public class Veiculo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigo;

    @Column(length = 60, nullable = false)
    private String fabricante;

    @Column(length = 60, nullable = false)
    private String modelo;

    @Column(name = "ano_fabricacao", nullable = false)
    private Integer anoFabricacao;

    @Column(name = "ano_modelo", nullable = false)
    private Integer anoModelo;

    @Column(precision = 10, scale = 2, nullable = true)
    private BigDecimal valor;

    @Column(name = "tipo_combustivel", nullable = false)
    @Enumerated(EnumType.STRING)
    private TipoCombustivel tipoCombustivel;

    @Column(name = "data_cadastro", nullable = false)
    private LocalDate dataCadastro;

    @Transient
    private String descricaoCompleta;

    @Lob
    private String especificacoes;

    @Lob
    private byte[] foto;

    @ManyToOne
    @JoinColumn(name = "proprietario_codigo")
    private Proprietario proprietario;

    @ManyToMany
    @JoinTable(name = "veiculo_acessorio",
            joinColumns = @JoinColumn(name = "veiculo_codigo"),
            inverseJoinColumns = @JoinColumn(name = "acessorio_codigo"))
    private Set<Acessorio> acessorios = new HashSet<>();

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Integer getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(Integer anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public Integer getAnoModelo() {
        return anoModelo;
    }

    public void setAnoModelo(Integer anoModelo) {
        this.anoModelo = anoModelo;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public TipoCombustivel getTipoCombustivel() {
        return tipoCombustivel;
    }

    public void setTipoCombustivel(TipoCombustivel tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    }

    public LocalDate getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(LocalDate dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public String getDescricaoCompleta() {
        return descricaoCompleta;
    }

    public void setDescricaoCompleta(String descricaoCompleta) {
        this.descricaoCompleta = descricaoCompleta;
    }

    public String getEspecificacoes() {
        return especificacoes;
    }

    public void setEspecificacoes(String especificacoes) {
        this.especificacoes = especificacoes;
    }

    public byte[] getFoto() {
        return foto;
    }

    public void setFoto(byte[] foto) {
        this.foto = foto;
    }

    public Proprietario getProprietario() {
        return proprietario;
    }

    public void setProprietario(Proprietario proprietario) {
        this.proprietario = proprietario;
    }

    public Set<Acessorio> getAcessorios() {
        return acessorios;
    }

    public void setAcessorios(Set<Acessorio> acessorios) {
        this.acessorios = acessorios;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Veiculo veiculo = (Veiculo) o;
        return codigo != null ? codigo.equals(veiculo.codigo) : veiculo.codigo == null;
    }

    @Override
    public int hashCode() {
        return codigo != null ? codigo.hashCode() : 0;
    }
}

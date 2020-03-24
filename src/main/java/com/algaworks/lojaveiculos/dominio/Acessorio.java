package com.algaworks.lojaveiculos.dominio;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "acessorio")
public class Acessorio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigo;

    @Column(length = 60, nullable = false)
    private String descricao;

    @ManyToMany(mappedBy = "acessorios")
    private Set<Veiculo> veiculos = new HashSet<>();

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Set<Veiculo> getVeiculos() {
        return veiculos;
    }

    public void setVeiculos(Set<Veiculo> veiculos) {
        this.veiculos = veiculos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Acessorio acessorio = (Acessorio) o;

        return codigo != null ? codigo.equals(acessorio.codigo) : acessorio.codigo == null;
    }

    @Override
    public int hashCode() {
        return codigo != null ? codigo.hashCode() : 0;
    }
}
